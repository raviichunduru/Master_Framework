package driver.factory.predicates;

import pages.web.pagecomponents.usermanagement.AddUsersComponent;
import pojo.UserData;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;

public class AddUserPredicates {

  private static final Map<String, BiPredicate<UserData, AddUsersComponent>> MAP = new HashMap<>();

  private static final BiPredicate<UserData, AddUsersComponent> JUST_EMPLOYEE_NAME_PREDICATE = (userData, addUsersComponent) -> {
    return addUsersComponent.setEmployeeNameTextbox(userData.getEmployeeName())
      .clickSaveButton()
      .isErrorMessageDisplayedForEmployeeName();
  };

  private static final BiPredicate<UserData, AddUsersComponent> JUST_USER_NAME_PREDICATE = (userData,addUsersComponent) -> {
    return addUsersComponent.setUserNameTextbox(userData.getUserName())
      .isErrorMessageDisplayedForUserName();
  };

  private static final BiPredicate<UserData, AddUsersComponent> ALL_VALUES_PREDICATE = (userData,addUsersComponent) -> {
    return addUsersComponent.selectUserRoleRadioButton()
      .selectStatusRadioButton()
      .setEmployeeNameTextbox(userData.getEmployeeName())
      .setUserNameTextbox(userData.getEmployeeName())
      .setPasswordTextbox(userData.getPassword())
      .setConfirmPasswordTextbox(userData.getPassword())
      .clickSaveButton()
      .isSuccessMessageDisplayed();
  };

  static
  {
    MAP.put("valid",ALL_VALUES_PREDICATE);
    MAP.put("employee",JUST_EMPLOYEE_NAME_PREDICATE);
    MAP.put("user",JUST_USER_NAME_PREDICATE);
  }

  public static BiPredicate<UserData, AddUsersComponent>  getPredicate (String value)
  {
    return MAP.get(value);
  }
}
