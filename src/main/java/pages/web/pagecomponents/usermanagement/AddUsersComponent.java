package pages.web.pagecomponents.usermanagement;

import com.google.common.util.concurrent.Uninterruptibles;
import pojo.UserData;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.function.BiPredicate;

import static org.jsoup.select.Selector.select;
import static utils.web.PageActions.getElementText;
import static utils.web.PageActions.waitAndClick;
import static utils.web.PageActions.waitAndSendKeys;

public class AddUsersComponent {

  private static final By ADD_BUTTON = By.xpath("//button[normalize-space()='Add']");

  private static final By CLICK_USER_ROLE = By.xpath("//label[normalize-space()='User Role']/following::*[1]");
  private static final By SELECT_USER_ROLE = By.xpath("//div[@class='oxd-select-option']/span[text()='Admin']");
  private static final By CLICK_STATUS = By.xpath("//label[normalize-space()='Status']/following::*[1]");
  private static final By SELECT_STATUS = By.xpath("//div[@class='oxd-select-option']/span[text()='Enabled']");

  private static final By EMPLOYEE_NAME = By.xpath("//label[normalize-space()='Employee Name']/following::input");
  private static final By USER_NAME = By.xpath("//label[normalize-space()='Username']/following::input");
  private static final By PASSWORD = By.xpath("//label[normalize-space()='Password']/following::input");
  private static final By CONFIRM_PASSWORD = By.xpath("//label[normalize-space()='Confirm Password']/following::input");

  private static final By SAVE_BUTTON = By.xpath("//button[normalize-space()='Save']");

  private static final By ERROR_MESSAGE_FOR_EMPLOYEE_NAME = By.xpath("//span[text()='Invalid']");
  private static final By ERROR_MESSAGE_FOR_USER_NAME = By.xpath("//span[text()='Should be at least 5 characters']");



  public AddUsersComponent clickAddButton() {
    waitAndClick(ADD_BUTTON);
    return this;
  }

  public AddUsersComponent selectUserRoleRadioButton() {
    waitAndClick(CLICK_USER_ROLE);
    waitAndClick(SELECT_USER_ROLE);
    return this;
  }

  public AddUsersComponent selectStatusRadioButton() {
    waitAndClick(CLICK_STATUS);
    waitAndClick(SELECT_STATUS);
    return this;
  }

  public AddUsersComponent setEmployeeNameTextbox(String employeeName) {
    waitAndSendKeys(EMPLOYEE_NAME,employeeName);
    return this;
  }

  public AddUsersComponent setUserNameTextbox(String userName) {
    waitAndSendKeys(USER_NAME,userName);
    return this;
  }

  public AddUsersComponent setPasswordTextbox(String password) {
    waitAndSendKeys(PASSWORD,password);
    return this;
  }

  public AddUsersComponent setConfirmPasswordTextbox(String confirmPassword) {
    waitAndSendKeys(CONFIRM_PASSWORD,confirmPassword);
    Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(3000));
    return this;
  }

  public boolean fillUserDetails (UserData userData, BiPredicate<UserData, AddUsersComponent> biPredicate)
  {
    return biPredicate.test(userData,this);
  }

  public AddUsersComponent clickSaveButton () {
    waitAndClick(SAVE_BUTTON);
    return this;
  }

  public Boolean isSuccessMessageDisplayed ()
  {
    return true;
  }

  public Boolean isErrorMessageDisplayedForEmployeeName ()
  {
    return getElementText(ERROR_MESSAGE_FOR_EMPLOYEE_NAME).equalsIgnoreCase("Invalid");
  }

  public Boolean isErrorMessageDisplayedForUserName ()
  {
    return getElementText(ERROR_MESSAGE_FOR_USER_NAME).equalsIgnoreCase("Should be at least 5 characters");
  }
}
