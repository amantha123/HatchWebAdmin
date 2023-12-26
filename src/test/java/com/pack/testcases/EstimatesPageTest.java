package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.DashboardPage;
import com.pack.pages.EstimatesPage;
import com.pack.pages.LoginPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EstimatesPageTest extends TestBase {

    LoginPage loginPage;
    EstimatesPage estimatesPage;
    DashboardPage dashboardPage;
    TestUtil testUtil;

    public EstimatesPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        estimatesPage = new EstimatesPage();
    }

    @Test(priority= 1)
    public void verifyEstimatesPageTitle(){
        String estimatesPageTitle = estimatesPage.verifyEstimatesPageTitle();
        Assert.assertEquals(estimatesPageTitle, "Hatch - Admin");
    }

    @Test(priority = 2)
    public void navigateEstimatesPageTest(){
        estimatesPage.clickOnEstimatesPageLink();
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
    public void verifyEstimationViewIconTest(){
        estimatesPage.clickOnEstimatesPageLink();
        estimatesPage.verifyEstimationViewIcon();
    }

    @Test(priority = 4)
    public void verifyViewingEstimationTest(){
        estimatesPage.clickOnEstimatesPageLink();
        estimatesPage.verifyViewingEstimation();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
