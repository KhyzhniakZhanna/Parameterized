package conf;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import pages.mainPageObject;

public class BaseClass {
   public static WebDriver driver;


   @BeforeClass
   public static void BeforeParent() {
      driver = ConfigurationWebDriver.createdriver(Webdrivers.CHROME_INCOGNITO);

   }

@AfterClass
   public static void afterParent() throws InterruptedException {
      Thread.sleep(3000);
      driver.quit();
   }

}
