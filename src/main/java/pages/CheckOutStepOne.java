package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class CheckOutStepOne extends MainPage{

    //Looking for WebElements

    @FindBy(xpath = "//input[@data-test = 'firstName']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@data-test = 'lastName']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@data-test = 'postalCode']")
    WebElement zipCodeField;

    @FindBy(xpath = "//input[@data-test = 'continue']")
    WebElement continueButton;

    @FindBy(xpath = "//button[@data-test = 'cancel']")
    WebElement cancelButton;

    //Constructor

    public CheckOutStepOne ( ChromeDriver driver ) {
        super ( driver );
        assert driver.getCurrentUrl().equals(Strings.CHECKOUT_STEP_ONE_URL) : "Wrong page. Expected "
                                                                              + Strings.CHECKOUT_STEP_ONE_URL + " . Actual " + driver.getCurrentUrl();

    }

    //Methods

    /**
     * THIS Method  enters first name in form
     */

    public void enterFirstName( String firstNamec) {
        text("Entering First Name" );
        firstNameField.sendKeys(Strings.FIRST_NAME);
    }

    /**
     * THIS Method  enters last name to form
     */

    public void enterLastName( String lastName ) {
        text ("Entering Last Name" );
        lastNameField.sendKeys(Strings.LAST_NAME);
    }

    /**
     * THIS Method  enters zip code to form
     */

    public void enterZipCode( String zipCode ) {
        text ("Entering Zip Code" );
        zipCodeField.sendKeys(Strings.ZIP_CODE);
    }

    /**
     * THIS Method  click CONTINUE button
     */

    public void clickContinueButton( ) {
        text ("click CONTINUE Button" );
        continueButton.click();

    }

    /**
     * THIS Method  click CANCEL button
     */

    public void clickCancelButton( ) {
        text ("click CONTINUE Button" );
        cancelButton.click();

    }



}
