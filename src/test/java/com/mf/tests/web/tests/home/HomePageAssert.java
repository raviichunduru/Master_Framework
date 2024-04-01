package com.mf.tests.web.tests.home;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.SoftAssertions;
import pages.web.validators.HomePageValidator;

public class HomePageAssert extends AbstractAssert<HomePageAssert, HomePageValidator> {

  private final SoftAssertions softAssertions;

  private HomePageAssert(HomePageValidator homePageValidator) {
    super(homePageValidator, HomePageAssert.class);
    softAssertions = new SoftAssertions();
  }

  public static HomePageAssert assertThat(HomePageValidator homePageValidator) {
    return new HomePageAssert(homePageValidator);
  }

  public HomePageAssert dashBoardIsHeaderType(String expectedHeaderName) {
    String actualHeaderName = actual.getDashBoardFiledType();
    softAssertions.assertThat(actualHeaderName)
      .isEqualTo(expectedHeaderName);
    return this;
  }

  public HomePageAssert logoSourceStringContains(String expectedLogoSourceString) {
    String actualLogoSourceText = actual.getLogoSourceString();
    softAssertions.assertThat(actualLogoSourceText)
      .contains(expectedLogoSourceString);
    return this;
  }

  public HomePageAssert isHelpButtonPresent() {
    softAssertions.assertThat(actual.isHelpButtonPresence())
      .withFailMessage(() -> "Help button not present")
      .isTrue();
    return this;
  }

  public void assertAll() {
    softAssertions.assertAll();
  }

}
