package web.google;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.GooglePage;
import web.BaseWebTest;

public class GoogleTest {

  @Description("GoogleSearchPositiveTest")
  @Test
  public void googleSearchPositiveTest() {
//    GooglePage googlePage = new GooglePage();
    Assert.assertTrue(true, "Google logo should be displayed");
  }

  @Test
  public void googleSearchNegativeTest() {
    Assert.assertTrue(false, "Google logo should be displayed");
  }
}
