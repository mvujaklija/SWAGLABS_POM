package tests;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;
import pages.Strings;

public class addRemoveAllItemsMainPage extends BaseTest{


    /**
     * TEST ADD ALL ITEMS FROM INVENTORY PAGE CHECK NUMBER IN SHOPPING CHART AND REMOVE THEM
     * Steps
     * 1. Navigate to a login page
     * 2. Filed out user-name and password field with valid data
     * 3. Click on the LOGIN Button
     * 4. You stay all the time on the inventory page
     * 5. On inventory page select all items and add it to shopping chart by clicking ADDTOCHART button
     * 6. On the chart badge with assert verify number of items in chart
     * 7. Remove all items from the chart by clicking REMOVE button
     * 7. Review you purchase and click on the button FINISH
     * 8. On the chart badge with assert verify number of items in chart
     * <p>
     * Expected results
     * 8 User is successfully add items to a chart and remove them without leaving inventory page
     */


    @Test

    public void addRemove( ){

        //Invoking Chrome driver

        ChromeDriver driver = openChromeDriver( );

        try {

            //Login

            text(" Login to SWAGLABS Sauce Demo");
            LoginPage loginPage = new LoginPage(driver);
            loginPage.logInUser( Strings.VALID_USERNAME , Strings.VALID_PASSWORD );


            //Adding things to chart

            InventoryPage inventoryPage = new InventoryPage ( driver );
            inventoryPage.addToChartButtonProductBikeLight();
            inventoryPage.addToChartButtonProductBackPack();
            inventoryPage.addToChartButtonProductBoltShirt();
            inventoryPage.addToChartButtonProductFleeceJacket();
            inventoryPage.addToChartButtonProductLabsOnesie();
            inventoryPage.addToChartButtonProductShirtRed();

            //Assertion for number of things

            assert inventoryPage.getNumberFromShoppingChartBadge ( ).equals ( "6" ) : "Wrong number of items. Expected: 0,  Actual   " + inventoryPage.getNumberFromShoppingChartBadge();

            //Removing things from chart

            InventoryPage inventoryPage1 = new InventoryPage( driver );
            inventoryPage1.removeFromChartButtonProductBikeLight();
            inventoryPage1.removeFromChartButtonProductBackPack();
            inventoryPage1.removeFromChartButtonProductBoltShirt();
            inventoryPage1.removeFromChartButtonProductFleeceJacket();
            inventoryPage1.removeFromChartButtonProductLabsOnesie();
            inventoryPage1.removeFromChartButtonProductShirtRed();

        }
        finally {

            driver.quit();

        }

    }

}
