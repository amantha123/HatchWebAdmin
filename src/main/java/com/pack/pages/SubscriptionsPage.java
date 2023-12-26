package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SubscriptionsPage extends TestBase {

    @FindBy(xpath = "//span[@class='link-title'][contains(.,'Subscriptions')]")
    WebElement Subscription;

    @FindBy(xpath = "//input[contains(@placeholder,'Company Name')]")
    WebElement CompanyName;

    @FindBy(xpath = "//input[contains(@placeholder,'User Name')]")
    WebElement UserName;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-permissions/div[2]/div/div/div/div[2]/div[1]/div[3]/div/select")
    WebElement Status;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-permissions/div[2]/div/div/div/div[2]/div[1]/div[3]/div/select/option[2]")
    WebElement Active;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-permissions/div[2]/div/div/div/div[2]/div[1]/div[3]/div/select/option[3]")
    WebElement Inactive;

    @FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Filter')]")
    WebElement FilterBtn;

    public SubscriptionsPage() {
        PageFactory.initElements(driver, this);
    }

    public String verifySubscriptionsPageTitle(){
        return driver.getTitle();
    }

    public SubscriptionsPage clickOnSubscriptionsPageLink(){
        Subscription.click();
        return new SubscriptionsPage();
    }

    public boolean verifyCompanyNameField(){
        return CompanyName.isDisplayed();
    }

    public void filterSubscriptionsPageByCompanyName(String companyname){
        CompanyName.click();
        CompanyName.sendKeys(companyname);
        FilterBtn.click();
    }

    public boolean verifyUserNameField(){
        return UserName.isDisplayed();
    }

    public void filterSubscriptionsPageByUserName(String username){
        UserName.click();
        UserName.sendKeys(username);
        FilterBtn.click();
    }

    public boolean verifyStatusField(){
        return Status.isDisplayed();
    }

    public void filterSubscriptionsPageByStatusActive(){
        Status.click();
        Active.click();
    }

    public void filterSubscriptionsPageByStatusInactive(){
        Status.click();
        Inactive.click();
    }
}
