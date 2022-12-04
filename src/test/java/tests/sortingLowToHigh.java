package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SortingPage;
import pages.Strings;

public class sortingLowToHigh extends BaseTest{

    /**
     * TEST BUY ONE ITEM
     * Steps
     * 1. Navigate to a login page
     * 2. Filed out user-name and password field with valid data
     * 3. Click on the LOGIN Button
     * 4. On inventory page select dropdown menu
     * 5. Click on the sorting by price low to high
     * <p>
     *
     * Expected results
     * 6. User is successfully sort items and assert that
     */

    @Test

    public void sortProductsByPrice( ) {

        //Invoking Chrome driver

        ChromeDriver driver = openChromeDriver();

        try {

            //Login

            text("Login to SWAGLABS Sauce Demo");

            LoginPage loginPage = new LoginPage(driver);

            loginPage.logInUser(Strings.VALID_USERNAME, Strings.VALID_PASSWORD);

            //Open drop down list

            text( "Sort elements by price from low to high");

            SortingPage sortingPage = new SortingPage( driver );

            sortingPage.dropDown();

            //Select sorting option from sorting list

            text( "Select option to sort from low to high");

            SortingPage sortingPage1 = new SortingPage( driver );

            sortingPage1.selectSorting();

            //Checking results of sort

            text( "Select option to sort from low to high");

            SortingPage sortingPage2 = new SortingPage( driver );

            sortingPage2.results();



        }
        finally {

            driver.quit();

        }

    }

}

