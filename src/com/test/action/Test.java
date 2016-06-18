package com.test.action;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class Test extends ActionSupport {
 private List<String> countryList;
 private List<String> stateList;
 private List<String> cityList;
 private String state;
 private String country;
 private String city;
 private String result;

  public String myCustomMethod() {
  
  countryList = new ArrayList<String>();
  stateList = new ArrayList<String>();
  cityList = new ArrayList<String>();
  
  countryList.add("India");
  countryList.add("US");
  countryList.add("Japan");

   if (country != null) {
   if (country.equals("India")) {
    stateList.add("Gujarat");
    stateList.add("Maharashtra");
    stateList.add("Delhi");
   } else if (country.equals("US")) {
    stateList.add("Washington");
    stateList.add("NJ");
    stateList.add("NY");
   } else if (country.equals("Japan")) {
    stateList.add("Tokyo");
    stateList.add("Kagoshima");

    }
  }

   if (state != null) {
   if (state.equals("Gujarat")) {
    cityList.add("Ahmedabad");
    cityList.add("Surat");
   } else if (state.equals("Maharashtra")) {
    cityList.add("Mumbai");
    cityList.add("Pune");
   }
  }
  result = "success";
  return result;
 }

  public List<String> getCountryList() {
  return countryList;
 }

  public void setCountryList(List<String> countryList) {
  this.countryList = countryList;
 }

  public String getResult() {
  return result;
 }

  public void setResult(String result) {
  this.result = result;
 }

  public String getCountry() {
  return country;
 }

  public void setCountry(String country) {
  this.country = country;
 }

  public List<String> getStateList() {
  return stateList;
 }

  public void setStateList(List<String> stateList) {
  this.stateList = stateList;
 }

  public String getState() {
  return state;
 }

  public void setState(String state) {
  this.state = state;
 }

  public List<String> getCityList() {
  return cityList;
 }

  public void setCityList(List<String> cityList) {
  this.cityList = cityList;
 }

  public String getCity() {
  return city;
 }

  public void setCity(String city) {
  this.city = city;
 }
}
