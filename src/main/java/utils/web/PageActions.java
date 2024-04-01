package utils.web;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public final class PageActions {

  private PageActions () {}

  public static void waitAndClick (By by)
  {
    WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofMillis(3000));
    wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
  }

  public static void waitAndSendKeys (By by, String value)
  {
    if(Objects.nonNull(value))
    {
      WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofMillis(3000));
      wait.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(value);
    }
  }

  public static WebElement getElement (By by)
  {
    WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofMillis(3000));
    return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
  }

  public static String getElementText (By by)
  {
    return getElement(by).getText();
  }

  public static String getAttibute(By by, Function<WebElement,String> attributeFunction)
  {
    return attributeFunction.apply(getElement(by));
  }

  public static String getType(By by, Function<WebElement,String> typeFunction)
  {
    return typeFunction.apply(getElement(by));
  }

  public static boolean isPresent(By by, Predicate<WebElement> elementPredicate)
  {
    return elementPredicate.test(DriverManager.getDriver().findElement(by));
  }
}
