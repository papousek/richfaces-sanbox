package org.richfaces.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:jpapouse@redhat.com">jpapouse</a>
 */
public class Node {

    private List<Node> children;
    private String label;

    public Node(String label, List<Node> children) {
        this.label = label;
        this.children = children;
    }

    public synchronized List<Node> getChildren() {
        if (children == null) {
            children = new ArrayList<Node>();
        }
        return children;
    }

    public String getLabel() {
        return label;
    }

}
