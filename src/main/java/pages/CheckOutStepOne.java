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

        public void enterFirstName( String firstName) {

            firstNameField.sendKeys(Strings.FIRST_NAME);

        }

        /**
         * THIS Method  enters last name to form
         */

        public void enterLastName( String lastName ) {

            lastNameField.sendKeys(Strings.LAST_NAME);

        }

        /**
         * THIS Method  enters zip code to form
         */

        public void enterZipCode( String zipCode ) {

            zipCodeField.sendKeys(Strings.ZIP_CODE);

        }

        /**
         * THIS Method  click CONTINUE button
         */

        public void clickContinueButton( ) {

            continueButton.click();

        }

        /**
         * THIS Method  click CANCEL button
         */

        public void clickCancelButton( ) {

            cancelButton.click();

        }

}
