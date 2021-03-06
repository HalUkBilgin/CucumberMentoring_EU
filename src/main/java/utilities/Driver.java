package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;

import java.util.logging.Level;

public class Driver {


    private static WebDriver driver;


    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:/Users/omero/Selenium/ChromeDriver/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }


    public static void quitDriver(){

        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }

}

