package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.DashboardPage;
import com.pack.pages.LoginPage;
import com.pack.pages.PermissionsPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PermissionsPageTest extends TestBase {

    LoginPage loginPage;
    PermissionsPage permissionsPage;
    DashboardPage dashboardPage;
    TestUtil testUtil;

    String sheetName = "Permissions";


    public PermissionsPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        permissionsPage = new PermissionsPage();
    }

    @Test(priority= 1)
    public void verifyPermissionsPageTitle(){
        String permissionsPageTitle = permissionsPage.verifyPermissionsPageTitle();
        Assert.assertEquals(permissionsPageTitle, "Hatch - Admin");
    }

    @Test(priority = 2)
    public void navigatePermissionsPageTest(){
        permissionsPage.clickOnPermissionPageLink();
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
        permissionsPage.clickOnPermissionPageLink();
        permissionsPage.verifyNameField();
    }

    @DataProvider
    public Object[][] getTestData(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"App Users View"},
        };
    }

    @Test(priority = 4, dataProvider = "getTestData")
    public void filterPermissionsPageByNameTest(String name){
        permissionsPage.clickOnPermissionPageLink();
        permissionsPage.filterPermissionsPageByName(name);
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
        permissionsPage.clickOnPermissionPageLink();
        permissionsPage.verifyStatusField();
    }

    @Test(priority = 6)
    public void filterPermissionsPageByStatusActiveTest(){
        permissionsPage.clickOnPermissionPageLink();
        permissionsPage.filterPermissionsPageByStatusActive();
    }

    @Test(priority = 7)
    public void filterPermissionsPageByStatusInactiveTest(){
        permissionsPage.clickOnPermissionPageLink();
        permissionsPage.filterPermissionsPageByStatusInactive();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
