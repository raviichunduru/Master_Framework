package pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import pages.web.leftmenucomponent.MessageType;
import podamstrategy.NameStrategy;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import uk.co.jemos.podam.common.PodamStrategyValue;
import uk.co.jemos.podam.common.PodamStringValue;

@ToString
@Builder(setterPrefix = "set")
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class UserData {

  @PodamStrategyValue(NameStrategy.class)
  private String employeeName;

  @PodamStringValue(strValue = "username")
  private String userName;

  @PodamStringValue(strValue = "password")
  private String password;

  private MessageType message;
}
