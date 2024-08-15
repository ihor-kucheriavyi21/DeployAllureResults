package web.google;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.GooglePage;
import web.BaseWebTest;

public class GoogleTest extends BaseWebTest {

  @Description("GoogleSearchPositiveTest")
  @Test
  public void googleSearchPositiveTest() {
    GooglePage googlePage = PageFactory.initElements(driver, GooglePage.class);

    Assert.assertTrue(googlePage.isPageLogoDisplayed(), "Google logo should be displayed");
  }

  @Test
  public void googleSearchNegativeTest() {
    GooglePage googlePage = PageFactory.initElements(driver, GooglePage.class);

    Assert.assertFalse(googlePage.isPageLogoDisplayed(), "Google logo should be displayed");
  }

  @Attachment(value = "{name}", type = "image/png")
  public byte[] attachScreenshot(String name) {
    return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
  }
}
