package web;

import static com.codeborne.selenide.Selenide.open;

import org.testng.annotations.BeforeClass;

public abstract class BaseWebTest {

  @BeforeClass
  public void openSession() {
    open("https://www.google.com/");
  }
}
