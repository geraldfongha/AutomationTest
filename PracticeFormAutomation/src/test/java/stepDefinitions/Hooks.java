package stepDefinitions;

import CucumberManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void BrowserSetup() {
        driver = DriverManager.getDriver();
        driver.get("https://www.toolsqa.com/");
        driver.manage().window().maximize();
    }

    @After
    public void TearDown() {
  //      if (driver != null) {
          //  driver.close();
            //driver.quit();
   //     }
    }
}
