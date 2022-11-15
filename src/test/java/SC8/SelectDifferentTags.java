package SC8;

import Base.BaseTest;
import Pages.*;
import org.testng.annotations.Test;

public class SelectDifferentTags extends BaseTest {

    @Test
    public void testSelectDifferentTags(){
        LoginPage loginPage = homepage.clickLogin();
        loginPage.addLoginData("test@test.test", "password");
        AfterloginPage afterloginPage = loginPage.clickLoginButton();
        afterloginPage.searchForProduct("IPhone");
        SearchPage searchPage = afterloginPage.clickSearch();
        ApparelPage apparelPage = searchPage.openApparel();
        ShoesPage shoesPage = apparelPage.openShoes();
        shoesPage.clickTage();

    }
}
