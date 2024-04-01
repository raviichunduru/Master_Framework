package com.mf.tests;

import pojo.UserData;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class Runner {

  public static void main(String[] args) {

    UserData allValues  = UserData.builder().setEmployeeName("employee name").setUserName("user name").setPassword("password").build();
    //UserData employeeNameOnly  = UserData.builder().setEmployeeName("employee name").setUserName("").setPassword("").build();
    //UserData userNameOnly  = UserData.builder().setEmployeeName("").setUserName("user name").setPassword("").build();

    UserData employeeNameOnly  = UserData.builder().setEmployeeName("employee name").build();
    UserData userNameOnly  = UserData.builder().setUserName("user name").build();

    System.out.println(allValues);
    System.out.println(employeeNameOnly);
    System.out.println(userNameOnly);
  }
}
