package pages.web;

import pages.web.pagecomponents.usermanagement.AddUsersComponent;

public class UserManagementPage {

 private AddUsersComponent addUsersComponent;

  public UserManagementPage(AddUsersComponent addUsersComponent) {
    this.addUsersComponent = addUsersComponent;
  }

  public AddUsersComponent getAddUsersComponent() {
    return addUsersComponent;
  }
}

