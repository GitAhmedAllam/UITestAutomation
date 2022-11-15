package SC1;

import Base.BaseTest;
import Pages.HomePage;
import Pages.RegisterConfirmationPage;
import Pages.RegisterPage;
import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.*;

public class RegisterNewUser extends BaseTest {

    @Test
    public void testRegisterNewUser() {

        //Generate a random number to be added to the email.
        Random random = new Random();
        int upperbound= 100;
        int emailNumber = random.nextInt(upperbound);
        String theEmail = "a.allam" + emailNumber + "@gmail.com";

        RegisterPage registerPage = homepage.clickRegister();
        registerPage.selectGender();
        registerPage.setData("Ahmed", "Allam", theEmail,
                "Password", "Password");
        RegisterConfirmationPage registerConfirmationPage = registerPage.clickRegister();
        assertEquals(registerConfirmationPage.getLoadedText(),
                "Your registration completed", "Fail");

        HomePage homePage = registerConfirmationPage.clickLogout();
    }


}
