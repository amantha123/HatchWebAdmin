package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RolesPage extends TestBase {

    @FindBy(xpath = "//span[@class='link-title'][contains(.,'Roles')]")
    WebElement Roles;

    @FindBy(xpath = "//input[contains(@type,'text')]")
    WebElement Role;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-authorization/app-permissions/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/select")
    WebElement Status;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-authorization/app-permissions/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/select/option[2]")
    WebElement Active;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-authorization/app-permissions/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/select/option[3]")
    WebElement Inactive;

    @FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Filter')]")
    WebElement FilterBtn;

    @FindBy(xpath = "//span[@title='Admin'][contains(.,'Admin')]")
    WebElement SearchResult;

    @FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'+ Add')]")
    WebElement AddBtn;

    @FindBy(xpath = "//input[contains(@id,'name')]")
    WebElement Name;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/form/div[1]/div[2]/div/ng-select/div/div/div[2]")
    WebElement Permissions;

    @FindBy(xpath = "//span[@class='ng-option-label'][contains(.,'App Users View')]")
    WebElement PermissionsOption;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Save')]")
    WebElement SaveBtn;

    public RolesPage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyRolesPageTitle(){
        return driver.getTitle();
    }

    public RolesPage clickOnRolesPageLink(){
        Roles.click();
        return new RolesPage();
    }

    public boolean verifyRoleField(){
        return Role.isDisplayed();
    }

    public void filterRolesPageByRole(String role){
        Role.click();
        Role.sendKeys(role);
        FilterBtn.click();
        SearchResult.isDisplayed();
    }

    public boolean verifyStatusField(){
        return Status.isDisplayed();
    }

    public void filterRolesPageByStatusActive(){
        Status.click();
        Active.click();
    }

    public void filterRolesPageByStatusInactive(){
        Status.click();
        Inactive.click();
    }

    public boolean verifyAddBtn(){
        return AddBtn.isDisplayed();
    }

    public void verifyAddingNewRole(String name){
        AddBtn.click();
        Name.sendKeys(name);
        Permissions.click();
        PermissionsOption.click();
        Permissions.click();
        SaveBtn.click();
    }

}
