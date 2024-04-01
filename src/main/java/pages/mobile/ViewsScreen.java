package pages.mobile;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import utils.web.PageActions;

public class ViewsScreen {

  //private ViewsScreen() {}

  private static final String VIEW_SCREEN_ELEMENT = "%s";

  public void clickViewScreenElement (String value)
  {
    By ViewScreenElement = AppiumBy.accessibilityId(String.format(VIEW_SCREEN_ELEMENT, value));
    utils.mobile.ScreenActions.scrollForMobile(ViewScreenElement);
  }
}

