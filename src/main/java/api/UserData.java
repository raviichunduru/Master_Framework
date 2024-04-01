package api;

import api.pojos.UserDetails;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import lombok.SneakyThrows;
import java.io.File;

public class UserData {

  @SneakyThrows
  public static UserDetails getUserDetails ()
  {
   return new ObjectMapper().readValue(new File(System.getProperty("user.dir") + "/src/test/resources/requests/create-user.json"),UserDetails.class);
  }
}
