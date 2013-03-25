package org.richfaces.demo;

import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class TestBean {

    private final List<Person> people = Arrays.asList(
            new Person("Franta", "Novak"),
            new Person("Pepa", "Jirousek"),
            new Person("Anicka", "Stastna"));

    public List<Person> getPeople() {
        return people;
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
