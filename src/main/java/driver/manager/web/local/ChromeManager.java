package driver.manager.web.local;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public final class ChromeManager {

  private ChromeManager () {}

  public static ChromeDriver getDriver()
  {
    //WebDriverManager.chromedriver().setup();
    return new ChromeDriver();
  }
}
