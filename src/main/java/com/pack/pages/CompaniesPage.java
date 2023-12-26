package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CompaniesPage extends TestBase {

    @FindBy(xpath = "//span[@class='link-title'][contains(.,'Companies')]")
    WebElement Companies;

    @FindBy(xpath = "//input[contains(@placeholder,'Company Id')]")
    WebElement CompanyId;

    @FindBy(xpath = "//input[contains(@placeholder,'Company Name')]")
    WebElement CompanyName;

    @FindBy(xpath = "//input[contains(@placeholder,'Company Address')]")
    WebElement CompanyAddress;

    @FindBy(xpath = "//input[contains(@placeholder,'Company Email')]")
    WebElement CompanyEmail;

    @FindBy(xpath = "//input[contains(@placeholder,'ompany Contact No')]")
    WebElement CompanyContactNo;

    @FindBy(xpath = "//input[contains(@placeholder,'Note')]")
    WebElement Note;

    @FindBy(xpath = "//input[contains(@placeholder,'Business Reg No')]")
    WebElement BusinessRegNo;

    @FindBy(xpath = "//input[contains(@placeholder,'Tin No')]")
    WebElement TinNo;

    @FindBy(xpath = "//input[contains(@placeholder,'Finance Contact No')]")
    WebElement FinanceContactNo;

    @FindBy(xpath = "//input[contains(@placeholder,'Finance Contact Name')]")
    WebElement FinanceContactName;

    @FindBy(xpath = "//input[contains(@placeholder,'Finance Email')]")
    WebElement FinanceEmail;

    @FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Filter')]")
    WebElement FilterBtn;

    @FindBy(xpath = "//span[@title='CMP-478872'][contains(.,'CMP-478872')]")
    WebElement SearchResult;

    @FindBy(xpath = "//span[@title='Hatch Works Pvt Ltd'][contains(.,'Hatch Works Pvt Ltd')]")
    WebElement SearchResult1;

    @FindBy(xpath = "(//span[@title='Colombo'][contains(.,'Colombo')])[1]")
    WebElement SearchResult2;

    @FindBy(xpath = "//span[@title='amanthag1@gmail.com'][contains(.,'amanthag1@gmail.com')]")
    WebElement SearchResult3;

    public CompaniesPage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyCompaniesPageTitle(){
        return driver.getTitle();
    }

    public CompaniesPage clickOnCompaniesLink(){
        Companies.click();
        return new CompaniesPage();
    }

    public boolean verifyCompanyIdField(){
        return CompanyId.isDisplayed();
    }

    public void filterCompaniesPageByCompanyId(String companyid){
        CompanyId.click();
        CompanyId.sendKeys(companyid);
        FilterBtn.click();
        SearchResult.isDisplayed();
    }

    public boolean verifyCompanyNameField(){
        return CompanyName.isDisplayed();
    }

    public void filterCompaniesPageByCompanyName(String companyname){
        CompanyName.click();
        CompanyName.sendKeys(companyname);
        FilterBtn.click();
        SearchResult1.isDisplayed();
    }

    public boolean verifyCompanyAddressField(){
        return CompanyAddress.isDisplayed();
    }

    public void filterCompaniesPageByCompanyAddress(String companyaddress){
        CompanyAddress.click();
        CompanyAddress.sendKeys(companyaddress);
        FilterBtn.click();
        SearchResult2.isDisplayed();
    }

    public boolean verifyCompanyEmailField(){
        return CompanyEmail.isDisplayed();
    }

    public void filterCompaniesPageByCompanyEmail(String companyemail){
        CompanyEmail.click();
        CompanyEmail.sendKeys(companyemail);
        FilterBtn.click();
        SearchResult3.isDisplayed();
    }

    public boolean verifyCompanyContactNoField(){
        return CompanyContactNo.isDisplayed();
    }

    public void filterCompaniesPageByCompanyContactNo(String companycontactno){
        CompanyContactNo.click();
        CompanyContactNo.sendKeys(companycontactno);
        FilterBtn.click();
        SearchResult.isDisplayed();
    }

    public boolean verifyNoteField(){
        return Note.isDisplayed();
    }

    public void filterCompaniesPageByNote(String note){
        Note.click();
        Note.sendKeys(note);
        FilterBtn.click();
        SearchResult.isDisplayed();
    }

    public boolean verifyBusinessRegNo(){
        return BusinessRegNo.isDisplayed();
    }

    public void filterCompaniesPageByBusinessRegNo(String businessregno){
        BusinessRegNo.click();
        BusinessRegNo.sendKeys(businessregno);
        FilterBtn.click();
        SearchResult.isDisplayed();
    }

    public boolean verifyTinNoField(){
        return TinNo.isDisplayed();
    }

    public void filterCompaniesPageByTinNo(String tinno){
        TinNo.click();
        TinNo.sendKeys(tinno);
        FilterBtn.click();
        SearchResult.isDisplayed();
    }

    public boolean verifyFinanceContactNoField(){
        return FinanceContactNo.isDisplayed();
    }

    public void filterCompaniesPageByFinanceContactNo(String financecontactno){
        FinanceContactNo.click();
        FinanceContactNo.sendKeys(financecontactno);
        FilterBtn.click();
        SearchResult.isDisplayed();
    }

    public boolean verifyFinanceContactNameField(){
        return FinanceContactName.isDisplayed();
    }

    public void filterCompaniesPageByFinanceContactName(String financecontactname){
        FinanceContactName.click();
        FinanceContactName.sendKeys(financecontactname);
        FilterBtn.click();
        SearchResult.click();
    }

    public boolean verifyFinanceEmailField(){
        return FinanceEmail.isDisplayed();
    }

    public void filterCompaniesPageByFinanceEmail(String financeemail){
        FinanceEmail.click();
        FinanceEmail.sendKeys(financeemail);
        FilterBtn.click();
        SearchResult.isDisplayed();
    }
}
