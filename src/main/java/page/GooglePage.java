package page;

import static com.codeborne.selenide.Selenide.$x;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

public class GooglePage {

  private final WebElement pageLogo = $x("//img[@alt='Google']");

  @Step
  public boolean isPageLogoDisplayed() {
    return pageLogo.isDisplayed();
  }
}
