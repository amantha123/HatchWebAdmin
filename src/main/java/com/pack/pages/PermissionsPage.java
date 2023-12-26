package com.pack.pages;

import com.pack.base.TestBase;
import org.apache.poi.ss.formula.functions.Na;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.logging.Filter;

public class PermissionsPage extends TestBase {

    @FindBy(xpath = "//span[@class='link-title'][contains(.,'Permissions')]")
    WebElement Permissions;

    @FindBy(xpath = "//input[contains(@type,'text')]")
    WebElement Name;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-authorization/app-permissions/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/select")
    WebElement Status;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-authorization/app-permissions/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/select/option[2]")
    WebElement Active;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-authorization/app-permissions/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/select/option[3]")
    WebElement Inactive;

    @FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Filter')]")
    WebElement FilterBtn;

    @FindBy(xpath = "//span[@title='App Users View'][contains(.,'App Users View')]")
    WebElement SearchResult;

    public PermissionsPage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyPermissionsPageTitle(){
        return driver.getTitle();
    }

    public PermissionsPage clickOnPermissionPageLink(){
        Permissions.click();
        return new PermissionsPage();
    }

    public boolean verifyNameField(){
        return Name.isDisplayed();
    }

    public void filterPermissionsPageByName(String name){
        Name.click();
        Name.sendKeys(name);
        FilterBtn.click();
        SearchResult.isDisplayed();
    }

    public boolean verifyStatusField(){
        return Status.isDisplayed();
    }

    public void filterPermissionsPageByStatusActive(){
        Status.click();
        Active.click();
    }

    public void filterPermissionsPageByStatusInactive(){
        Status.click();
        Inactive.click();
    }

}
