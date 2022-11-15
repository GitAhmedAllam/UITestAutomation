package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AfterloginPage {


    private WebDriver driver;
    private By welcomeMessage = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[2]/div[1]/h2");
    private By searchBox =By.id("small-searchterms");
    private By searchButton = By.xpath("//*[@id=\"small-search-box-form\"]/button");

    public AfterloginPage(WebDriver driver){this.driver = driver;}

    public String getLoadedText(){
        Actions at = new Actions(driver);
        at.sendKeys(Keys.PAGE_DOWN).build().perform();
        return driver.findElement(welcomeMessage).getText();
    }

    public void searchForProduct(String product){
        driver.findElement(searchBox).sendKeys(product);
    }

    public SearchPage clickSearch(){
        driver.findElement(searchButton).click();
        return new SearchPage(driver);
    }


}
