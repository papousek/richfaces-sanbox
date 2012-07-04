package org.richfaces.demo;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ValueChangeEvent;

@ViewScoped
@ManagedBean
public class TestBean implements Serializable {

    private Date value;

    public Date getValue() {
        return value;
    }

    public void setValue(Date value) {
        this.value = value;
    }

    public void valueChangeListener(ValueChangeEvent event) {
        System.out.println(event.getOldValue() + " ----> " + event.getNewValue());
    }

}
