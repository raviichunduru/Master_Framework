package enums;

import driver.factory.predicates.AddUserPredicates;
import lombok.AllArgsConstructor;
import lombok.Getter;
import pages.web.pagecomponents.usermanagement.AddUsersComponent;
import pojo.UserData;
import testdata.UserDataSupplier;

import java.util.function.BiPredicate;

@AllArgsConstructor
@Getter
public enum AddUserScenarioType {

  VALID_ADD_USER_SCENARIO(UserDataSupplier.getUserData("valid"), AddUserPredicates.getPredicate("valid")),
  VALIDATE_EMPLOYEE_NAME_FIELD(UserDataSupplier.getUserData("employee"), AddUserPredicates.getPredicate("employee")),
  VALIDATE_USER_NAME_FIELD(UserDataSupplier.getUserData("user"), AddUserPredicates.getPredicate("user"));

  private final UserData userData;
  private final BiPredicate<UserData, AddUsersComponent> predicate;
}
