package org.richfaces.demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author <a href="mailto:jpapouse@redhat.com">Jan Papousek</a>
 */
@ManagedBean
@ViewScoped
public class TestBean implements Serializable {

    private List<Pair> model1;
    private List<Pair> model2;

    @PostConstruct
    public void init() {
        model1 = new ArrayList<Pair>();
        model2 = new ArrayList<Pair>();
        for (int i=0; i<100; i++) {
            model1.add(new Pair("[1] first " + i, "[1] second " + i + ": Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec at orci nec tortor venenatis convallis."));
            model2.add(new Pair("[2] first " + i, "[2] second " + i + ": Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec at orci nec tortor venenatis convallis."));
        }
    }

    public List<Pair> getModel1() {
        return model1;
    }

    public List<Pair> getModel2() {
        return model2;
    }

    public void setModel1(List<Pair> model1) {
        this.model1 = model1;
    }

    public void setModel2(List<Pair> model2) {
        this.model2 = model2;
    }

    public static class Pair {
        private String first;
        private String second;

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        public String getFirst() {
            return first;
        }

        public String getSecond() {
            return second;
        }
    }

}
