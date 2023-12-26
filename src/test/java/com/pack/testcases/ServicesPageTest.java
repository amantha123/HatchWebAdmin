package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.DashboardPage;
import com.pack.pages.LoginPage;
import com.pack.pages.ServicesPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ServicesPageTest extends TestBase {

    LoginPage loginPage;
    ServicesPage servicesPage;
    DashboardPage dashboardPage;
    TestUtil testUtil;

    String sheetName = "Services";

    public ServicesPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        servicesPage = new ServicesPage();
    }

    @Test(priority= 1)
    public void verifyServicesPageTitle(){
        String servicesPageTitle = servicesPage.verifyServicesPageTitle();
        Assert.assertEquals(servicesPageTitle, "Hatch - Admin");
    }

    @Test(priority = 2)
    public void navigateServicesPageTest(){
        servicesPage.clickOnServicesPageLink();
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
    public void verifyAddBtnTest(){
        servicesPage.clickOnServicesPageLink();
        servicesPage.verifyAddBtn();
    }


    @Test(priority = 4)
    public void verifyMandatoryFieldsTest(){
        servicesPage.clickOnServicesPageLink();
        servicesPage.verifyMandatoryFields();
    }

    @DataProvider
    public Object[][] getTestData(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"Testing Service"},
                {"Testing Service"},
                {"1500"},
                {"30"},
        };
    }

    @Test(priority = 5, dataProvider = "getTestData")
    public void verifyAddingServicesTest(String name, String description, String price, String terminationperiod){
        servicesPage.clickOnServicesPageLink();
        servicesPage.verifyAddingServices(name,description,price,terminationperiod);
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
