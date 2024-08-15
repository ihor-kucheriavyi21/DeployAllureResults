package web;

import listener.AllureListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(AllureListener.class)
public abstract class BaseWebTest {

  public WebDriver driver;

  @BeforeClass
  public void openSession() {
  /*  System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");
    options.addArguments("--disable-gpu");
    options.addArguments("--remote-debugging-pipe");
    driver = new ChromeDriver(options);*/
    // Set the path to the Geckodriver
    FirefoxOptions options = new FirefoxOptions();
    options.addArguments("--headless");
    // Initialize the FirefoxDriver
    driver = new FirefoxDriver(options);
    driver.navigate().to("https://www.google.com/");
  }

  public WebDriver getDriver() {
    return driver;
  }
}
