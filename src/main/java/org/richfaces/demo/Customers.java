package org.richfaces.demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.richfaces.component.SortOrder;

@ManagedBean
@ViewScoped
public class Customers implements Serializable {

    private List<Customer> model;
    private String sortBy = "name";
    private SortOrder sortOrder = SortOrder.ascending;

    @PostConstruct
    public void init() {
        model = new ArrayList<Customer>();
        model.add(new Customer("Sigmund Freud", 1));
        model.add(new Customer("Franta Uzivatel", 2));
        model.add(new Customer("Al Bunda", 3));
    }

    public List<Customer> getModel() {
        return model;
    }

    public String getSortBy() {
        return sortBy;
    }

    public SortOrder getSortOrder() {
        return sortOrder;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }

    public static class Customer implements Serializable {

        private String name;
        private int code;

        public Customer(String name, int code) {
            this.name = name;
            this.code = code;
        }

        public int getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

    }

}
