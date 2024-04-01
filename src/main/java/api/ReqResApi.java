package api;

import api.pojos.UserDetails;
import config.factory.ApiConfigFactory;
import io.restassured.response.Response;

public final class ReqResApi {

  private ReqResApi () {}

  private static final String LIST_USERS_ENDPOINT = ApiConfigFactory.getConfig().listUsersEndPoint();
  private static final String CREATE_USER_ENDPOINT = ApiConfigFactory.getConfig().createUserEndPoint();

  public static Response listUsers() {

    return BaseRequestSpecification.getDefaultRequestSpecification()
                                   .queryParam("page", "2")
                                   .get(LIST_USERS_ENDPOINT);
  }

  public static Response createUser (UserDetails userDetails){

    return BaseRequestSpecification.getDefaultRequestSpecification()
                                   .body(userDetails)
                                   .post(CREATE_USER_ENDPOINT);
  }


}

