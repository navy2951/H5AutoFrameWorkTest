package BasicTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private static WebDriver driver = null;

    private DriverFactory() {
    }

    private static WebDriver CreateBroswerDriver() {
        ConfigUtil configUtil = ConfigUtil.getConfigUtil();
        switch (configUtil.getConfigFileContent("Broswer.type")) {
        case "firefox":
            driver = new FirefoxDriver();
            return driver;
        case "chrome":
            return driver;
        case "ie":
            return driver;
        case "safari":
            return driver;
        default:
        }
        return null;

    }

    public static WebDriver createNewDriver() {
        System.out.println(driver == null);
        if (driver == null) {
            synchronized (WebDriver.class) {
                if (driver == null) {
                    driver = CreateBroswerDriver();
                    driver.manage().window().maximize();
                    return driver;
                }
            }
        }
        return driver;
    }

    public static void CloseDriver() {
        driver.quit();
        driver = null;
    }

}
