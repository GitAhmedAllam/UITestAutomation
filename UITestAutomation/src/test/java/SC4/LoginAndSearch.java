package SC4;

import Base.BaseTest;
import Pages.AfterloginPage;
import Pages.LoginPage;
import Pages.SearchPage;
import org.testng.annotations.Test;

public class LoginAndSearch extends BaseTest {

    @Test
    public void loginAndSearch(){
        LoginPage loginPage = homepage.clickLogin();
        loginPage.addLoginData("test@test.test", "password");
        AfterloginPage afterloginPage = loginPage.clickLoginButton();
        afterloginPage.searchForProduct("IPhone");
        SearchPage searchPage = afterloginPage.clickSearch();

    }
}
