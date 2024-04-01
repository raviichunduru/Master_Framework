package com.mf.tests.mobile.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static driver.Driver.initDriverForMobile;
import static driver.Driver.initDriverForWeb;
import static driver.Driver.quitDriver;

public class MobileBase {

  @BeforeEach
  public void setUp ()
  {
    initDriverForMobile();
  }

  @AfterEach
  public void tearDown ()
  {
    quitDriver();
  }
}
