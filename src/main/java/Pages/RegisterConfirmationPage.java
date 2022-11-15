package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterConfirmationPage {
    private WebDriver driver;
    private By loadedText = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]");
    private By logoutButton = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");


    public RegisterConfirmationPage(WebDriver driver){this.driver = driver;}

    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }

    public HomePage clickLogout(){
        driver.findElement(logoutButton).click();
        return new HomePage(driver);
    }

}
