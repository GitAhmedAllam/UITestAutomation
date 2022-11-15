package SC6;

import Base.BaseTest;
import Pages.*;
import org.testng.annotations.Test;

public class SelectCategory extends BaseTest {

    @Test
    public void selectTheCategory(){
        LoginPage loginPage = homepage.clickLogin();
        loginPage.addLoginData("test@test.test", "password");
        AfterloginPage afterloginPage = loginPage.clickLoginButton();
        afterloginPage.searchForProduct("IPhone");
        SearchPage searchPage = afterloginPage.clickSearch();
        ApparelPage apparelPage = searchPage.openApparel();
        ShoesPage shoesPage = apparelPage.openShoes();

    }

}
