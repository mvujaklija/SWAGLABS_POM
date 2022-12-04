package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BurgerMenuPage {

    //Looking for WebElements

    @FindBy( xpath = "//button [ @id = 'react-burger-menu-btn' ]" )

    WebElement burgerMenuButton;

    @FindBy( xpath = "//div [ @class = 'bm-cross-button' ]" )

    WebElement burgerMenuClose;

    @FindBy ( xpath = "//nav/a [ @id = 'inventory_sidebar_link' ]" )

    WebElement clickLinkAllItems;

    @FindBy ( xpath = "//nav/a [ @id = 'about_sidebar_link' ]" )

    WebElement clickLinkAbout;

    @FindBy ( xpath = "//nav/a[ @id = 'reset_sidebar_link' ]" )

    WebElement resetAppState;

    @FindBy ( xpath = "//nav/a [ @id = 'logout_sidebar_link' ]" )

    WebElement logout;

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
         * THIS Method opens burger menu icon
         */

        public void burgerMenuButton() {

            assert burgerMenuButton.isDisplayed ( ) : "Expected burger button is displayed. Expected to be there.";

            burgerMenuButton.click ( );

        }

    /**
     * THIS Method close burger menu icon
     */

    public void burgerMenuClose() {

        assert burgerMenuClose.isDisplayed ( ) : "Expected burger button is displayed. Expected to be there.";

        burgerMenuClose.click ( );

    }

        /**
         * THIS Method clicks on ALL ITEMS link
         */

        public void clickLinkAllItems ( ) {

            clickLinkAllItems.click();
        }

        /**
         * THIS Method clicks on ABOUT link
         */

        public void clickLinkAbout( ) {

           clickLinkAbout.click();

        }

        /**
         * THIS Method clicks on RESET APP STAGE
         */

        public void reset ( ) {

            resetAppState.click();

        }

        /**
         * THIS Method clicks on LOGOUT link
         */

        public void logout ( ) {

            logout.click();

        }

}
