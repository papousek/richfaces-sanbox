package org.richfaces.demo;

import java.io.Serializable;
import java.util.Date;
import java.util.TimeZone;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ValueChangeEvent;

@ViewScoped
@ManagedBean
public class TestBean implements Serializable {

    private Date value;
    public static final TimeZone TIME_ZONE = TimeZone.getTimeZone("UTC");

    public TimeZone getTimeZone() {
        return TIME_ZONE;
    }

    public Date getValue() {
        return value;
    }

    public void setValue(Date value) {
        this.value = value;
    }

}
