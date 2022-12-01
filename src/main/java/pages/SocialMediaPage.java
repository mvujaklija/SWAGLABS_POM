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

    public void testTwitterButton ( ) {
        assert twitterButton.isDisplayed ( ) : "Twitter button is not present. Expected to be there";
        text ( "Click on the Twitter button to go to SWAGLABS twitter page" );
        twitterButton.click ( );
    }

    /**
     * THIS Method  redirect to Facebook page
     */

    public void testFacebookButton ( ) {
        assert facebookButton.isDisplayed ( ) : "Facebook button is not present. Expected to be there";
        text ( "Click on the Facebook button to go to SWAGLABS facebook page" );
        facebookButton.click ( );
    }

    /**
     * THIS Method  redirect to LikedIn page
     */

    public void testLinkedinButton ( ) {
        assert linkedinButton.isDisplayed ( ) : "LinkedIn button is not present. Expected to be there";
        text ( "Click on the LinkedIn button to go to SWAGLABS LinkedIn page" );
        linkedinButton.click ();


    }

}
