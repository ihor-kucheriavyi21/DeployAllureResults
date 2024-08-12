package web.google;

import io.qameta.allure.Description;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.GooglePage;
import web.BaseWebTest;

public class GoogleTest extends BaseWebTest {

  @Description("GoogleSearchPositiveTest")
  @Test
  public void googleSearchPositiveTest() {
    GooglePage googlePage =  PageFactory.initElements(driver, GooglePage.class);
    Assert.assertTrue(googlePage.isPageLogoDisplayed(), "Google logo should be displayed");
  }

  @Test
  public void googleSearchNegativeTest() {
    Assert.assertTrue(false, "Google logo should be displayed");
  }
}
