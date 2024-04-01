package com.mf.tests.web.tests.adduser;

import com.mf.tests.web.base.WebBase;
import enums.AddUserScenarioType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import pages.web.LoginPage;

public class AddUserPageTest extends WebBase {

@ParameterizedTest()
@Execution(ExecutionMode.CONCURRENT)
@EnumSource(value = AddUserScenarioType.class)
public void validationsInAddUserPage(AddUserScenarioType addUserScenarioType)
  {
    Boolean isMessageDisplayed = new LoginPage()
      .loginToApplication("Admin", "admin123")
      .navigateToUserManagementPage()
      .getAddUsersComponent()
      .clickAddButton()
      .fillUserDetails(addUserScenarioType.getUserData(), addUserScenarioType.getPredicate());

    Assertions.assertThat(isMessageDisplayed)
      .withFailMessage(addUserScenarioType.getUserData().getMessage().getName())
      .isTrue();
  }
}