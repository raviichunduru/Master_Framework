package pages.web.validators;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class HomePageValidator {
  private String logoSourceString;
  private String dashBoardFiledType;
  private boolean helpButtonPresence;
}
