package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {

    private WebDriver driver;
    private By changeCurrency = By.id("customerCurrency");
    private By apparel = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[3]/a");


    public SearchPage(WebDriver driver){this.driver = driver;}

    public void changeTheCurrency(String currencyValue){
        Select select = new Select(driver.findElement(changeCurrency));
        select.selectByValue(currencyValue);
    }

    public ApparelPage openApparel(){
        driver.findElement(apparel).click();
        return new ApparelPage(driver);
    }

}
