package pages.web.leftmenucomponent;

public enum MenuType {


 ADMIN("1"),
 PIM("2");

 private final String name;

 public String getName ()
 {
   return name;
 }

  MenuType(String name)
  {
    this.name = name;
  }
}
