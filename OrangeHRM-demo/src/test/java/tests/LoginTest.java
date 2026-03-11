package tests;

import base.BaseTest;
import pages.LoginPage;
import pages.DashboardPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest()
    {
        LoginPage lp = new LoginPage(driver);

        lp.enterUsername("Admin");
        lp.enterPassword("admin123");
        lp.clickLogin();

        DashboardPage dp = new DashboardPage(driver);

        Assert.assertTrue(dp.verifyDashboard());
    }
}