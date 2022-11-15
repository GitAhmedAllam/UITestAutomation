package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GoodPage {

    private WebDriver driver;
    private By toCart = By.id("add-to-cart-button-25");
    private By selectSize= By.id("product_attribute_9");
    private By addToWishlist= By.id("add-to-wishlist-button-25");
    private By compareList = By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[10]/div[2]/button");
    private By cartPage = By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");

    public GoodPage (WebDriver driver){this.driver = driver;}

    public void setSelectSize(){

        Select select = new Select(driver.findElement(selectSize));
        select.selectByIndex(23);
    }
    public void addToCart(){
        WebElement cart = driver.findElement(toCart);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", cart);
        cart.click();
    }
    public void addItToWishlist(){
        WebElement list = driver.findElement(addToWishlist);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", list);
        list.click();
    }
    public void addToCompare(){
        WebElement compareListField = driver.findElement(compareList);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", compareListField);
        compareListField.click();
    }

    public CartPage moveToCart(){
        Actions actions = new Actions(driver);
        actions.scrollByAmount(-1000,0);
        driver.findElement(cartPage).click();

        return new CartPage(driver);
    }

}
