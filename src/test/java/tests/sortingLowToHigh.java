package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Strings;

import java.util.ArrayList;
import java.util.List;

public class sortingLowToHigh extends BaseTest{

    /**
     * TEST BUY ONE ITEM
     * Steps
     * 1. Navigate to a login page
     * 2. Filed out user-name and password field with valid data
     * 3. Click on the LOGIN Button
     * 4. On inventory page select dropdown menu
     * 5. Click on the sorting by price low to high
     *
     *
     * Expected results
     * 6. User is successfully sort items and assert that
     */

    @Test

    public void sortProductsByPrice( ) {

        //Invoking Chrome driver

        ChromeDriver driver = openChromeDriver();

        try {

            //Login

            text("Login to SWAGLABS Sauce Demo");
            LoginPage loginPage = new LoginPage(driver);
            loginPage.logInUser(Strings.VALID_USERNAME, Strings.VALID_PASSWORD);

            //Sorting of products by price low to high immediately

            WebElement dropdownList = driver.findElement(By.xpath("//select"));
            Select dropdown = new Select(dropdownList);
            dropdown.selectByVisibleText("Price (low to high)");

            List<WebElement> listOfItemsAfterSort = driver.findElements(By.xpath("//*[@class = 'inventory_item']"));


            ArrayList<Double> priceArray = new ArrayList<Double>();
            for (WebElement item : listOfItemsAfterSort) {

                String price = item.findElement(By.xpath(".//div[@class = 'inventory_item_price']")).getText().replace("$", "");
                Double priceLikeDecimal = Double.valueOf(price);

                priceArray.add(priceLikeDecimal);
            }

            //Print of Price array

            System.out.println("List of items  " + priceArray.toString());

            //Check out is it sorting successful

            for (int i = 0; i < priceArray.size() - 1; i++) {

                assert priceArray.get(i) <= priceArray.get(i + 1) : "First: " + priceArray.get(i) + "it is not smaleer or equal to " + priceArray.get(i + 1);


            }
        }
        finally {

            driver.quit();

        }

    }

}

