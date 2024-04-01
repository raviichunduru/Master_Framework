package pages.web.leftmenucomponent;

public enum MessageType {

  EMPLOYEE_NAME_VALIDATION("Validation failed for employee name field"),
  USER_NAME_VALIDATION("Validation failed for user  name field"),
  ADD_USER_VALIDATION("Validation failed for successful message after add employee workflow");

  private String name;

  MessageType(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
