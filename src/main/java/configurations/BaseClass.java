package configurations;

//public class BaseClass {
    //public static WebDriver driver;
//}


import org.openqa.selenium.WebDriver;

public class BaseClass {
    public static WebDriver driver;
    static {
        driver= DriverConfig.create(BROWSERS.CHROMEINCOGNITO);
    }
    //public static WebDriver driver;

    //@BeforeClass
    //public static void createDriver() {
    //  driver= DriverConfig.create(BROWSERS.CHROMEDRIVERMANAGER);

    //}
    //@AfterClass
    //public static void after(){
    //    try {
    //        Thread.sleep(10000);
    //    } catch (InterruptedException e) {
    //       throw new RuntimeException(e);
    //   }
    //driver.quit();
    //}
}
