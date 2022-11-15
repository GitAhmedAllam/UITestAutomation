package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;
    private By register = By.linkText("Register");
    private By login =By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");



    public HomePage (WebDriver driver){ this.driver = driver;}

    public RegisterPage clickRegister(){
        WebElement RegisterPage = driver.findElement(register);
        RegisterPage.click();
        return new RegisterPage(driver);
    }

    public LoginPage clickLogin(){
        WebElement LoginPage = driver.findElement(login);
        LoginPage.click();
        return new LoginPage(driver);
    }




}
