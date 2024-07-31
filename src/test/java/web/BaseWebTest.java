package web;

import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public abstract class BaseWebTest {

  @BeforeClass
  public void openSession() {
    System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    WebDriver driver = new ChromeDriver();
    open("https://www.google.com/");
  }
}
