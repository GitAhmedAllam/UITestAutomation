package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class LoginPage {

    private WebDriver driver;
    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By loginButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
    private By forgetPassword = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[3]/span/a");

    public LoginPage (WebDriver driver){this.driver = driver;}

    public void addLoginData(String email, String password){
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
    }

    public AfterloginPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new AfterloginPage(driver);
    }

    public ForgetPasswordPage clickForgetPassword(){
        driver.findElement(forgetPassword).click();
        return new ForgetPasswordPage(driver);
    }

}
