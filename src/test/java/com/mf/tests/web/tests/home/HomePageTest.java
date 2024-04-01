package com.mf.tests.web.tests.home;

import com.mf.tests.web.base.WebBase;
import org.junit.jupiter.api.Test;
import pages.web.LoginPage;
import pages.web.validators.HomePageValidator;

public class HomePageTest extends WebBase {

  @Test
  public void testHomePageComponents ()
  {
    HomePageValidator homePageValidator = new LoginPage()
              .loginToApplication("Admin", "admin123")
              .getHomePageValidator();

    HomePageAssert.assertThat(homePageValidator)
              .logoSourceStringContains("/web/images/orangehrm-logo.png?v=1706326081969")
              .isHelpButtonPresent()
              .dashBoardIsHeaderType("h6")
              .assertAll();
  }
}
