package web;

import static com.codeborne.selenide.Selenide.open;

import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public abstract class BaseWebTest {

  @BeforeClass
  public void openSession() {
    ChromeOptions browserOptions = new ChromeOptions();
    browserOptions.setPlatformName("Windows 10");
    browserOptions.setBrowserVersion("126");
    HashMap<String, Object> ltOptions = new HashMap<String, Object>();
    ltOptions.put("username", "ikdevexpert");
    ltOptions.put("accessKey", "Mja7jOlFWCGew4vn3q7hwukPGFUTOBDSXB4kIUpNuwSgmfrrW1");
    ltOptions.put("project", "Untitled");
    ltOptions.put("selenium_version", "4.0.0");
    ltOptions.put("w3c", true);
    browserOptions.setCapability("LT:Options", ltOptions);
    open("https://www.google.com/");
  }
}
