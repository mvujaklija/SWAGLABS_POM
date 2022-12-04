package tests;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;


public class buyOneItem extends BaseTest {

    /**
     * TEST BUY ONE ITEM
     * Steps
     * 1. Navigate to a login page
     * 2. Filed out user-name and password field with valid data
     * 3. Click on the LOGIN Button
     * 4. On inventory page select one item and add it to shopping chart
     * 5. Click on the shopping cart icon and click button CHECKOUT
     * 6. Fill data that is required from you on the next page and click on the CONTINUE
     * 7. Review you purchase and click on the button FINISH
     * <p>
     * Expected results
     * 8 User is successfully buy selected item and redirected to page that inform him about that
     */

    @Test

    public void buyOneProduct( ) {

        //Invoking Chrome driver

        ChromeDriver driver =  openChromeDriver();

        try {

            //Login

            text ( "Login to SWAGLABS Sauce Demo" );
            LoginPage loginPage = new LoginPage ( driver );
            loginPage.logInUser ( Strings.VALID_USERNAME, Strings.VALID_PASSWORD );

            //Adding Back Pack to chart

            text ( "Add Back Pack to a chart and navigate to CHART" );
            InventoryPage inventoryPage = new InventoryPage ( driver );
            inventoryPage.addToChartButtonProductBackPack();
            assert inventoryPage.getNumberFromShoppingChartBadge ( ).equals ( "1" ) : "Wrong number of items. Expected: 1,  Actual   " + inventoryPage.getNumberFromShoppingChartBadge();
            inventoryPage.clickShoppingChartIcon();

            //click on CHECKOUT button

            text ( "On chart page click button continue" );
            ShoppingChartPage shoppingChartPage = new ShoppingChartPage ( driver );
            shoppingChartPage.checkOutButton ( );

            //Enter user information and click CONTINUE button

            text ( "Enter user information's as requested" );
            CheckOutStepOne checkOutStepOne = new CheckOutStepOne ( driver );
            text( "Enter first name");
            checkOutStepOne.enterFirstName ( Strings.FIRST_NAME );
            text( "Enter last name");
            checkOutStepOne.enterLastName ( Strings.LAST_NAME );
            text( "Enter ZIP code");
            checkOutStepOne.enterZipCode ( Strings.ZIP_CODE );
            text ("Click CONTINUE");
            checkOutStepOne.clickContinueButton ();

            //Click on the FINISH button

            text ( "Click FINISHED" );
            CheckOutStepTwo checkoutStepTwo = new CheckOutStepTwo ( driver );
            checkoutStepTwo.clickFinishButton ( );

            text ( "Verify that the item is bought and success message is shown" );
            CheckOutFinish checkOutFinish = new CheckOutFinish( driver );
            String actualText = checkOutFinish.getHeaderText ( );
            assert actualText.equals ( Strings.THANK_YOU_FOR_YOUR_ORDER_TEXT ) : "Wrong text. " +
                    "Expected: " + Strings.THANK_YOU_FOR_YOUR_ORDER_TEXT +
                    " Actual: " +actualText;

        }
        finally {

            driver.quit ();

        }

    }

}
