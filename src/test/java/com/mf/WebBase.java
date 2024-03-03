package com.mf;

import driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static driver.Driver.initDriver;

public class WebBase {

  @BeforeMethod
  public void setUp ()
  {
    initDriver();
  }

  @AfterMethod
  public void tearDown ()
  {
    Driver.quitDriver();
  }
}
