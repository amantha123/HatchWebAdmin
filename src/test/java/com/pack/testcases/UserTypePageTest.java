package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.DashboardPage;
import com.pack.pages.LoginPage;
import com.pack.pages.UserTypePage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserTypePageTest extends TestBase {

    LoginPage loginPage;
    UserTypePage userTypePage;
    DashboardPage dashboardPage;
    TestUtil testUtil;

    String sheetName = "UserType";


    public UserTypePageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        userTypePage = new UserTypePage();
    }

    @Test(priority= 1)
    public void verifyUserTypePageTitle(){
        String userTypePageTitle = userTypePage.verifyUserTypePageTitle();
        Assert.assertEquals(userTypePageTitle, "Hatch - Admin");
    }

    @Test(priority = 2)
    public void navigateUserTypePageTest(){
        userTypePage.clickOnUserTypePageLink();
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
    public void verifyNameFieldTest(){
        userTypePage.clickOnUserTypePageLink();
        userTypePage.verifyNameField();
    }

    @DataProvider
    public Object[][] getTestData(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"Testing Role"},
        };
    }

    @Test(priority = 4, dataProvider = "getTestData")
    public void verifyFilteringUserTypePageByNameTest(String name){
        userTypePage.clickOnUserTypePageLink();
        userTypePage.verifyFilteringUserTypePageByName(name);
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
    public void verifyStatusFieldTest(){
        userTypePage.clickOnUserTypePageLink();
        userTypePage.verifyStatusField();
    }

    @Test(priority = 6)
    public void filterUserTypePageByStatusActiveTest(){
        userTypePage.clickOnUserTypePageLink();
        userTypePage.filterUserTypePageByStatusActive();
    }

    @Test(priority = 7)
    public void filterUserTypePageByStatusInactiveTest(){
        userTypePage.clickOnUserTypePageLink();
        userTypePage.filterUserTypePageByStatusInactive();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
