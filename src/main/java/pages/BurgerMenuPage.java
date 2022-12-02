package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BurgerMenuPage {

    //Looking for WebElements

    @FindBy( xpath = "//button [ @id = 'react-burger-menu-btn' ]" )
    static
    WebElement burgerMenuButton;

    @FindBy ( xpath = "//a [ @id = 'inventory_sidebar_link' ]" )
    static
    WebElement allItems;

    @FindBy ( xpath = "//a [ @id = 'about_sidebar_link' ]" )
    static
    WebElement about;

    @FindBy ( xpath = "//a [ @id = 'logout_sidebar_link' ]" )
    static
    WebElement logout;

    @FindBy ( xpath = "//a[ @id = 'logout_sidebar_link' ]" )
    static
    WebElement resetAppState;



    //Invoking Chrome driver

    public ChromeDriver driver = null;

    public static void text ( String txt ) { System.out.println ( txt ); }

    //Constructor

    public BurgerMenuPage(ChromeDriver driver) {

        this.driver = driver;
        PageFactory.initElements ( driver , this );
    }

    //Methods

    /**
     * THIS Method clicks on burger menu icon
     */

    public void burgerMenuButton() {
        //assert burgerMenuButton.isDisplayed ( ) : "Expected burger button is displayed. Expected to be there.";
        text ( "Click on product sorting filter list" );
        burgerMenuButton.click ( );
    }


    /**
     * THIS Method clicks on ALL ITEMS link
     */

    public static void allItems ( ) {
        assert allItems.isDisplayed ( ) : "Expected ALL ITEMS link is displayed. Expected to be there.";
        text( "Click on link ALL ITEMS");
        allItems.click();
    }

    /**
     * THIS Method clicks on ABOUT link
     */

    public static void about ( ) {
        //assert about.isDisplayed ( ) : "Expected about link is displayed. Expected to be there.";
        text( "Click on link ABOUT");
        about.click();

    }

    /**
     * THIS Method clicks on RESET APP STAGE
     */

    public static void reset ( ) {
        //assert resetAppState.isDisplayed ( ) : "Expected about link is displayed. Expected to be there.";
        text( "Click on link ALL ITEMS");
        resetAppState.click();
    }

    /**
     * THIS Method clicks on LOGOUT link
     */

    public static void logout ( ) {
        //assert logout.isDisplayed ( ) : "Expected burger button is displayed. Expected to be there.";
        text( "Click on link LOGOUT");
        logout.click();

    }

}
