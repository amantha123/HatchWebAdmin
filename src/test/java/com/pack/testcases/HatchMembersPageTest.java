package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.DashboardPage;
import com.pack.pages.HatchMembersPage;
import com.pack.pages.LoginPage;
import com.pack.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HatchMembersPageTest extends TestBase {

    LoginPage loginPage;
    HatchMembersPage hatchMembersPage;
    DashboardPage dashboardPage;
    TestUtil testUtil;

    String sheetName = "HatchMembers";

    public HatchMembersPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        hatchMembersPage = new HatchMembersPage();
    }

    @Test(priority= 1)
    public void verifyHatchMembersPageTitleTest(){
        String hatchMembersPageTitle = hatchMembersPage.verifyHatchMembersPageTitle();
        Assert.assertEquals(hatchMembersPageTitle, "Hatch - Admin");
    }

    @Test(priority = 2)
    public void navigateHatchMembersPageTest(){
        hatchMembersPage.clickOnHatchMembersLink();
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
        hatchMembersPage.clickOnHatchMembersLink();
        hatchMembersPage.verifyUserIdField();
    }

    @DataProvider
    public Object[][] getTestData1(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"USR-004922"},
        };
    }

    @Test(priority = 4, dataProvider="getTestData1")
    public void filterHatchMembersPageByUserIDTest(String userid){
        hatchMembersPage.clickOnHatchMembersLink();
        hatchMembersPage.filterHatchMembersPageByUserID(userid);
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
        hatchMembersPage.clickOnHatchMembersLink();
        hatchMembersPage.verifyUserNameField();
    }

    @DataProvider
    public Object[][] getTestData2(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"94774848813"},
        };
    }

    @Test(priority = 6, dataProvider="getTestData2")
    public void filterHatchMembersPageByUserNameTest(String username){
        hatchMembersPage.clickOnHatchMembersLink();
        hatchMembersPage.filterHatchMembersPageByUserName(username);
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
    public void verifyFullNameFieldTest(){
        hatchMembersPage.clickOnHatchMembersLink();
        hatchMembersPage.verifyFullNameField();
    }

    @DataProvider
    public Object[][] getTestData3(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"Amantha Gunawardena"},
        };
    }

    @Test(priority = 8, dataProvider="getTestData3")
    public void filterHatchMembersPageByFullNameTest(String fullname){
        hatchMembersPage.clickOnHatchMembersLink();
        hatchMembersPage.filterHatchMembersPageByFullName(fullname);
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 9)
    public void verifyCompanyNameFieldTest(){
        hatchMembersPage.clickOnHatchMembersLink();
        hatchMembersPage.verifyCompanyNameField();
    }

    @DataProvider
    public Object[][] getTestData4(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"Hatch Works"},
        };
    }

    @Test(priority = 10, dataProvider="getTestData4")
    public void filterHatchMembersPageByCompanyNameTest(String companyname){
        hatchMembersPage.clickOnHatchMembersLink();
        hatchMembersPage.filterHatchMembersPageByCompanyName(companyname);
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 11)
    public void verifyCompanyAddressFieldTest(){
        hatchMembersPage.clickOnHatchMembersLink();
        hatchMembersPage.verifyCompanyAddressField();
    }

    @DataProvider
    public Object[][] getTestData5(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"Galle"},
        };
    }

    @Test(priority = 12, dataProvider="getTestData5")
    public void filterHatchMembersPageByCompanyAddressTest(String companyaddress){
        hatchMembersPage.clickOnHatchMembersLink();
        hatchMembersPage.filterHatchMembersPageByCompanyAddress(companyaddress);
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 13)
    public void verifyRoleFieldTest(){
        hatchMembersPage.clickOnHatchMembersLink();
        hatchMembersPage.verifyRoleField();
    }

    @DataProvider
    public Object[][] getTestData6(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"company-admin"},
        };
    }

    @Test(priority = 14, dataProvider="getTestData6")
    public void filterHatchMembersPageByRoleTest(String role){
        hatchMembersPage.clickOnHatchMembersLink();
        hatchMembersPage.filterHatchMembersPageByRole(role);
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)","");
    }

    @Test(priority = 15)
    public void verifyViewIconTest(){
        hatchMembersPage.clickOnHatchMembersLink();
        hatchMembersPage.verifyViewIcon();
    }

    @Test(priority = 16)
    public void clickOnViewIconTest(){
        hatchMembersPage.clickOnHatchMembersLink();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)","");
        hatchMembersPage.clickOnViewIcon();
        hatchMembersPage.verifyCloseIcon();
        hatchMembersPage.clickOnCloseIcon();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
