package util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil {

  public static String takeScreenshot(WebDriver driver, String testName) {
    // Generate file name with timestamp
    String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    String screenshotName = testName + "_" + timestamp + ".png";

    // Take the screenshot
    File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

    // Specify the destination path
    String filePath = System.getProperty("user.dir") + "/allure-results/" + screenshotName;
    File destFile = new File(filePath);

    try {
      // Copy the screenshot to the destination path
      FileHandler.copy(srcFile, destFile);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return filePath;
  }
}
