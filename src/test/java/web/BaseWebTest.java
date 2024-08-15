package web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

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
    // Initialize the FirefoxDriver
    driver = new FirefoxDriver();
    driver.navigate().to("https://www.google.com/");
  }
}
