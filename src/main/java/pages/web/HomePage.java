package pages.web;

import pages.web.leftmenucomponent.InnerSubMenuType;
import pages.web.leftmenucomponent.MenuType;
import pages.web.leftmenucomponent.SubMenuType;
import pages.web.pagecomponents.home.LeftMenuComponent;
import pages.web.pagecomponents.home.TopMenuComponent;
import pages.web.validators.HomePageValidator;

public class HomePage {

  private LeftMenuComponent leftMenuComponent;
  private TopMenuComponent topMenuComponent;

  public HomePage(TopMenuComponent topMenuComponent, LeftMenuComponent leftMenuComponent)
  {
    this.topMenuComponent = new TopMenuComponent();
    this.leftMenuComponent = new LeftMenuComponent();
  }

  public LeftMenuComponent getLeftMenuComponent() {
    return leftMenuComponent;
  }

  public TopMenuComponent getTopMenuComponent() { return topMenuComponent; }

  public UserManagementPage navigateToUserManagementPage(){

   return getLeftMenuComponent()
      .clickMenuItem(MenuType.ADMIN)
      .clickSubMenuItem(SubMenuType.USERMANAGEMENT)
      .clickInnerSubMenuItem(InnerSubMenuType.USERS);
  }

  public HomePageValidator getHomePageValidator() {

    return HomePageValidator.builder()
                            .logoSourceString(getTopMenuComponent().getLogoSourceString())
                            .dashBoardFiledType(getTopMenuComponent().getTypeOfDashboardField())
                            .helpButtonPresence(getTopMenuComponent().isHelpButtonPresent())
                            .build();
  }
}
