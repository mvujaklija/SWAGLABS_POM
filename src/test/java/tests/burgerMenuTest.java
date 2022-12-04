package tests;


import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BurgerMenuPage;
import pages.LoginPage;
import pages.Strings;

import java.time.Duration;
import java.util.ArrayList;

public class burgerMenuTest extends BaseTest{



    /**
     * TEST BUY ONE ITEM
     * Steps
     * 1. Navigate to a login page
     * 2. Filed out user-name and password field with valid data
     * 3. Click on the Burger menu Button
     * 4. Try all items in the burger menu
     * <p>
     * Expected results
     * 5. All items working properly
     */

     @Test

        public void burgerMenu ( ) {

         //Invoking Chrome driver

         ChromeDriver driver =  openChromeDriver();

         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

         try {

             //Login

             text ( "Login to SWAGLABS Sauce Demo" );
             LoginPage loginPage = new LoginPage ( driver );
             loginPage.logInUser ( Strings.VALID_USERNAME, Strings.VALID_PASSWORD );

             //Click on the burger menu

             text ( "Click on the burger Menu icon");
             BurgerMenuPage burgerMenupage = new BurgerMenuPage( driver );
             burgerMenupage.burgerMenuButton( );

             //Close burger menu

             text ( "Click on the burger Menu close");
             BurgerMenuPage burgerMenupage1 = new BurgerMenuPage( driver );
             burgerMenupage1.burgerMenuClose( );

             //Click on the burger menu again

             text ( "Click on the burger Menu icon again");
             BurgerMenuPage burgerMenupage2 = new BurgerMenuPage( driver );
             burgerMenupage2.burgerMenuButton( );

             //Click on the link ALL ITEMS

             text( "Click on the link ALL ITEMS");
             BurgerMenuPage burgerMenuPage3 = new BurgerMenuPage( driver );
             burgerMenuPage3.clickLinkAllItems();

             //Click on the about

             text( "Click on the link about");
             BurgerMenuPage burgerMenuPage4 = new BurgerMenuPage( driver );
             burgerMenuPage4.clickLinkAbout();
             ArrayList<String> tab = new ArrayList<>( driver.getWindowHandles ( ));
             driver.switchTo( ).window( tab.get(1) );
             driver.get("https://saucelabs.com/");
             driver.close();
             driver.switchTo().window(tab.get(0));
             driver.get("https://www.saucedemo.com/inventory.html");
             burgerMenuPage4.burgerMenuClose();
             String currentURL1 = driver.getCurrentUrl ( );
             assert currentURL1.equals ( "https://saucelabs.com/" ) : "Expected user is on the about page https://saucelabs.com/ " +  "  Actual: " + currentURL1;


             //Click on the RESET APP STATE

             text( "Click on the link RESET APP STATE");
             BurgerMenuPage burgerMenuPage5 = new BurgerMenuPage( driver );
             burgerMenuPage5.reset();
             String currentURL2 = driver.getCurrentUrl ( );
             assert currentURL2.equals ( "https://www.saucedemo.com/inventory.html" ) : " Expected user is on the inventory page https://www.saucedemo.com/inventory.html.  App is not compliantly rested some things stay in previous condition"  + "Actual" + currentURL2;

             //Click on the LOGOUT

             text( "Click on link LOGOUT");
             BurgerMenuPage burgerMenuPage6 = new BurgerMenuPage( driver );
             burgerMenuPage6.logout();
             String currentURL3 = driver.getCurrentUrl();
             assert currentURL3.equals( "https://www.saucedemo.com/" ) : "user is log out successfully" + "Actual " +  currentURL2;
         }
         finally {

             driver.quit();

         }

     }

}






