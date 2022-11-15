package Base;

import Pages.HomePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homepage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void NavigateToHomePage(){
        driver.get("https://demo.nopcommerce.com/");
        homepage = new HomePage(driver);
    }

//    @AfterMethod
//    public void recordFailure(ITestResult result){
//        if (ITestResult.FAILURE==result.getStatus()){
//            TakesScreenshot camera = (TakesScreenshot)driver;
//            File screenshot = camera.getScreenshotAs(OutputType.FILE);
//            try {
//                Files.move(screenshot, new File("resources/Screenshots/" + result.getName() + " .png"));
//                }catch (IOException e){
//                e.printStackTrace();
//            }
//        }
//
//    }

    @AfterClass
    public void tearDown(){driver.quit();}
}
