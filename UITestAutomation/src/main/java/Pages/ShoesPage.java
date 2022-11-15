package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoesPage {

    private WebDriver driver;
    private By color = By.id("attribute-option-14");
    private By tagA = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[5]/div[2]/div[1]/ul/li[2]/a");
    private By adidas = By.linkText("adidas Consortium Campus 80s Running Shoes");



    public ShoesPage (WebDriver driver){ this.driver = driver;}

    public void selectColor(){
        driver.findElement(color).click();
    }

    public PopularTagsPage clickTage(){
        WebElement awesome = driver.findElement(tagA);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", awesome);
        awesome.click();
        return new PopularTagsPage(driver);
    }

    public GoodPage clickAdidas(){
        WebElement good = driver.findElement(adidas);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", good);
        good.click();
        return new GoodPage(driver);
    }

}
