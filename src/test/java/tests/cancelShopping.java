package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.*;

public class cancelShopping extends BaseTest {



    /**
     * TEST BUY ONE ITEM
     * Steps
     * 1. Navigate to a login page
     * 2. Filed out user-name and password field with valid data
     * 3. Click on the LOGIN Button
     * 4. On inventory page select one item and add it to shopping chart
     * 5. Click on the shopping cart icon and click button CANCEL
     * <p>
     * <p>
     * Expected results
     * 8 User is successfully cancel shopping and redirected to inventory page
     */

    @Test

    public void cancelShoping() {

        //Invoking Chrome driver

        ChromeDriver driver = openChromeDriver();

        try {

            //Navigate to login page

            text("Login lo SWAGLABS Sauce Demo");
            LoginPage loginPage = new LoginPage(driver);
            loginPage.logInUser(Strings.VALID_USERNAME, Strings.VALID_PASSWORD);
            String currentURL = driver.getCurrentUrl();
            assert currentURL.equals("https://www.saucedemo.com/inventory.html") : "User is on the wrong page.  https://www.saucedemo.com/inventory.html  " +
                    "  Actual: " + currentURL;

            //Ading item in inventory page

            text("Add labs Onesie to a shopping chart");
            InventoryPage inventoryPage = new InventoryPage(driver);
            inventoryPage.addToChartButtonProductLabsOnesie();
            assert inventoryPage.getNumberFromShoppingChartBadge().equals("1") : "Wrong number of items. Expected: 1,  Actual   " + inventoryPage.getNumberFromShoppingChartBadge();
            inventoryPage.clickShoppingChartIcon();

            //Navigate to shopping chart page and continue shopping

            text("You are on sopping chart page an in the list you see one item Bike light");
            ShoppingChartPage shoppingChartPage = new ShoppingChartPage(driver);
            String currentURL1 = driver.getCurrentUrl();
            assert currentURL1.equals("https://www.saucedemo.com/cart.html") : "User is on the wrong page.  https://www.saucedemo.com/cart.html  " +
                    "  Actual: " + currentURL;
            shoppingChartPage.checkOutButton();

            //Navigate to check out page and canceling shopping

            text("You are now on the check out page and we are now going to cancel shopping");
            CheckOutStepOne checkOutStepOne = new CheckOutStepOne(driver);
            String currentURL2 = driver.getCurrentUrl();
            assert currentURL2.equals("https://www.saucedemo.com/checkout-step-one.html") : "User is on the wrong page.  https://www.saucedemo.com/checkout-step-one.html  " +
                    "  Actual: " + currentURL;
            checkOutStepOne.clickCancelButton();

            //Navigate to shopping chart page and removing item

            text("You are now on shopping chart page and we are going to remove selected item");
            ShoppingChartPage shoppingChartPage1 = new ShoppingChartPage(driver);
            String currentURL3 = driver.getCurrentUrl();
            assert currentURL3.equals("https://www.saucedemo.com/cart.html") : "User is on the wrong page.  https://www.saucedemo.com/cart.html  " +
                    "  Actual: " + currentURL3;
            shoppingChartPage1.buttonRemoveLabsOnesie();

            //Navigate to inventory page

            text("Now we are going to click button continue shopping to back to inventory page ");
            ShoppingChartPage shoppingChartPage2 = new ShoppingChartPage(driver);
            shoppingChartPage2.continueShoppingButton();
            String currentURL4 = driver.getCurrentUrl();
            assert currentURL4.equals("https://www.saucedemo.com/inventory.html") : "User is on the wrong page. https://www.saucedemo.com/inventory.html  " + "  Actual: " + currentURL4;


        }
        finally {

            driver.quit();

        }

    }

}








