package org.richfaces.demo;

import java.util.Date;
import java.util.TimeZone;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class CalendarBean {

    private Date date;
    public static final TimeZone TIME_ZONE = TimeZone.getTimeZone("UTC");

    public TimeZone getTimeZone() {
        return TIME_ZONE;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
