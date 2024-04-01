package pages.mobile;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import utils.web.PageActions;

public class HomeScreen {

  private HomeScreen() {}

  private static final By VIEWS = AppiumBy.accessibilityId("Views");

  public static HomeScreen getHomeScreen()
  {
    return new HomeScreen();
  }

  public ViewsScreen navigateToViewsScreen()
  {
    PageActions.waitAndClick(VIEWS);
    return new ViewsScreen();
  }

}
