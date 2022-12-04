package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ShoppingChartPage extends MainPage {

    //Looking for WebElements

    @FindBy ( xpath = "//button [ @id = 'checkout' ]" )
    WebElement checkOutButton;

    @FindBy ( xpath = "//button [@id = 'continue-shopping' ]" )
    WebElement continueShoppingButton;

    @FindBy ( xpath = "//button [ @id = 'remove-sauce-labs-bike-light' ]" )
    WebElement buttonRemoveBikeLight;

    @FindBy ( xpath = "//button [ @id = 'remove-sauce-labs-backpack' ]" )
    WebElement buttonRemoveBackPack;

    @FindBy ( xpath = "//button [ @id = 'remove-sauce-labs-bolt-t-shirt' ]" )
    WebElement buttonRemoveBoltShirt;

    @FindBy ( xpath = "//button [ @id = 'remove-sauce-labs-fleece-jacket' ]" )
    WebElement buttonRemoveFleeceJacket;

    @FindBy ( xpath = "//button [ @id = 'remove-sauce-labs-onesie' ]" )
    WebElement  buttonRemoveLabsOnesie;

    @FindBy ( xpath = "//button [ @id = 'remove-test.allthethings()-t-shirt-(red)' ]" )
    WebElement  buttonRemoveRedShirt;


    //Constructor

    public ShoppingChartPage ( ChromeDriver driver ) {
        super ( driver );

        assert driver.getCurrentUrl ( ).equals ( Strings.SHOPPING_CART_PAGE_URL ) : "User is not on Shopping vhart page" + driver.getCurrentUrl ( );
    }

        //Methods

        /**
         * THIS method clicks on the CHECKOUT button
         */

        public void checkOutButton ( ) {

            assert checkOutButton.isDisplayed ( );

            checkOutButton.click ();
        }

        /**
         * THIS method clicks on the CONTINUE SHOPPING button
         */

        public void continueShoppingButton ( ) {

            assert continueShoppingButton.isDisplayed ( );

            continueShoppingButton.click ();

        }

        /**
         * THIS Method  remove Bike Light product
         */

        public void buttonRemoveBikeLight( ) {

            assert buttonRemoveBikeLight.isDisplayed ( );

            buttonRemoveBikeLight.click ();

        }

        /**
         * THIS Method  remove Back Pack product
         */

        public void buttonRemoveBackPack( ) {

            assert buttonRemoveBackPack.isDisplayed ( );

            buttonRemoveBackPack.click ();

        }

        /**
         * THIS Method  remove Bolt Shirt product
         */

        public void buttonRemoveBoltShirt( ) {

            assert buttonRemoveBoltShirt.isDisplayed ( );

            buttonRemoveBoltShirt.click ();

        }

        /**
         * THIS Method  remove Fleece Jacket product
         */

        public void buttonRemoveFleeceJacket( ) {

            assert buttonRemoveFleeceJacket.isDisplayed ( );

            buttonRemoveBikeLight.click ();

        }

        /**
         * THIS Method  remove Labs Oneesie product
         */

        public void  buttonRemoveLabsOnesie( ) {

            assert buttonRemoveLabsOnesie.isDisplayed ( );

            buttonRemoveLabsOnesie.click ();

        }

        /**
         * THIS Method  remove Red T-Shirt product
         */

        public void  buttonRemoveRedShirt( ) {

            assert buttonRemoveRedShirt.isDisplayed ( );

            buttonRemoveRedShirt.click ();

        }

}