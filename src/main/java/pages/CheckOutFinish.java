package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class CheckOutFinish extends MainPage {

    //Looking for WebElements

    @FindBy( xpath = "//h2[@class = 'complete-header']" )
    WebElement headerText;

    //constructor

    public CheckOutFinish(ChromeDriver driver ) {

        super ( driver );

        assert driver.getCurrentUrl().equals( Strings.CHECKOUT_COMPLETE_URL ) : "User is not on Checkout page";

    }

        /**
         * THIS Method  verify that purchase was successful
         */

        public String getHeaderText() {

            assert headerText.isDisplayed() : "Header is NOT shown on page";

            String actualText = headerText.getText();

            return  actualText;

        }

}
