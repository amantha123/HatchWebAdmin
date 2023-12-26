package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.DashboardPage;
import com.pack.pages.LoginPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    TestUtil testUtil;

    public DashboardPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test(priority=1)
    public void verifyDashboardPageTitleTest(){
        String homePageTitle = dashboardPage.verifyDashboardPageTitle();
        Assert.assertEquals(homePageTitle, "Hatch - Admin");
    }

    @Test(priority=2)
    public void verifyLabelTest() {
        Assert.assertTrue(dashboardPage.verifyLabel());
    }

    @Test(priority = 3)
    public void verifyHatchUsersLabelTest(){
        Assert.assertTrue(dashboardPage.verifyHatchUsersLabel());
    }

    @Test(priority = 4)
    public void verifyHatchUsersCountTest(){
        Assert.assertTrue(dashboardPage.verifyHatchUsersCount());
    }

    @Test(priority = 5)
    public void verifyActiveUsersLabelTest(){
        Assert.assertTrue(dashboardPage.verifyActiveUsersLabel());
    }

    @Test(priority = 6)
    public void verifyActiveUsersCountTest() {
        Assert.assertTrue(dashboardPage.verifyActiveUsersCount());
    }

    @Test(priority = 7)
    public void verifyMeetingRoomUtilizationLabelTest() {
        Assert.assertTrue(dashboardPage.verifyMeetingRoomUtilizationLabel());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
