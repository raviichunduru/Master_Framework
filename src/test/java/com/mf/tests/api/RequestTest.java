package com.mf.tests.api;

import api.assertons.ResponseAssert;
import api.pojos.UserResponseDetails;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static api.ReqResApi.createUser;
import static api.ReqResApi.listUsers;
import static api.UserData.getUserDetails;

public class RequestTest {
  @Test
  public void testListUsersApi() {
    Response response = listUsers();
    response.prettyPrint();

    Assertions.assertThat(response.statusCode()).isEqualTo(200);
  }

  @Test
  public void testCreateUserApi() {
    Response response = createUser(getUserDetails());
    response.prettyPrint();

    ResponseAssert.assertThat(response)
                  .statusCodeIs(201)
                  .canBeDeserializedTo(UserResponseDetails.class)
                  .hasKeyWithValue("job","leader")
                  .hasContentType("application/json; charset=utf-8")
                  .assertAll();
  }
}
