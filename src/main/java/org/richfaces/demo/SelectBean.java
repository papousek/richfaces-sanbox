package org.richfaces.demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@ViewScoped
public class SelectBean implements Serializable {

    private List<SelectItem> values;
    private String value1;
    private String value2;

    @PostConstruct
    public void init() {
        values = new ArrayList<SelectItem>();
        for (String s: new String[] {"a", "b", "c", "d"}) {
            values.add(new SelectItem(s));
        }
    }

    public List<SelectItem> getValues() {
        return values;
    }

    public String getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

}
