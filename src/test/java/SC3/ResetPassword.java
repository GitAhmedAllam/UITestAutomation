package SC3;

import Base.BaseTest;
import Pages.ForgetPasswordPage;
import Pages.LoginPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ResetPassword extends BaseTest {

    @Test
    public void resetTheUserPassword(){
        LoginPage loginPage = homepage.clickLogin();
        ForgetPasswordPage forgetPasswordPage = loginPage.clickForgetPassword();
        forgetPasswordPage.addTheEmail("test@test.test");
        forgetPasswordPage.clickRecovery();
        assertEquals(forgetPasswordPage.getLoadedText(),
                "Email with instructions has been sent to you.", "Fail");
    }


}
