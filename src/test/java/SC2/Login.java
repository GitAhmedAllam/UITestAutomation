package SC2;

import Base.BaseTest;
import Pages.AfterloginPage;
import Pages.LoginPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Login extends BaseTest {


    @Test
    public void testLogin(){
        LoginPage loginPage = homepage.clickLogin();

        /*
        You may need to add a new username and password,
        as for this test website it seems the DB rest every ~5 min
         */

        loginPage.addLoginData("test@test.test", "password");
        AfterloginPage afterloginPage = loginPage.clickLoginButton();
        assertEquals(afterloginPage.getLoadedText(),
                "Welcome to our store", "Fail");
    }
}
