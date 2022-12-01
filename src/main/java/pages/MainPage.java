package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage {


    //Looking for WebElements

    @FindBy ( xpath = "//a [ @class = 'shopping_cart_link' ]" )
    WebElement shoppingChartIcon;

    @FindBy ( xpath = "//span [ @class = 'shopping_cart_badge' ]" )
    WebElement shoppingChartBadge;

    @FindBy ( xpath = "//button [ @id = 'add-to-cart-sauce-labs-bike-light' ]" )
    WebElement addToChartButtonProductBikeLight;

    @FindBy ( xpath = "//button [ @id = 'add-to-cart-sauce-labs-backpack' ]" )
    WebElement addToChartButtonProductBackPack;

    @FindBy ( xpath = "//button [ @id = 'add-to-cart-sauce-labs-bolt-t-shirt' ]" )
    WebElement addToChartButtonProductBoltShirt;

    @FindBy ( xpath = "//button [ @id = 'add-to-cart-sauce-labs-fleece-jacket' ]" )
    WebElement addToChartButtonProductFleeceJacket;

    @FindBy ( xpath = "//button [ @id = 'add-to-cart-sauce-labs-onesie' ]" )
    WebElement addToChartButtonProductLabsOnesie;

    @FindBy ( xpath = "//button [ @id = 'add-to-cart-test.allthethings()-t-shirt-(red)' ]" )
    WebElement addToChartButtonProductShirtRed;

    @FindBy ( xpath = "//div [ @class = 'inventory_item_price' ]" )
    WebElement inventoryItemPrice;

    @FindBy ( xpath = "//button [ @id = 'remove-add-to-cart-sauce-labs-bike-light' ]" )
    WebElement removeFromChartButtonProductBikeLight;

    @FindBy ( xpath = "//button [ @id = 'remove-add-to-cart-sauce-labs-backpack' ]" )
    WebElement removeFromChartButtonProductBackPack;

    @FindBy ( xpath = "//button [ @id = 'remove-add-to-cart-sauce-labs-bolt-t-shirt' ]" )
    WebElement removeFromChartButtonProductBoltShirt;

    @FindBy ( xpath = "//button [ @id = 'remove-add-to-cart-sauce-labs-fleece-jacket' ]" )
    WebElement removeFromChartButtonProductFleeceJacket;

    @FindBy ( xpath = "//button [ @id = 'remove-add-to-cart-sauce-labs-onesie' ]" )
    WebElement removeFromChartButtonProductLabsOnesie;

    @FindBy ( xpath = "//button [ @id = remove-test.allthethings()-t-shirt-(red)' ]" )
    WebElement removeFromChartButtonProductShirtRed;





    //Invoking Chrome driver

    public ChromeDriver driver = null;

    public static void text ( String txt ) {
        System.out.println ( txt );
    }

    //Constructor

    public MainPage ( ChromeDriver driver ) {

        this.driver = driver;
        PageFactory.initElements ( driver , this );
    }

    //Methods

    /**
     * THIS Method clicks on Chart icon
     */

    public void clickShoppingChartIcon ( ) {
        assert shoppingChartIcon.isDisplayed ( ) : "Shopping chart button is not displayed. Expected to be there.";
        text ( "CLICK on th shopping chart icon" );
        shoppingChartIcon.click ( );

    }

    /**
     * THIS Method get number of items in sopping chart
     */

    public Object getNumberFromShoppingChartBadge ( ) {
        assert shoppingChartIcon.isDisplayed ( ) : "Shopping chart badge is not display number of items. Expected to number of items be there.";
        text ( "Get number from shopping badge icon" );
        String number = shoppingChartBadge.getText ( );
        return number;
    }

    /**
     * THIS Method add Bike Light product
     */

    public void addToChartButtonProductBikeLight ( ) {
        assert addToChartButtonProductBikeLight.isDisplayed ( ) : "Button for adding to chart product bike light is not displayed. Expected to be there.";
        text ( "Click on button ADD TO CHART for Bike Light product" );
        addToChartButtonProductBikeLight.click ( );

    }

    /**
     * THIS Method  add Back Pack product
     */

    public void addToChartButtonProductBackPack ( ) {
        assert addToChartButtonProductBackPack.isDisplayed ( ) : "Button for adding to chart product back pack is not displayed. Expected to be there.";
        text ( "Click on button ADD TO CHART for Back pack product" );
        addToChartButtonProductBackPack.click ( );

    }

    /**
     * THIS Method  add Bolt Shirt product
     */

    public void addToChartButtonProductBoltShirt ( ) {
        assert addToChartButtonProductBoltShirt.isDisplayed ( ) : "Button for adding to chart product bolt shirt is not displayed. Expected to be there.";
        text ( "Click on button ADD TO CHART for Bolt shirt product" );
        addToChartButtonProductBackPack.click ( );

    }

    /**
     * THIS Method  add Labs Onesie product
     */

    public void addToChartButtonProductLabsOnesie ( ) {
        assert addToChartButtonProductLabsOnesie.isDisplayed ( ) : "Button for adding to chart product labs onesie is not displayed. Expected to be there.";
        text ( "Click on button ADD TO CHART for Labs Onies product" );
        addToChartButtonProductLabsOnesie.click ( );

    }

    /**
     * THIS Method  add Fleece Jacket product
     */

    public void addToChartButtonProductFleeceJacket ( ) {
        assert addToChartButtonProductFleeceJacket.isDisplayed ( ): "Button for adding to chart product fleece jacket is not displayed. Expected to be there.";
        text ( "Click on button ADD TO CHART for Fleece jacket product" );
        addToChartButtonProductFleeceJacket.click ( );

    }

    /**
     * THIS Method  add Red T-Shirt product
     */

    public void addToChartButtonProductShirtRed ( ) {
        assert addToChartButtonProductShirtRed.isDisplayed ( ) : "Button for adding to chart product red t-shirt is not displayed. Expected to be there.";
        text ( "Click on button ADD TO CHART for Fleece jacket product" );
        addToChartButtonProductShirtRed.click ( );

    }

    /**
     * THIS Method  check inventory price
     */

    public void inventoryItemPrice ( ) {
        assert inventoryItemPrice.isDisplayed ( ) : "Inventory price of product is not displayed. Expected to be there";


    }

    /**
     * THIS Method  remove Bike Light product
     */

    public void removeFromChartButtonProductBikeLight ( ) {
        assert removeFromChartButtonProductBikeLight.isDisplayed ( ) : "Button for removing from chart product bike light is not displayed. Expected to be there.";
        text ( "Click on button REMOVE for Bike Light product" );
        removeFromChartButtonProductBikeLight.click ( );

    }

    /**
     * THIS Method  remove Back Pack product
     */

    public void removeFromChartButtonProductBackPack ( ) {
        assert removeFromChartButtonProductBackPack.isDisplayed ( ) : "Button for removing from chart product back pack is not displayed. Expected to be there.";
        text ( "Click on button REMOVE for Back pack product" );
        removeFromChartButtonProductBackPack.click ( );

    }

    /**
     * THIS Method  remove Bolt Shirt product
     */

    public void removeFromChartButtonProductBoltShirt ( ) {
        assert removeFromChartButtonProductBoltShirt.isDisplayed ( ) : "Button for removing from chart product bolt shirt is not displayed. Expected to be there.";
        text ( "Click on button REMOVE for Bolt shirt product" );
        removeFromChartButtonProductBoltShirt.click ( );

    }

    /**
     * THIS Method  remove Labs Onesie product
     */

    public void removeFromChartButtonProductLabsOnesie ( ) {
        assert removeFromChartButtonProductLabsOnesie.isDisplayed ( ) : "Button for removing from chart product labs onesie is not displayed. Expected to be there.";
        text ( "Click on button REMOVE for Labs Onies product" );
        removeFromChartButtonProductLabsOnesie.click ( );

    }

    /**
     * THIS Method  remove Fleece Jacket product
     */

    public void removeFromChartButtonProductFleeceJacket ( ) {
        assert removeFromChartButtonProductFleeceJacket.isDisplayed ( ) : "Button for removing from chart product fleece jacket is not displayed. Expected to be there.";
        text ( "Click on button REMOVE for Fleece jacket product" );
        removeFromChartButtonProductFleeceJacket.click ( );

    }

    /**
     * THIS Method  remove Red T-Shirt product
     */

    public void removeFromChartButtonProductShirtRed ( ) {
        assert removeFromChartButtonProductShirtRed.isDisplayed ( ) : "Button for removing from chart product red t-shirt is not displayed. Expected to be there.";
        text ( "Click on button REMOVE for Fleece jacket product" );
        removeFromChartButtonProductShirtRed.click ( );

    }




}




















