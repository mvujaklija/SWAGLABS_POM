package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class CheckOutStepTwo extends MainPage {

        //Looking for WebElements

        @FindBy ( xpath = "//button[@id = 'finish']" )
        WebElement finishButton;

        //Constructor

        public CheckOutStepTwo ( ChromeDriver driver ) {
            super ( driver );
            assert driver.getCurrentUrl ( ).equals ( Strings.CHECKOUT_STEP_TWO_URL ) : "User is NOT on checkout two page";
        }

        //Methods

        /**
        * THIS Method clicks FINISH button
        */


        public void clickFinishButton ( ) {

            assert finishButton.isDisplayed ( ) : "Finish button is not present on page";

            finishButton.click ( );

        }

}

