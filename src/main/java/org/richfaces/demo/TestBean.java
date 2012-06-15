package org.richfaces.demo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
* @author <a href="mailto:jpapouse@redhat.com">jpapouse</a>
*/
@ManagedBean
@ViewScoped
public class TestBean {

    private List<Node> roots;

    @PostConstruct
    public void init() {
        roots = new ArrayList<Node>();
        for (String root : new String[]{"1", "2", "3"}) {
            List<Node> second = new ArrayList<Node>();
            for (String label : new String[]{"A", "B", "C", "D"}) {
                List<Node> third = new ArrayList<Node>();
                for (String l : new String[]{"a", "b", "c", "d"}) {
                    third.add(new Node(label + "-" + l, null));
                }
                second.add(new Node(label, third));
            }
            roots.add(new Node("Root " + root, second));
        }
    }

    public List<Node> getRoots() {
        return roots;
    }

}