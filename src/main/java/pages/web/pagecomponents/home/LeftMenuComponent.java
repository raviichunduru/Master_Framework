package pages.web.pagecomponents.home;

import org.openqa.selenium.By;
import pages.web.UserManagementPage;
import pages.web.leftmenucomponent.InnerSubMenuType;
import pages.web.leftmenucomponent.MenuType;
import pages.web.leftmenucomponent.SubMenuType;
import pages.web.pagecomponents.usermanagement.AddUsersComponent;

import static utils.web.PageActions.waitAndClick;

public class LeftMenuComponent {

  private static final String MENU = "//ul[@class='oxd-main-menu']/li[%s]";
  private static final String SUBMENU = "//span[normalize-space()='%s']";
  private static final String INNERSUBMENU = "//a[text()='%s']";

  public LeftMenuComponent clickMenuItem (MenuType menuType)
  {

    By menuItem = By.xpath(String.format(MENU, menuType.getName()));
    waitAndClick(menuItem);
    return this;
  }

  public LeftMenuComponent clickSubMenuItem (SubMenuType subMenuType)
  {
    By subMenuItem = By.xpath(String.format(SUBMENU, subMenuType.getName()));
    waitAndClick(subMenuItem);
    return this;
  }

  public UserManagementPage clickInnerSubMenuItem (InnerSubMenuType innerSubMenuType)
  {
    By innerSubMenuItem = By.xpath(String.format(INNERSUBMENU, innerSubMenuType.getName()));
    waitAndClick(innerSubMenuItem);
    return new UserManagementPage(new AddUsersComponent());
  }
}
