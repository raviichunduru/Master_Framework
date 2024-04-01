package driver.manager.web.local;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class FireFoxManager {

  private FireFoxManager () {}

  public static FirefoxDriver getDriver()
  {
    //WebDriverManager.firefoxdriver().setup();
    return new FirefoxDriver();
  }
}
