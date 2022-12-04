package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SortingPage {

    @FindBy(xpath = "//select [ @class = 'product_sort_container' ]")
    WebElement dropDownList;



    //Invoking Chrome driver

    public ChromeDriver driver = null;

    public static void text(String txt) {
        System.out.println(txt);
    }

    //Constructor

    public SortingPage(ChromeDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

        //Methods

        //Sorting of products by price low to high immediately

        /**
         * THIS Method sort elements on inventory page
         */

        public void dropDown() {

            assert dropDownList.isDisplayed() : "Dropdown list is not present. Expected to be there";

            text( "Click on the sorting filter");

            dropDownList.click();

        }

        /**
         * THIS Method select method of sorting from drop down list
         */

        public void selectSorting() {

            Select dropdown = new Select(dropDownList);

            text( "Here we chose option how to sort items");

            /*Here we use option to find element by visible text*/

            dropdown.selectByVisibleText("Price (low to high)");

        }

        public void results( ) {

            //Sort elements by price lov to high and check of sorting results

            text( "Checking sorting results");

            //Making list of elements after sorting

            List<WebElement> listOfItemsAfterSort = driver.findElements(By.id("//*[@class = 'inventory_item']"));

            ArrayList<Double> priceArray = new ArrayList();
            for ( WebElement item: listOfItemsAfterSort) {
                String price = item.findElement(By.xpath(".//div[@class = 'inventory_item_price']")).getText().replace("$" , "");
                Double priceLikeDecimal = Double.valueOf(price);
                priceArray.add(priceLikeDecimal);


            }

            text( "List of items:  " + priceArray.toString());

            //Checking is sorting is valid

            for (int i = 0; i < priceArray.size() - 1; i++) {

                assert priceArray.get(i) <= priceArray.get(i + 1) : " Prvi : " + priceArray.get(i) + " nije manji ili jednak od drugog " + priceArray.get(i + 1);

            }
        }


}



