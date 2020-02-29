package base;

import com.applitools.eyes.selenium.Eyes;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.AfterClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import pages.SearchPage;

public class BaseTests {

  protected static WebDriver driver;
  protected static SearchPage page;
  protected static Eyes eyes;

  @BeforeClass
  public static void setUp() {
    Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE);
    WebDriverManager.chromedriver().setup();
    Properties props = System.getProperties();
    try {
      props.load(
              new FileInputStream(new File("resources/test.properties")));
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(-1);
    }

    driver = new ChromeDriver();
    driver.get(System.getProperty("app.url"));
    page = new SearchPage(driver);
    initialEyes();
  }
  
  public static void initialEyes(){
    eyes = new Eyes();
    eyes.setApiKey(System.getProperty("applitools.api.key"));
  }

  public void validateWindow(){
    eyes.open(driver, "Automation Bookstore",
            Thread.currentThread().getStackTrace()[2].getMethodName()) ; //get the name of the test method that calls this method

    //This call does the magic; it takes a screenshot and sends to Applitools cloud
    eyes.checkWindow();

    eyes.close();
  }

  public void validateElement(By locator){
    eyes.open(driver, "Automation Bookstore",
            Thread.currentThread().getStackTrace()[2].getMethodName()) ; //get the name of the test method that calls this method

    //This call does the magic; it takes a screenshot and sends to Applitools cloud
    eyes.checkElement(locator);

    eyes.close();
  }

  @AfterClass
  public static void tearDown() {
    driver.quit();
  }
}
