package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //Looking for WebElements

    @FindBy ( xpath = "//input [ @id = 'user-name' ]" )
    WebElement userNameField;

    @FindBy ( xpath = "//input [ @id = 'password' ]" )
    WebElement passwordField;

    @FindBy ( xpath = "//input [ @id = 'login-button' ]" )
    WebElement loginButton;

    //This is needed for using methods over Chrome driver

    ChromeDriver driver = null;

    //Constructor

    public LoginPage ( ChromeDriver driver ) {
        this.driver = driver;
        driver.get ( Strings.LOGIN_PAGE_URL );
        PageFactory.initElements ( driver , this );
        assert driver.getCurrentUrl ( ).equals ( Strings.LOGIN_PAGE_URL ) : "User is not on the Login page";

    }

    /**
     * THIS method clicks on the username field and enter username
     * @param userName
     */

    public void logInUser(String userName, String password) {

        userNameField.click ( );
        userNameField.sendKeys ( userName);
        passwordField.click ( );
        passwordField.sendKeys ( password );
        loginButton.click ();
    }

    public void enterUserName ( String name ) {
        assert userNameField.isDisplayed ( ) : "Username field is not present";
        userNameField.click ( );
        userNameField.sendKeys ( name);
    }

    /**
     * THIS method clicks on the password field and enter password
     * @param password
     */

    public void enterPassword ( String password ) {
        assert passwordField.isDisplayed ( ) : "Password field is not present";
        passwordField.click ( );
        passwordField.sendKeys ( password );
    }

    /**
     * THIS method clicks on the login button
     */

    public void clickLoginButton ( ) {
        assert loginButton.isDisplayed ( ) : "Login button is not present";
        loginButton.click ( );
    }


}
