package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocialMediaPage {

    //Looking for WebElements

    @FindBy( xpath = "//a [ @href = 'https://twitter.com/saucelabs' ]" )
    WebElement twitterButton;

    @FindBy ( xpath = "//a [ @href = 'https://www.facebook.com/saucelabs' ]" )
    WebElement facebookButton;

    @FindBy ( xpath = "//a[ @href = 'https://www.linkedin.com/company/sauce-labs/' ]" )
    WebElement linkedinButton;

    //Invoking Chrome driver

    public ChromeDriver driver = null;

    public static void text ( String txt ) { System.out.println ( txt ); }

    //Constructor

    public SocialMediaPage(ChromeDriver driver ) {

        this.driver = driver;
        PageFactory.initElements ( driver , this );
    }

        //Methods

        /**
         * THIS Method  redirect to Twitter page
         */

        public void testTwitterButton ( ) {

            assert twitterButton.isDisplayed ( ) : "Twitter button is not present. Expected to be there";

            twitterButton.click ( );

        }

        /**
         * THIS Method  redirect to Facebook page
         */

        public void testFacebookButton ( ) {

            assert facebookButton.isDisplayed ( ) : "Facebook button is not present. Expected to be there";

            facebookButton.click ( );

        }

        /**
         * THIS Method  redirect to LikedIn page
         */

        public void testLinkedinButton ( ) {
            assert linkedinButton.isDisplayed ( ) : "LinkedIn button is not present. Expected to be there";

            linkedinButton.click ();

        }

}
