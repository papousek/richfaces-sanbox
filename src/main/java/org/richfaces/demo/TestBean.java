package org.richfaces.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;
import org.richfaces.component.UIExtendedDataTable;

@ManagedBean
@ViewScoped
public class TestBean {

    private final List<Person> people = Arrays.asList(
            new Person("Franta", "Novak"),
            new Person("Pepa", "Jirousek"),
            new Person("Anicka", "Stastna"));

    private Collection<Object> selection;

    private String state;

    public List<Person> getPeople() {
        return people;
    }

    public String getState() {
        return state;
    }

    public Collection<Object> getSelection() {
        return selection;
    }

    public void setSelection(Collection<Object> selection) {
        this.selection = selection;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void selectionListener(AjaxBehaviorEvent event) {
        System.out.println("SELECTION LISTENER");
    }

    public static class Person {
        private final String firstname;
        private final String secondname;

        public Person(String firstname, String secondname) {
            this.firstname = firstname;
            this.secondname = secondname;
        }

        public String getFirstname() {
            return firstname;
        }

        public String getSecondname() {
            return secondname;
        }
    }

}
