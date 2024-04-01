package testdata;

import pojo.UserData;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import static pages.web.leftmenucomponent.MessageType.ADD_USER_VALIDATION;
import static pages.web.leftmenucomponent.MessageType.EMPLOYEE_NAME_VALIDATION;
import static pages.web.leftmenucomponent.MessageType.USER_NAME_VALIDATION;

public class UserDataSupplier {

  private static final Map<String, Supplier<UserData>> MAP = new HashMap<>();

  private static final UserData allValues = UserData.builder().setEmployeeName("employee name").setUserName("user name")
                                                              .setPassword("password").setMessage(ADD_USER_VALIDATION).build();
  private static final UserData justEmployeeName = UserData.builder().setEmployeeName("employee name").setMessage(EMPLOYEE_NAME_VALIDATION).build();
  private static final UserData justUserName = UserData.builder().setUserName("user name").setMessage(USER_NAME_VALIDATION).build();

  static {
    MAP.put("valid", () -> allValues);
    MAP.put("employee", () -> justEmployeeName);
    MAP.put("user", () -> justUserName);
  }

  public static UserData getUserData (String value)
  {
    return MAP.get(value).get();
  }
}




