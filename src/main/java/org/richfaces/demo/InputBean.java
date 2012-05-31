package org.richfaces.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@ViewScoped
@ManagedBean
public class InputBean {

    public static final TimeZone TIME_ZONE = TimeZone.getTimeZone("UTC");
    private List<String> cities = Arrays.asList("London", "Prague");

    private Date date1;
    private Date date2;
    private Date date3;
    private Date date4;

    private String autocompleteValue1;
    private String autocompleteValue2;
    private String autocompleteValue3;
    private String autocompleteValue4;

    private String inplaceInputValue1;
    private String inplaceInputValue2;
    private String inplaceInputValue3;
    private String inplaceInputValue4;

    private String inplaceSelectValue1;
    private String inplaceSelectValue2;

    private int inputNumberSliderValue1;
    private int inputNumberSliderValue2;

    private int inputNumberSpinnerValue1;
    private int inputNumberSpinnerValue2;
    private int inputNumberSpinnerValue3;

    private String selectValue1;
    private String selectValue2;

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    @Future
    @NotNull
    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    @Future
    @NotNull
    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    @Future
    @NotNull
    public Date getDate3() {
        return date3;
    }

    public void setDate3(Date date3) {
        this.date3 = date3;
    }

    @Future
    @NotNull
    public Date getDate4() {
        return date4;
    }

    public void setDate4(Date date4) {
        this.date4 = date4;
    }

    public TimeZone getTimeZone() {
        return TIME_ZONE;
    }

    public List<String> autocomplete(String prefix) {
        List<String> result = new ArrayList<String>();
        if (prefix == null || prefix.isEmpty()) {
            result.addAll(cities);
            return result;
        }
        for (String city: cities) {
            if (city.toLowerCase().startsWith(prefix.toLowerCase())) {
                result.add(city);
            }
        }
        return result;
    }

    @Pattern(regexp="Prague")
    public String getAutocompleteValue1() {
        return autocompleteValue1;
    }

    public void setAutocompleteValue1(String autocompleteValue1) {
        this.autocompleteValue1 = autocompleteValue1;
    }

    @Pattern(regexp="Prague")
    public String getAutocompleteValue2() {
        return autocompleteValue2;
    }

    public void setAutocompleteValue2(String autocompleteValue2) {
        this.autocompleteValue2 = autocompleteValue2;
    }

    @Pattern(regexp="Prague")
    public String getAutocompleteValue3() {
        return autocompleteValue3;
    }

    public void setAutocompleteValue3(String autocompleteValue3) {
        this.autocompleteValue3 = autocompleteValue3;
    }

    @Pattern(regexp="Prague")
    public String getAutocompleteValue4() {
        return autocompleteValue4;
    }

    public void setAutocompleteValue4(String autocompleteValue4) {
        this.autocompleteValue4 = autocompleteValue4;
    }

    @Pattern(regexp="Prague")
    public String getInplaceInputValue1() {
        return inplaceInputValue1;
    }

    @Pattern(regexp="Prague")
    public String getInplaceInputValue2() {
        return inplaceInputValue2;
    }

    @Pattern(regexp="Prague")
    public String getInplaceInputValue3() {
        return inplaceInputValue3;
    }

    @Pattern(regexp="Prague")
    public String getInplaceInputValue4() {
        return inplaceInputValue4;
    }

    public void setInplaceInputValue1(String inplaceInputValue1) {
        this.inplaceInputValue1 = inplaceInputValue1;
    }

    public void setInplaceInputValue2(String inplaceInputValue2) {
        this.inplaceInputValue2 = inplaceInputValue2;
    }

    public void setInplaceInputValue3(String inplaceInputValue3) {
        this.inplaceInputValue3 = inplaceInputValue3;
    }

    public void setInplaceInputValue4(String inplaceInputValue4) {
        this.inplaceInputValue4 = inplaceInputValue4;
    }

    @Pattern(regexp="Prague")
    public String getInplaceSelectValue1() {
        return inplaceSelectValue1;
    }

    @Pattern(regexp="Prague")
    public String getInplaceSelectValue2() {
        return inplaceSelectValue2;
    }

    public void setInplaceSelectValue1(String inplaceSelectValue1) {
        this.inplaceSelectValue1 = inplaceSelectValue1;
    }

    public void setInplaceSelectValue2(String inplaceSelectValue2) {
        this.inplaceSelectValue2 = inplaceSelectValue2;
    }

    @Min(6)
    public int getInputNumberSliderValue1() {
        return inputNumberSliderValue1;
    }

    @Min(6)
    public int getInputNumberSliderValue2() {
        return inputNumberSliderValue2;
    }

    public void setInputNumberSliderValue1(int inputNumberSliderValue1) {
        this.inputNumberSliderValue1 = inputNumberSliderValue1;
    }

    public void setInputNumberSliderValue2(int inputNumberSliderValue2) {
        this.inputNumberSliderValue2 = inputNumberSliderValue2;
    }

    @Min(6)
    public int getInputNumberSpinnerValue1() {
        return inputNumberSpinnerValue1;
    }

    @Min(6)
    public int getInputNumberSpinnerValue2() {
        return inputNumberSpinnerValue2;
    }

    @Min(6)
    public int getInputNumberSpinnerValue3() {
        return inputNumberSpinnerValue3;
    }

    public void setInputNumberSpinnerValue1(int inputNumberSpinnerValue1) {
        this.inputNumberSpinnerValue1 = inputNumberSpinnerValue1;
    }

    public void setInputNumberSpinnerValue2(int inputNumberSpinnerValue2) {
        this.inputNumberSpinnerValue2 = inputNumberSpinnerValue2;
    }

    public void setInputNumberSpinnerValue3(int inputNumberSpinnerValue3) {
        this.inputNumberSpinnerValue3 = inputNumberSpinnerValue3;
    }

    @Pattern(regexp="Prague")
    public String getSelectValue1() {
        return selectValue1;
    }

    @Pattern(regexp="Prague")
    public String getSelectValue2() {
        return selectValue2;
    }

    public void setSelectValue1(String selectValue1) {
        this.selectValue1 = selectValue1;
    }

    public void setSelectValue2(String selectValue2) {
        this.selectValue2 = selectValue2;
    }
}