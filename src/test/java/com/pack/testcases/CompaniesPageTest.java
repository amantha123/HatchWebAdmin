package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.CompaniesPage;
import com.pack.pages.DashboardPage;
import com.pack.pages.LoginPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CompaniesPageTest extends TestBase {

    LoginPage loginPage;
    CompaniesPage companiesPage;
    DashboardPage dashboardPage;
    TestUtil testUtil;

    String sheetName = "Companies";


    public CompaniesPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        companiesPage = new CompaniesPage();
    }

    @Test(priority= 1)
    public void verifyCompanyPageTitleTest(){
        String companiesPageTitle = companiesPage.verifyCompaniesPageTitle();
        Assert.assertEquals(companiesPageTitle, "Hatch - Admin");
    }

    @Test(priority = 2)
    public void navigateCompaniesPageTest(){
        companiesPage.clickOnCompaniesLink();
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
    public void verifyCompanyIdFieldTest(){
        companiesPage.clickOnCompaniesLink();
        companiesPage.verifyCompanyIdField();
    }

    @DataProvider
    public Object[][] getTestData(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"CMP-478872"},
        };
    }

    @Test(priority = 4, dataProvider="getTestData")
    public void filterHatchMembersPageByUserIDTest(String companyid){
        companiesPage.clickOnCompaniesLink();
        companiesPage.filterCompaniesPageByCompanyId(companyid);
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
    public void verifyCompanyNameFieldTest(){
        companiesPage.clickOnCompaniesLink();
        companiesPage.verifyCompanyNameField();
    }

    @DataProvider
    public Object[][] getTestData1(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"Hatch Works Pvt Ltd"},
        };
    }

    @Test(priority = 6, dataProvider="getTestData1")
    public void filterCompaniesPageByCompanyNameTest(String companyname){
        companiesPage.clickOnCompaniesLink();
        companiesPage.filterCompaniesPageByCompanyName(companyname);
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
    public void verifyCompanyAddressFieldTest(){
        companiesPage.clickOnCompaniesLink();
        companiesPage.verifyCompanyAddressField();
    }

    @DataProvider
    public Object[][] getTestData2(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"Colombo"},
        };
    }

    @Test(priority = 8, dataProvider="getTestData2")
    public void filterCompaniesPageByCompanyAddressTest(String companyaddress){
        companiesPage.clickOnCompaniesLink();
        companiesPage.filterCompaniesPageByCompanyAddress(companyaddress);
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
    public void verifyCompanyEmailFieldTest(){
        companiesPage.clickOnCompaniesLink();
        companiesPage.verifyCompanyEmailField();
    }

    @DataProvider
    public Object[][] getTestData3(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"amanthag1@gmail.com"},
        };
    }

    @Test(priority = 10, dataProvider="getTestData3")
    public void filterCompaniesPageByCompanyEmailTest(String companyemail){
        companiesPage.clickOnCompaniesLink();
        companiesPage.filterCompaniesPageByCompanyEmail(companyemail);
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
    public void verifyCompanyContactNoFieldTest(){
        companiesPage.clickOnCompaniesLink();
        companiesPage.verifyCompanyContactNoField();
    }

    @DataProvider
    public Object[][] getTestData4(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"729357230"},
        };
    }

    @Test(priority = 12, dataProvider="getTestData4")
    public void filterCompaniesPageByCompanyContactNoTest(String companycontactno){
        companiesPage.clickOnCompaniesLink();
        companiesPage.filterCompaniesPageByCompanyContactNo(companycontactno);
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
    public void verifyNoteFieldTest(){
        companiesPage.clickOnCompaniesLink();
        companiesPage.verifyNoteField();
    }

    @DataProvider
    public Object[][] getTestData5(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"Test"},
        };
    }

    @Test(priority = 14, dataProvider="getTestData5")
    public void filterCompaniesPageByNoteTest(String note){
        companiesPage.clickOnCompaniesLink();
        companiesPage.filterCompaniesPageByNote(note);
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 15)
    public void verifyBusinessRegNoTest(){
        companiesPage.clickOnCompaniesLink();
        companiesPage.verifyBusinessRegNo();
    }

    @DataProvider
    public Object[][] getTestData6(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"212132323"},
        };
    }

    @Test(priority = 16, dataProvider="getTestData6")
    public void filterCompaniesPageByBusinessRegNoTest(String businessregno){
        companiesPage.clickOnCompaniesLink();
        companiesPage.filterCompaniesPageByBusinessRegNo(businessregno);
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 17)
    public void verifyTinNoFieldTest(){
        companiesPage.clickOnCompaniesLink();
        companiesPage.verifyTinNoField();
    }

    @DataProvider
    public Object[][] getTestData7(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"3243232323"},
        };
    }

    @Test(priority = 18, dataProvider="getTestData7")
    public void filterCompaniesPageByTinNoTest(String tinno){
        companiesPage.clickOnCompaniesLink();
        companiesPage.filterCompaniesPageByTinNo(tinno);
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 19)
    public void verifyFinanceContactNoFieldTest(){
        companiesPage.clickOnCompaniesLink();
        companiesPage.verifyFinanceContactNoField();
    }

    @DataProvider
    public Object[][] getTestData8(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"774848813"},
        };
    }

    @Test(priority = 20, dataProvider="getTestData8")
    public void filterCompaniesPageByFinanceContactNoTest(String financecontactno){
        companiesPage.clickOnCompaniesLink();
        companiesPage.filterCompaniesPageByFinanceContactNo(financecontactno);
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 21)
    public void verifyFinanceContactNameFieldTest(){
        companiesPage.clickOnCompaniesLink();
        companiesPage.verifyFinanceContactNameField();
    }

    @DataProvider
    public Object[][] getTestData9(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"Contact name"},
        };
    }

    @Test(priority = 22, dataProvider="getTestData9")
    public void filterCompaniesPageByFinanceContactNameTest(String financecontactname){
        companiesPage.clickOnCompaniesLink();
        companiesPage.filterCompaniesPageByFinanceContactName(financecontactname);
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 23)
    public void verifyFinanceEmailFieldTest(){
        companiesPage.clickOnCompaniesLink();
        companiesPage.verifyFinanceEmailField();
    }

    @DataProvider
    public Object[][] getTestData10(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return new Object[][] {
                {"test@gmail.com"},
        };
    }

    @Test(priority = 24, dataProvider="getTestData10")
    public void filterCompaniesPageByFinanceEmailTest(String financeemail){
        companiesPage.clickOnCompaniesLink();
        companiesPage.filterCompaniesPageByFinanceEmail(financeemail);
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
