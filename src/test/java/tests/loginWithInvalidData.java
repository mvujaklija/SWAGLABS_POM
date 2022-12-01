package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Strings;



public class loginWithInvalidData extends BaseTest {

    /**
     * TEST LOGIN TO A PAGE
     * Steps
     * 1. Navigate to a login page
     * 2. Filed out user-name and password field with wrong data
     * 3. Click on the LOGIN Button
     *
     * Expected results
     * 4 User is unsuccessfully logged and get error message
     */

    @Test
    public void loginWithInvalidCreds ( ) {

        //Invoking chrome driver

        ChromeDriver driver = openChromeDriver ( );

        try {

            text( "Login to a main page");
            LoginPage loginPage = new LoginPage ( driver );
            loginPage.enterUserName ( Strings.LOCKED_OUT_USERNAME );
            loginPage.enterPassword ( Strings.VALID_PASSWORD );
            loginPage.clickLoginButton ( );
            String currentURL = driver.getCurrentUrl ( );
            assert currentURL.equals ( "https://www.saucedemo.com/inventory.html" ) : "User is on the wrong page.  https://www.saucedemo.com/inventory.html  " +
                    "  Actual: " + currentURL;

        } finally {



            driver.quit ( );

        }
    }
}
