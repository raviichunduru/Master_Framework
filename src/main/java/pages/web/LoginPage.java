package pages.web;

import org.openqa.selenium.By;
import pages.web.pagecomponents.home.LeftMenuComponent;
import pages.web.pagecomponents.home.TopMenuComponent;

import static utils.web.PageActions.waitAndClick;
import static utils.web.PageActions.waitAndSendKeys;

public class LoginPage {

  private static final By USER_NAME_TEXT_BOX = By.xpath("//input[@name='username']");
  private static final By PASSWORD_TEXT_BOX =  By.xpath("//input[@name='password']");
  private static final By LOGIN_BUTTON = By.xpath("//button[@type='submit']");

  private LoginPage setUSER_NAME_TEXT_BOX(String userName) {
    waitAndSendKeys(USER_NAME_TEXT_BOX,userName);
    return this;
  }

  private LoginPage setPASSWORD_TEXT_BOX(String password) {
    waitAndSendKeys(PASSWORD_TEXT_BOX,password);
    return this;
  }

  private HomePage setLOGIN_BUTTON() {
    waitAndClick(LOGIN_BUTTON);
    return new HomePage(new TopMenuComponent(), new LeftMenuComponent());
  }

  public HomePage loginToApplication (String userName, String password)
  {
    return setUSER_NAME_TEXT_BOX(userName)
            .setPASSWORD_TEXT_BOX(password)
            .setLOGIN_BUTTON();
  }
}
