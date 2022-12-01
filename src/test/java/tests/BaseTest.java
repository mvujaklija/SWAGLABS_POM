package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {


    public ChromeDriver openChromeDriver() {

                text("This is how I open driver");

                ChromeOptions options = new ChromeOptions();

                options.addArguments("--start-maximized");
                options.addArguments("--ignore-certificate-errors");
                options.addArguments("--disable-popup-blocking");
                //options.addArguments("--incognito");
                options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                return new ChromeDriver(options);
            }


    public void text(String txt) { System.out.println(txt); }
}
