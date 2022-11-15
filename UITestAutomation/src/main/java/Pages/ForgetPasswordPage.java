package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {

    private WebDriver driver;
    private By email = By.id("Email");
    private By recoverButton = By.name("send-email");

    private By loadedText = By.xpath("//*[@id=\"bar-notification\"]/div/p");
    public ForgetPasswordPage(WebDriver driver){this.driver = driver;}

    public void addTheEmail(String theEmail){
        driver.findElement(email).sendKeys(theEmail);
    }

    public void clickRecovery(){
        driver.findElement(recoverButton).click();
    }

    public String getLoadedText(){
        return driver.findElement(loadedText).getText();

    }

}
