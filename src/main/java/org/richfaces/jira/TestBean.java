package org.richfaces.jira;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.ListDataModel;

/**
 * @author Nicolas Daniels
 */
@ManagedBean(name="testBean")
@SessionScoped
public class TestBean {

	private int page1 = 1;
	private int rows1 = 5;
    private int page2 = 1;
	private int rows2 = 5;

	private ListDataModel<String> datamodel1 = new ListDataModel<String>();
    private ListDataModel<String> datamodel2 = new ListDataModel<String>();

	@PostConstruct
	public void init() {
		List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

		for (int i = 0; i < 23; i++) {
			list1.add("element " + i);
            list2.add("element " + i);
		}

		datamodel1.setWrappedData(list1);
        datamodel2.setWrappedData(list2);
	}

	public int getPage1() {
		return page1;
	}

	public void setPage1(int page) {
		this.page1 = page;
	}

	public int getRows1() {
		return rows1;
	}

	public void setRows1(int rows) {
		this.rows1 = rows;
	}

	public ListDataModel<String> getDatamodel1() {
		return datamodel1;
	}

	public int getPage2() {
		return page2;
	}

	public void setPage2(int page) {
		this.page2 = page;
	}

	public int getRows2() {
		return rows2;
	}

	public void setRows2(int rows) {
		this.rows2 = rows;
	}

	public ListDataModel<String> getDatamodel2() {
		return datamodel2;
	}

}
