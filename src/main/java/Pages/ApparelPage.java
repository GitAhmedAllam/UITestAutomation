package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ApparelPage {

    private WebDriver driver;

    private By shoes = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img");
    public ApparelPage (WebDriver driver){this.driver = driver;}


    public ShoesPage openShoes(){
        Actions actions = new Actions(driver);
        WebElement shoesBox = driver.findElement(shoes);
        actions.moveToElement(shoesBox);
        actions.click().build().perform();
        return new ShoesPage(driver);
    }
}
