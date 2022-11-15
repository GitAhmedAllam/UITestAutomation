package SC5;

import Base.BaseTest;
import Pages.AfterloginPage;
import Pages.LoginPage;
import Pages.SearchPage;
import org.testng.annotations.Test;

public class ChangeCurrency extends BaseTest {

    @Test
    public void changeTheCurrency(){
        LoginPage loginPage = homepage.clickLogin();
        loginPage.addLoginData("test@test.test", "password");
        AfterloginPage afterloginPage = loginPage.clickLoginButton();
        afterloginPage.searchForProduct("IPhone");
        SearchPage searchPage = afterloginPage.clickSearch();
        searchPage.changeTheCurrency("Euro");
    }
}
