package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.ApplicationUsersPage;
import com.pack.pages.DashboardPage;
import com.pack.pages.LoginPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ApplicationUsersPageTest extends TestBase {

    LoginPage loginPage;
    ApplicationUsersPage applicationUsersPage;
    DashboardPage dashboardPage;
    TestUtil testUtil;

    String sheetName = "ApplicationUsers";


    public ApplicationUsersPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        applicationUsersPage = new ApplicationUsersPage();
    }

    @Test(priority= 1)
    public void verifyApplicationUsersPageTitleTest(){
        String applicationUsersPageTitle = applicationUsersPage.verifyApplicationUsersPageTitle();
        Assert.assertEquals(applicationUsersPageTitle, "Hatch - Admin");
    }

    @Test(priority = 2)
    public void navigateApplicationUsersPageTest(){
        applicationUsersPage.clickOnApplicationUsersLink();
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
    public void verifyUserIdFieldTest(){
        applicationUsersPage.clickOnApplicationUsersLink();
        applicationUsersPage.verifyUserIdField();
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @DataProvider
    public Object[][] getTestData(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"USR-004922"},
        };
    }

    @Test(priority = 4, dataProvider = "getTestData")
    public void filterApplicationUsersPageByUserIdTest(String userid){
        applicationUsersPage.clickOnApplicationUsersLink();
        applicationUsersPage.filterApplicationUsersPageByUserId(userid);
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
