package page;


import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {

  @FindBy(xpath = "//img[@alt='Google']")
  private WebElement pageLogo;

  @Step("Check if page logo is displayed")
  public boolean isPageLogoDisplayed() {
    Allure.step("Checking the page logo");
    return pageLogo.isDisplayed();
  }

}
