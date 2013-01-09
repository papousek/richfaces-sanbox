/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.richfaces.demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

@SessionScoped
@ManagedBean
public class TestBean implements Serializable {

    public List<SelectItem> getValues() {

        List<SelectItem> items = new ArrayList<SelectItem>();
        for (int j = 1; j <= 7; ++j) {
            SelectItem item = new SelectItem(j, String.valueOf(j));
            items.add(item);
        }
        return items;
    }
}
