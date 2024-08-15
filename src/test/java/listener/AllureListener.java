package listener;

import io.qameta.allure.Attachment;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import util.ScreenshotUtil;
import web.BaseWebTest;

public class AllureListener implements IInvokedMethodListener {

  @Override
  public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
    // artifacts data to attach.
    if (method.isTestMethod()) {
      // attaching screenshot & failure URL
      if (Objects.nonNull(testResult.getThrowable())) {
        Object testClass = testResult.getInstance();
        WebDriver driver = ((BaseWebTest) testClass).getDriver(); // Replace 'YourTestClass' with your class name
        String screenshotPath = ScreenshotUtil.takeScreenshot(driver, testResult.getName());
        saveScreenshotToAllure(screenshotPath);
      }
    }
  }

  @Attachment(value = "Failure Screenshot", type = "image/png")
  public byte[] saveScreenshotToAllure(String path) {
    try {
      return Files.readAllBytes(Paths.get(path));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return new byte[0];
  }

}
