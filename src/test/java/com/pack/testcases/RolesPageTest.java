package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.DashboardPage;
import com.pack.pages.LoginPage;
import com.pack.pages.RolesPage;
import com.pack.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RolesPageTest extends TestBase {

    LoginPage loginPage;
    RolesPage rolesPage;
    DashboardPage dashboardPage;
    TestUtil testUtil;

    String sheetName = "Roles";


    public RolesPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        rolesPage = new RolesPage();
    }

    @Test(priority= 1)
    public void verifyRolesPageTitle(){
        String rolesPageTitle = rolesPage.verifyRolesPageTitle();
        Assert.assertEquals(rolesPageTitle, "Hatch - Admin");
    }

    @Test(priority = 2)
    public void navigateRolesPageTest(){
        rolesPage.clickOnRolesPageLink();
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
    public void verifyRoleFieldTest(){
        rolesPage.clickOnRolesPageLink();
        rolesPage.verifyRoleField();
    }

    @DataProvider
    public Object[][] getTestData(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"Admin"},
        };
    }

    @Test(priority = 4, dataProvider = "getTestData")
    public void filterRolesPageByRoleTest(String role){
        rolesPage.clickOnRolesPageLink();
        rolesPage.filterRolesPageByRole(role);
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
        rolesPage.clickOnRolesPageLink();
        rolesPage.verifyStatusField();
    }

    @Test(priority = 6)
    public void filterRolesPageByStatusActiveTest(){
        rolesPage.clickOnRolesPageLink();
        rolesPage.filterRolesPageByStatusActive();
    }

    @Test(priority = 7)
    public void filterRolesPageByStatusInactiveTest(){
        rolesPage.clickOnRolesPageLink();
        rolesPage.filterRolesPageByStatusInactive();
    }

    @Test(priority = 8)
    public void verifyAddBtnTest(){
        rolesPage.clickOnRolesPageLink();
        rolesPage.verifyAddBtn();
    }

    @DataProvider
    public Object[][] getTestData1(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"Testing Role"},
        };
    }

    @Test(priority = 9, dataProvider = "getTestData1")
    public void verifyAddingNewRoleTest(String name){
        rolesPage.clickOnRolesPageLink();
        rolesPage.verifyAddingNewRole(name);
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 10)
    public void verifyPerformingPageScrollTest(){
        rolesPage.clickOnRolesPageLink();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
