package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.DashboardPage;
import com.pack.pages.LoginPage;
import com.pack.pages.SubscriptionsPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubscriptionsPageTest extends TestBase {

    LoginPage loginPage;
    SubscriptionsPage subscriptionsPage;
    DashboardPage dashboardPage;
    TestUtil testUtil;

    String sheetName = "Subscriptions";


    public SubscriptionsPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        subscriptionsPage = new SubscriptionsPage();
    }

    @Test(priority= 1)
    public void verifySubscriptionsPageTitle(){
        String subscriptionsPageTitle = subscriptionsPage.verifySubscriptionsPageTitle();
        Assert.assertEquals(subscriptionsPageTitle, "Hatch - Admin");
    }

    @Test(priority = 2)
    public void navigateSubscriptionsPageTest(){
        subscriptionsPage.clickOnSubscriptionsPageLink();
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
    public void verifyCompanyNameFieldTest(){
        subscriptionsPage.clickOnSubscriptionsPageLink();
        subscriptionsPage.verifyCompanyNameField();
    }

    @DataProvider
    public Object[][] getTestData(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"Hatch Works"},
        };
    }

    @Test(priority = 4, dataProvider = "getTestData")
    public void filterSubscriptionsPageByCompanyNameTest(String companyname){
        subscriptionsPage.clickOnSubscriptionsPageLink();
        subscriptionsPage.filterSubscriptionsPageByCompanyName(companyname);
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 5)
    public void verifyUserNameFieldTest(){
        subscriptionsPage.clickOnSubscriptionsPageLink();
        subscriptionsPage.verifyUserNameField();
    }

    @DataProvider
    public Object[][] getTestData1(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"Amantha Gunawardena"},
        };
    }

    @Test(priority = 6, dataProvider = "getTestData1")
    public void filterSubscriptionsPageByUserNameTest(String username){
        subscriptionsPage.clickOnSubscriptionsPageLink();
        subscriptionsPage.filterSubscriptionsPageByUserName(username);
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 7)
    public void verifyStatusFieldTest(){
        subscriptionsPage.clickOnSubscriptionsPageLink();
        subscriptionsPage.verifyStatusField();
    }

    @Test(priority = 8)
    public void filterSubscriptionsPageByStatusActiveTest(){
        subscriptionsPage.clickOnSubscriptionsPageLink();
        subscriptionsPage.filterSubscriptionsPageByStatusActive();
    }

    @Test(priority = 9)
    public void filterSubscriptionsPageByStatusInactiveTest(){
        subscriptionsPage.clickOnSubscriptionsPageLink();
        subscriptionsPage.filterSubscriptionsPageByStatusInactive();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
