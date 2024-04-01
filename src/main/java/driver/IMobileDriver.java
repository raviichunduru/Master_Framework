package driver;

import driver.entity.MobileDriverData;
import driver.entity.WebDriverData;
import org.openqa.selenium.WebDriver;

public interface IMobileDriver {

  WebDriver getDriver (MobileDriverData mobileDriverData);
}
