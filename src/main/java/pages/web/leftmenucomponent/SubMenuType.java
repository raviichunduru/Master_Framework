package pages.web.leftmenucomponent;

public enum SubMenuType {

  USERMANAGEMENT("User Management"),
  USERS("Users");


  private final String name;

  public String getName ()
  {
    return name;
  }

  SubMenuType (String name)
  {
    this.name = name;
  }

}
