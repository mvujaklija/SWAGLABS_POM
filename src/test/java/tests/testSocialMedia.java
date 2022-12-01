package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.*;
import java.util.ArrayList;

public class testSocialMedia extends BaseTest{

    /**
     * TEST SOCIAL MEDIA BUTTONS
     * Steps
     * 1. Navigate to a login page
     * 2. Filed out user-name and password field with valid data
     * 3. Click on the LOGIN Button
     * 4. On inventory page scroll down to the bottom of the page
     * 5. Click on the TWITTER icon
     * 6. Click on the FACEBOOK icon
     * 7. Click on the LinkedIn icon
     *
     * Expected results
     * 8 User is successfully redirected to appropriate pge according to the icon that is clicked
     */



    @Test

    public void login ( ) {

        //Invoking Chrome driver

        ChromeDriver driver = openChromeDriver( );

        try{

        //Login on the page

        LoginPage loginPage = new LoginPage ( driver );
        loginPage.enterUserName ( Strings.VALID_USERNAME );
        loginPage.enterPassword ( Strings.VALID_PASSWORD );
        loginPage.clickLoginButton ( );

        //Test Twitter button

        text ( "Clicing and redirecting to TWITTER page of the SWAGLABS" );
        SocialMediaPage socialMediaPage = new SocialMediaPage ( driver );
        socialMediaPage.testTwitterButton ( );
        ArrayList <String> tab1 = new ArrayList ( driver.getWindowHandles ( ));
        driver.switchTo().window(tab1.get(1));
        String currentURL = driver.getCurrentUrl ( );
        assert currentURL.equals ( "https://twitter.com/saucelabs" ) : "User is on the wrong page. " +  "  Actual: " + currentURL;
        driver.close();
        driver.switchTo().window(tab1.get(0));

        //Test Facebook button

        text ( "Clicing and redirecting to Facebook page of the SWAGLABS" );
        SocialMediaPage socialMediaPage1 = new SocialMediaPage ( driver );
        socialMediaPage1.testFacebookButton ( );
        ArrayList <String> tab2 = new ArrayList ( driver.getWindowHandles ( ));
        driver.switchTo().window(tab2.get(1));
        String currentURL1 = driver.getCurrentUrl ( );
        assert currentURL1.equals ( "https://www.facebook.com/saucelabs" ) : "User is on the wrong page. " +  "  Actual: " + currentURL;
        driver.close();
        driver.switchTo().window(tab2.get(0));

        //Test Linkedin button

        text ( "Clicing and redirecting to LinkedIn page of the SWAGLABS" );
        SocialMediaPage socialMediaPage2 = new SocialMediaPage ( driver );
        socialMediaPage2.testLinkedinButton ( );
        ArrayList <String> tab3 = new ArrayList ( driver.getWindowHandles ( ));
        driver.switchTo().window(tab3.get(1));
//        String currentURL2 = driver.getCurrentUrl ( );
//        assert currentURL2.equals ( "https://www.linkedin.com/company/sauce-labs/" ) : "User is on the wrong page. " +  "  Actual: " + currentURL;
//        driver.close();
        driver.switchTo().window(tab3.get(0));

    }
        finally {

            driver.quit();

        }
        }
}
