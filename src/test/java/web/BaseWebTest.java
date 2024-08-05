package web;

import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public abstract class BaseWebTest {

  @BeforeClass
  public void openSession() {
    System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");
    options.addArguments("--disable-gpu");
    options.addArguments("--remote-debugging-pipe");
    WebDriver driver = new ChromeDriver(options);
    open("https://www.google.com/");
  }
}
