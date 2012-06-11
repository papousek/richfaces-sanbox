package org.richfaces.demo;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.richfaces.event.ItemChangeEvent;

/**
 * @author <a href="mailto:jpapouse@redhat.com">Jan Papousek</a>
 */
@ApplicationScoped
@ManagedBean
public class TestBean {

    public void listen(ItemChangeEvent event) {
        System.out.println(event.getOldItemName() + " ---> " + event.getNewItemName());
    }

}
