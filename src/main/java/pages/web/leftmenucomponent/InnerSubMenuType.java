package pages.web.leftmenucomponent;

public enum InnerSubMenuType {

  USERS("Users");

  private final String name;

  public String getName ()
  {
    return name;
  }

  InnerSubMenuType (String name)
  {
    this.name = name;
  }
}
