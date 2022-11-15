package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    private WebDriver driver;
    private By acceptTerms= By.id("termsofservice");
    private By checkout = By.id("checkout");

    public CartPage(WebDriver driver){this.driver = driver;}

    public CheckoutPage clickCheckout (){
        WebElement checkButton = driver.findElement(checkout);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", checkButton);
        driver.findElement(acceptTerms).click();
        checkButton.click();
        return new CheckoutPage(driver);
    }

}
