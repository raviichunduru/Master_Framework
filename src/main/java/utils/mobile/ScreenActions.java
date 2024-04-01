package utils.mobile;

import driver.DriverManager;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import utils.web.PageActions;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class ScreenActions {

  public static void scrollForMobile(By by) {
    String previousPageSource = "";
    while (!isElementPresent(by) && isNotEndOfPage(previousPageSource)) {
      previousPageSource = DriverManager.getDriver().getPageSource();
      performScroll();
    }
    if (isElementPresent(by)) {
      PageActions.waitAndClick(by);
    }
  }

  private static boolean isElementPresent(By by) {
    List<WebElement> elements = DriverManager.getDriver().findElements(by);
    if (elements.isEmpty()) {
      return false;
    }
   /* if (!elements.isEmpty()) {
      return elements.get(0).getAttribute("visible").equalsIgnoreCase("false");
    }*/
    return true;
  }

  private static boolean isNotEndOfPage(String previousPageSource) {
    return !previousPageSource.equals(DriverManager.getDriver().getPageSource());
  }

  private static void performScroll() {
    Dimension size = DriverManager.getDriver().manage().window().getSize();
    int startX = size.getWidth() / 2;
    int endX = size.getWidth() / 2;
    int startY = size.getHeight() / 2;
    int endY = (int) (size.getHeight() * 0.25);

    PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "first-finger");
    Sequence sequence = new Sequence(finger, 0)
      .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
      .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
      .addAction(finger.createPointerMove(Duration.ofMillis(300), PointerInput.Origin.viewport(), endX, endY))
      .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

    ((AppiumDriver) (DriverManager.getDriver())).perform(Collections.singletonList(sequence));
  }
}

