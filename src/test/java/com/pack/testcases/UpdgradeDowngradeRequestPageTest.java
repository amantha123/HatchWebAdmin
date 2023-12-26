package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.DashboardPage;
import com.pack.pages.LoginPage;
import com.pack.pages.RolesPage;
import com.pack.pages.UpgradeDowngradeRequestPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpdgradeDowngradeRequestPageTest extends TestBase {

    LoginPage loginPage;
    UpgradeDowngradeRequestPage upgradeDowngradeRequestPage;
    DashboardPage dashboardPage;
    TestUtil testUtil;

    public UpdgradeDowngradeRequestPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        upgradeDowngradeRequestPage = new UpgradeDowngradeRequestPage();
    }

    @Test(priority= 1)
    public void verifyUpgradeDowngradeRequestPageTitle(){
        String upgradeDowngradePageTitle = upgradeDowngradeRequestPage.verifyUpgradeDowngradeRequestPageTitle();
        Assert.assertEquals(upgradeDowngradePageTitle, "Hatch - Admin");
    }

    @Test(priority = 2)
    public void navigateUpgradeDowngradeRequestPageTest(){
        upgradeDowngradeRequestPage.clickOnUpgradeDowngradePageLink();
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 3)
    public void verifyCompanyFieldTest(){
        upgradeDowngradeRequestPage.clickOnUpgradeDowngradePageLink();
        upgradeDowngradeRequestPage.verifyCompanyField();
    }

    @Test(priority = 4)
    public void filterSubscriptionsUpgradeDowngradeRequestsTest(){
        upgradeDowngradeRequestPage.clickOnUpgradeDowngradePageLink();
        upgradeDowngradeRequestPage.filterSubscriptionsUpgradeDowngradeRequests();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
