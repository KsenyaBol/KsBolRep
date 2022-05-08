package ru.stqa.pft.addressbook;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupCreationTest {
  private WebDriver wd;
  private JavascriptExecutor js;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "c:\\Tools\\chromedriver.exe");
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) wd;
  }

  @Test
  public void testGroupCreation() throws Exception {
    //ERROR: Caught exception [unknown command [может]]
    //ERROR: Caught exception [unknown command [тип тип тип]]
    //ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    //ERROR: Caught exception [unknown command [тип тип тип]]
    //ERROR: Caught exception [unknown command [нажмите]]
    //ERROR: Caught exception [unknown command [тип тип тип]]
    //ERROR: Caught exception [unknown command [нажмите]]
    //ERROR: Caught exception [unknown command [нажмите]]
    //ERROR: Caught exception [unknown command [нажмите]]
    //ERROR: Caught exception [unknown command [нажмите]]
    //ERROR: Caught exception [unknown command [тип тип]]
    //ERROR: Caught exception [unknown command [нажмите]]
    //ERROR: Caught exception [unknown command [тип тип]]
    //ERROR: Caught exception [unknown command [нажмите]]
    //ERROR: Caught exception [unknown command [тип тип]]
    //ERROR: Caught exception [unknown command [нажмите]]
    //ERROR: Caught exception [unknown command [нажмите]]
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

}
