package SC9;

import Base.BaseTest;
import Pages.*;
import org.testng.annotations.Test;

public class AddToCart extends BaseTest {

    @Test
    public void testAddToCart(){
        LoginPage loginPage = homepage.clickLogin();
        loginPage.addLoginData("test@test.test", "password");
        AfterloginPage afterloginPage = loginPage.clickLoginButton();
        afterloginPage.searchForProduct("IPhone");
        SearchPage searchPage = afterloginPage.clickSearch();
        ApparelPage apparelPage = searchPage.openApparel();
        ShoesPage shoesPage = apparelPage.openShoes();
        GoodPage goodPage = shoesPage.clickAdidas();
        goodPage.setSelectSize();
        goodPage.addToCart();
    }

}
