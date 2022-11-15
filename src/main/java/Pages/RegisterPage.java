package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private WebDriver driver;
    private By gender = By.id("gender-male");
    private By firstName = By.id("FirstName");
    private By lastName = By.id("LastName");
//    private By dayDate = By;
//    private By monthDate = By;
//    private By yearDate = By;
    private By email = By.id("Email");
    private By firstPassword = By.id("Password");
    private By confirmPassword = By.id("ConfirmPassword");
    private By registerButton = By.id("register-button");

    public RegisterPage(WebDriver driver){this.driver = driver;}

    public void selectGender(){driver.findElement(gender).click();}

    public void setData(String FirstName, String LastName, String Email, String FirstPassword, String ConfirmPassword){
        driver.findElement(firstName).sendKeys(FirstName);
        driver.findElement(lastName).sendKeys(LastName);
        driver.findElement(email).sendKeys(Email);
        driver.findElement(firstPassword).sendKeys(FirstPassword);
        driver.findElement(confirmPassword).sendKeys(ConfirmPassword);
    }

    public RegisterConfirmationPage clickRegister(){
        driver.findElement(registerButton).click();
        return new RegisterConfirmationPage(driver);
        }

}
