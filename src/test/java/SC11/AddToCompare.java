package SC11;

import Base.BaseTest;
import Pages.*;
import org.testng.annotations.Test;

public class AddToCompare extends BaseTest {

    @Test
    public void addToWishList() {

        LoginPage loginPage = homepage.clickLogin();
        loginPage.addLoginData("test@test.test", "password");
        AfterloginPage afterloginPage = loginPage.clickLoginButton();
        afterloginPage.searchForProduct("IPhone");
        SearchPage searchPage = afterloginPage.clickSearch();
        ApparelPage apparelPage = searchPage.openApparel();
        ShoesPage shoesPage = apparelPage.openShoes();
        GoodPage goodPage = shoesPage.clickAdidas();
        goodPage.setSelectSize();
        goodPage.addToCompare();
    }

}
