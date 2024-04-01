package pages.web.pagecomponents.home;

import org.openqa.selenium.By;
import utils.web.PageActions;

public class TopMenuComponent {

  private static final By LOGO = By.xpath("//img[@alt='client brand banner']");
  private static final By DASHBOARD = By.xpath("//h6[normalize-space()='Dashboard']");
  private static final By HELP = By.xpath("  //button[@title='Help']");

  public String getLogoSourceString ()
  {
    return PageActions.getAttibute(LOGO,e->e.getAttribute("src"));
  }

  public boolean isHelpButtonPresent ()
  {
    return PageActions.isPresent(HELP,e->e.isDisplayed());
  }

  public String getTypeOfDashboardField ()
  {
    return PageActions.getType(DASHBOARD, e->e.getTagName());
  }

}
