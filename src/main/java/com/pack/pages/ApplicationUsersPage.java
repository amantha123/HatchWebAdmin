package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationUsersPage extends TestBase {

    @FindBy(xpath = "//span[@class='link-title'][contains(.,'Application Users')]")
    WebElement ApplicationUsers;

    @FindBy(xpath = "//input[contains(@placeholder,'User Id')]")
    WebElement UserId;

    @FindBy(xpath = "//input[contains(@placeholder,'User Name')]")
    WebElement UserName;

    @FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Filter')]")
    WebElement FilterBtn;

    @FindBy(xpath = "//span[@title='USR-004922'][contains(.,'USR-004922')]")
    WebElement SearchResult;

    @FindBy(xpath = "(//span[@title='94774848813'][contains(.,'94774848813')])[1]")
    WebElement SearchResult1;

    public ApplicationUsersPage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyApplicationUsersPageTitle(){
        return driver.getTitle();
    }

    public ApplicationUsersPage clickOnApplicationUsersLink(){
        ApplicationUsers.click();
        return new ApplicationUsersPage();
    }

    public boolean verifyUserIdField(){
        return UserId.isDisplayed();
    }

    public void filterApplicationUsersPageByUserId(String userid){
        UserId.click();
        UserId.sendKeys(userid);
        FilterBtn.click();
        SearchResult.isDisplayed();
    }

    public boolean verifyUserNameField(){
        return UserName.isDisplayed();
    }

    public void filterApplicationUsersPageByUserName(String username){
        UserName.click();
        UserName.sendKeys(username);
        FilterBtn.click();
        SearchResult1.isDisplayed();
    }

}
