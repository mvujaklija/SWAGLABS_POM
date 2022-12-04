package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {


    public ChromeDriver openChromeDriver() {

                text("This is how I open driver");

                ChromeOptions options = new ChromeOptions();

                options.addArguments(new String[]{"--user-data-dir=C:/Users/Milan Vujaklija/AppData/Local/Google/Chrome/User Data"});
                options.addArguments(new String[]{"--profile-directory=Profile 8"});
                options.addArguments(new String[]{"--start-maximized"});
                options.addArguments(new String[]{"--ignore-certificate-errors"});
                options.addArguments(new String[]{"--disable-popup-blocking"});
                //options.addArguments("--incognito");
                options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                ChromeDriver driver = new ChromeDriver( options );
                return driver;
            }


    public void text(String txt) { System.out.println(txt); }
}
