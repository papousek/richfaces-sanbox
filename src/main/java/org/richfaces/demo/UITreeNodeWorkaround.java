package org.richfaces.demo;

import org.richfaces.component.UITreeNode;

public class UITreeNodeWorkaround extends UITreeNode {

    enum PropertyKeys {

        iterationState
    }

    @Override
    public Object getIterationState() {
        return getStateHelper().get(PropertyKeys.iterationState);
    }

    @Override
    public void setIterationState(Object state) {
        getStateHelper().put(PropertyKeys.iterationState, state);
    }
}