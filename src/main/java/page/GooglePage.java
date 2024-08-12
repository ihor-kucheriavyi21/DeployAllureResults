package page;


import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

  @FindBy(xpath = "//img[@alt='Google']")
  private WebElement pageLogo;

  @Step
  public boolean isPageLogoDisplayed() {
    return pageLogo.isDisplayed();
  }
}
