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
        text ( "We are on the shopping chart page" );
        assert driver.getCurrentUrl ( ).equals ( Strings.SHOPPING_CART_PAGE_URL ) : "User is not on Shopping vhart page" + driver.getCurrentUrl ( );
    }

    //Methods

    /**
     * THIS method clicks on the CHECKOUT button
     */

    public void checkOutButton ( ) {

        assert checkOutButton.isDisplayed ( );
        text( "By clicking button CHECKOUT we are redirected to check out page to pay for the product/s");
        checkOutButton.click ();
    }

    /**
     * THIS method clicks on the CONTINUE SHOPPING button
     */

    public void continueShoppingButton ( ) {

        assert continueShoppingButton.isDisplayed ( );
        text ( "By clicking button CONTINUE SHOPPING we are redirected to inventory page and we can continue shopping" );
        continueShoppingButton.click ();

    }

    /**
     * THIS Method  remove Bike Light product
     */

    public void buttonRemoveBikeLight( ) {

        assert buttonRemoveBikeLight.isDisplayed ( );
        text( "By click on this button we remove product  BIKE LIGHT from chart" );
        buttonRemoveBikeLight.click ();
    }

    /**
     * THIS Method  remove Back Pack product
     */

    public void buttonRemoveBackPack( ) {

        assert buttonRemoveBackPack.isDisplayed ( );
        text( "By click on this button we remove product  BACK PACK from chart" );
        buttonRemoveBackPack.click ();
    }

    /**
     * THIS Method  remove Bolt Shirt product
     */

    public void buttonRemoveBoltShirt( ) {

        assert buttonRemoveBoltShirt.isDisplayed ( );
        text( "By click on this button we remove product  BOLT T-SHIRT from chart" );
        buttonRemoveBoltShirt.click ();
    }

    /**
     * THIS Method  remove Fleece Jacket product
     */

    public void buttonRemoveFleeceJacket( ) {

        assert buttonRemoveFleeceJacket.isDisplayed ( );
        text( "By click on this button we remove product  FLEECE JACKET from chart" );
        buttonRemoveBikeLight.click ();
    }

    /**
     * THIS Method  remove Labs Oneesie product
     */

    public void  buttonRemoveLabsOnesie( ) {

        assert buttonRemoveLabsOnesie.isDisplayed ( );
        text( "By click on this button we remove product  BIKE LIGHT from chart" );
        buttonRemoveLabsOnesie.click ();
    }

    /**
     * THIS Method  remove Red T-Shirt product
     */

    public void  buttonRemoveRedShirt( ) {

        assert buttonRemoveRedShirt.isDisplayed ( );
        text( "By click on this button we remove product  BIKE LIGHT from chart" );
        buttonRemoveRedShirt.click ();
    }

}