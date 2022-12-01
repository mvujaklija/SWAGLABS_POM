package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BurgerMenuPage {

    //Looking for WebElements

    @FindBy( xpath = "//button [ @id = 'react-burger-menu-btn' ]" )
    WebElement burgerMenuButton;

    @FindBy ( xpath = "//nav/a [ @id = 'inventory_sidebar_link' ]" )
    WebElement allItems;

    @FindBy ( xpath = "//nav/a [ @id = 'about_sidebar_link' ]" )
    WebElement about;

    @FindBy ( xpath = "//nav/a [ @id = 'logout_sidebar_link' ]" )
    WebElement logout;

    @FindBy ( xpath = "//nav/a[ @id = 'logout_sidebar_link' ]" )
    WebElement resetAppState;



    //Invoking Chrome driver

    public ChromeDriver driver = null;

    public static void text ( String txt ) { System.out.println ( txt ); }

    //Constructor

    public BurgerMenuPage(ChromeDriver driver ) {

        this.driver = driver;
        PageFactory.initElements ( driver , this );
    }

    //Methods

    /**
     * THIS Method clicks on burger menu icon
     */

    public void burgerMenuButton ( ) {
        assert burgerMenuButton.isDisplayed ( ) : "Expected burger button is displayed. Expected to be there.";
        text ( "Click on product sorting filter list" );
        burgerMenuButton.click ( );
    }


    /**
     * THIS Method clicks on ALL ITEMS link
     */

    public void allItems ( ) {
        text( "Click on link ALL ITEMS");
        allItems.click();
    }

    /**
     * THIS Method clicks on ABOUT link
     */

    public void about ( ) {
        text( "Click on link ABOUT");
        about.click();

    }

    /**
     * THIS Method clicks on LOGOUT link
     */

    public void logout ( ) {
        text( "Click on link LOGOUT");
        logout.click();
    }

    /**
     * THIS Method clicks on RESET APP STAGE
     */

    public void reset ( ) {
        text( "Click on link ALL ITEMS");
        resetAppState.click();
    }

}
