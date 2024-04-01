package com.mf.tests.web.base;

import driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static driver.Driver.initDriverForMobile;
import static driver.Driver.initDriverForWeb;
import static driver.Driver.quitDriver;

public class WebBase {

  @BeforeEach
  public void setUp ()
  {
    initDriverForWeb();
  }

  @AfterEach
  public void tearDown ()
  {
    quitDriver();
  }
}
