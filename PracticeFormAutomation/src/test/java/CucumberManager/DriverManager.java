package CucumberManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static WebDriver driver;


    public static WebDriver getDriver() {
   // if (driver == null) {
            WebDriverManager.chromedriver().setup();
                   driver = new ChromeDriver();
     //   }
        return driver;
          }
}
