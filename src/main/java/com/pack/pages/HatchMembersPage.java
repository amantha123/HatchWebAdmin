package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HatchMembersPage extends TestBase {

    @FindBy(xpath = "//span[@class='link-title'][contains(.,'Hatch Members')]")
    WebElement HatchMembers;

    @FindBy(xpath = "//input[contains(@placeholder,'User Id')]")
    WebElement UserId;

    @FindBy(xpath = "//input[contains(@placeholder,'User Name')]")
    WebElement UserName;

    @FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Filter')]")
    WebElement FilterBtn;

    @FindBy(xpath = "(//span[@title='USR-004922'][contains(.,'USR-004922')])[1]")
    WebElement SearchResult;

    @FindBy(xpath = "(//span[@title='94774848813'][contains(.,'94774848813')])[1]")
    WebElement SearchResult1;

    @FindBy(xpath = "//input[contains(@placeholder,'Full Name')]")
    WebElement FullName;

    @FindBy(xpath = "(//span[@title='Amantha Gunawardena'][contains(.,'Amantha Gunawardena')])[1]")
    WebElement SearchResult2;

    @FindBy(xpath = "//input[contains(@placeholder,'Company Name')]")
    WebElement CompanyName;

    @FindBy(xpath = "(//span[@title='Hatch Works '][contains(.,'Hatch Works')])[3]")
    WebElement SearchResult3;

    @FindBy(xpath = "//input[contains(@placeholder,'Company Address')]")
    WebElement CompanyAddress;

    @FindBy(xpath = "//input[contains(@placeholder,'Role')]")
    WebElement Role;

    @FindBy(xpath = "(//i[contains(@class,'feather icon-eye')])[10]")
    WebElement ViewIcon;

    @FindBy(xpath = "//button[contains(@aria-label,'Close')]")
    WebElement CloseIcon;

    public HatchMembersPage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyHatchMembersPageTitle(){
        return driver.getTitle();
    }

    public HatchMembersPage clickOnHatchMembersLink(){
        HatchMembers.click();
        return new HatchMembersPage();
    }

    public boolean verifyUserIdField(){
        return UserId.isDisplayed();
    }

    public void filterHatchMembersPageByUserID(String userid){
        UserId.click();
        UserId.sendKeys(userid);
        FilterBtn.click();
        SearchResult.isDisplayed();
    }

    public boolean verifyUserNameField(){
        return UserName.isDisplayed();
    }

    public void filterHatchMembersPageByUserName(String username){
        UserName.click();
        UserName.sendKeys(username);
        FilterBtn.click();
        SearchResult1.isDisplayed();
    }

    public boolean verifyFullNameField(){
        return FullName.isDisplayed();
    }

    public void filterHatchMembersPageByFullName(String fullname){
        FullName.click();
        FullName.sendKeys(fullname);
        FilterBtn.click();
        SearchResult2.isDisplayed();
    }

    public boolean verifyCompanyNameField(){
        return CompanyName.isDisplayed();
    }

    public void filterHatchMembersPageByCompanyName(String companyname){
        CompanyName.click();
        CompanyName.sendKeys(companyname);
        FilterBtn.click();
        SearchResult3.isDisplayed();
    }

    public boolean verifyCompanyAddressField(){
        return CompanyAddress.isDisplayed();
    }

    public void filterHatchMembersPageByCompanyAddress(String companyaddress){
        CompanyAddress.click();
        CompanyAddress.sendKeys(companyaddress);
        FilterBtn.click();
        SearchResult2.isDisplayed();
    }

    public boolean verifyRoleField(){
        return Role.isDisplayed();
    }

    public void filterHatchMembersPageByRole(String role){
        Role.click();
        Role.sendKeys(role);
        FilterBtn.click();
        SearchResult.isDisplayed();
    }

    public boolean verifyViewIcon(){
        return ViewIcon.isDisplayed();
    }

    public HatchMembersPage clickOnViewIcon(){
        ViewIcon.click();
        return new HatchMembersPage();

    }

    public boolean verifyCloseIcon(){
        return CloseIcon.isDisplayed();
    }

    public HatchMembersPage clickOnCloseIcon(){
        CloseIcon.click();
        return new HatchMembersPage();

    }

}
