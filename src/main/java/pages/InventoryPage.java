package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import java.lang.String;

public class InventoryPage extends MainPage {

    //Looking for web elements

    @FindBy ( xpath = "//span [ @class = 'shopping_cart_badge' ]" )
    WebElement shoppingChartBadge;

    @FindBy ( xpath = "//button [ @data-test = 'add-to-cart-sauce-labs-bike-light' ]" )
    WebElement addToChartButtonProductBikeLight;

    @FindBy ( xpath = "//button [ @data-test = 'add-to-cart-sauce-labs-backpack' ]" )
    WebElement addToChartButtonProductBackPack;

    @FindBy ( xpath = "//button [ @data-test = 'add-to-cart-sauce-labs-bolt-t-shirt' ]" )
    WebElement addToChartButtonProductBoltTShirt;

    @FindBy ( xpath = "//button [ @data-test = 'add-to-cart-sauce-labs-fleece-jacket' ]" )
    WebElement addToChartButtonProductFleeceJacket;

    @FindBy ( xpath = "//button [ @data-test = 'add-to-cart-sauce-labs-onesie' ]" )
    WebElement addToChartButtonProductLabsOnesie;

    @FindBy ( xpath = "//button [ @data-test = 'add-to-cart-test.allthethings()-t-shirt-(red)' ]" )
    WebElement addToChartButtonProductShirtRed;

    @FindBy ( xpath = "//button [ @data-test = 'remove-sauce-labs-bike-light' ]" )
    WebElement removeFromChartButtonProductBikeLight;

    @FindBy ( xpath = "//button [ @data-test = 'remove-sauce-labs-backpack' ]" )
    WebElement removeFromChartButtonProductBackPack;

    @FindBy ( xpath = "//button [ @data-test = 'remove-sauce-labs-bolt-t-shirt' ]" )
    WebElement removeFromChartButtonProductBoltShirt;

    @FindBy ( xpath = "//button [ @data-test = 'remove-sauce-labs-fleece-jacket' ]" )
    WebElement removeFromChartButtonProductFleeceJacket;

    @FindBy ( xpath = "//button [ @data-test = 'remove-sauce-labs-onesie' ]" )
    WebElement removeFromChartButtonProductLabsOnesie;

    @FindBy ( xpath = "//button [ @data-test = 'remove-test.allthethings()-t-shirt-(red)' ]" )
    WebElement removeFromChartButtonProductShirtRed;

    //Print

    public static void text ( String txt ) {
        System.out.println ( txt );
    }

        public InventoryPage(ChromeDriver driver) {
            super(driver);
            text("We are on Inventory page");
            assert driver.getCurrentUrl().equals(Strings.INVENTORY_PAGE_URL) : "User is not on Inventory page" + "Actual " + driver.getCurrentUrl();
        }

        //Methods

        /**
         * THIS Method get number of items in sopping chart
        */

        public Object getNumberFromShoppingChartBadge ( ) {

            assert shoppingChartBadge.isDisplayed ( ) : "Shopping chart badge is not display number of items. Expected to number of items be there.";

            String number = shoppingChartBadge.getText ( );

            return number;

        }

        /**
        * THIS Method clicks on Chart icon
        */

        public void clickShoppingChartIcon ( ) {

            assert shoppingChartIcon.isDisplayed() : "Shopping chart button is not displayed. Expected to be there.";

            shoppingChartIcon.click();

        }

        /**
        * THIS Method adds Bike Light product
        */

        public void addToChartButtonProductBikeLight ( ) {

            assert addToChartButtonProductBikeLight.isDisplayed() : "Button for adding to chart product bike light is not displayed. Expected to be there.";

            addToChartButtonProductBikeLight.click();

        }

        /**
        * THIS Method  adds Back-Pack product
        */

        public void addToChartButtonProductBackPack ( ) {

            assert addToChartButtonProductBackPack.isDisplayed ( ) : "Button for adding to chart product back pack is not displayed. Expected to be there.";

            addToChartButtonProductBackPack.click ( );

        }

        /**
         * THIS Method  adds Bolt Shirt product
        */

        public void addToChartButtonProductBoltShirt ( ) {

            assert addToChartButtonProductBoltTShirt.isDisplayed() : "Button for adding to chart product bolt shirt is not displayed. Expected to be there.";

            addToChartButtonProductBoltTShirt.click();

        }

        /**
         * THIS Method  adds Labs Onesie product
        */

        public void addToChartButtonProductLabsOnesie ( ) {

            assert addToChartButtonProductLabsOnesie.isDisplayed ( ) : "Button for adding to chart product labs onesie is not displayed. Expected to be there.";

            addToChartButtonProductLabsOnesie.click ( );

        }

        /**
         * THIS Method  adds Fleece Jacket product
         */

        public void addToChartButtonProductFleeceJacket ( ) {

            assert addToChartButtonProductFleeceJacket.isDisplayed ( ): "Button for adding to chart product fleece jacket is not displayed. Expected to be there.";

            addToChartButtonProductFleeceJacket.click ( );

        }

        /**
         * THIS Method  adds Red T-Shirt product
         */

        public void addToChartButtonProductShirtRed ( ) {

            assert addToChartButtonProductShirtRed.isDisplayed ( ) : "Button for adding to chart product red t-shirt is not displayed. Expected to be there.";

            addToChartButtonProductShirtRed.click ( );

        }

        /**
         * THIS Method  remove Bike Light product
         */

        public void removeFromChartButtonProductBikeLight ( ) {

            assert removeFromChartButtonProductBikeLight.isDisplayed ( ) : "Button for removing from chart product bike light is not displayed. Expected to be there.";

            removeFromChartButtonProductBikeLight.click ( );

        }

        /**
         * THIS Method  remove Back-Pack product
         */

        public void removeFromChartButtonProductBackPack ( ) {

            assert removeFromChartButtonProductBackPack.isDisplayed ( ) : "Button for removing from chart product back pack is not displayed. Expected to be there.";

            removeFromChartButtonProductBackPack.click ( );

        }

        /**
         * THIS Method  remove Bolt Shirt product
         */

        public void removeFromChartButtonProductBoltShirt ( ) {

            assert removeFromChartButtonProductBoltShirt.isDisplayed ( ) : "Button for removing from chart product bolt shirt is not displayed. Expected to be there.";

            removeFromChartButtonProductBoltShirt.click ( );

        }

        /**
         * THIS Method  remove Labs Onesie product
         */

        public void removeFromChartButtonProductLabsOnesie ( ) {

            assert removeFromChartButtonProductLabsOnesie.isDisplayed ( ) : "Button for removing from chart product labs onesie is not displayed. Expected to be there.";

            removeFromChartButtonProductLabsOnesie.click ( );

        }

        /**
         * THIS Method  remove Fleece Jacket product
         */

        public void removeFromChartButtonProductFleeceJacket ( ) {

            assert removeFromChartButtonProductFleeceJacket.isDisplayed ( ) : "Button for removing from chart product fleece jacket is not displayed. Expected to be there.";

            removeFromChartButtonProductFleeceJacket.click ( );

        }

        /**
         * THIS Method  remove Red T-Shirt product
         */

        public void removeFromChartButtonProductShirtRed ( ) {

            assert removeFromChartButtonProductShirtRed.isDisplayed ( ) : "Button for removing from chart product red t-shirt is not displayed. Expected to be there.";

            removeFromChartButtonProductShirtRed.click ( );

        }

}





