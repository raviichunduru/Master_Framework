package com.mf.tests.mobile.tests;

import com.mf.tests.mobile.base.MobileBase;
import org.junit.jupiter.api.Test;
import pages.mobile.HomeScreen;

public class MobileTest extends MobileBase {

  @Test
  public void mobileTest() {

    HomeScreen.getHomeScreen()
              .navigateToViewsScreen()
              .clickViewScreenElement("Picker");
  }
}
