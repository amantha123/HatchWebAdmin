package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class UserTypePage extends TestBase {

    @FindBy(xpath = "//span[@class='link-title'][contains(.,'User Type')]")
    WebElement UserType;

    @FindBy(xpath = "//input[contains(@type,'text')]")
    WebElement Name;

    @FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Filter')]")
    WebElement FilterBtn;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-user-type/div/div/div/div/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/select")
    WebElement Status;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-user-type/div/div/div/div/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/select/option[2]")
    WebElement Active;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-user-type/div/div/div/div/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/select/option[3]")
    WebElement Inactive;

    public UserTypePage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyUserTypePageTitle(){
        return driver.getTitle();
    }

    public UserTypePage clickOnUserTypePageLink(){
        WebElement element = driver.findElement(By.xpath("//span[@class='link-title'][contains(.,'User Type')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        UserType.click();
        return new UserTypePage();
    }

    public boolean verifyNameField(){
        return Name.isDisplayed();
    }

    public void verifyFilteringUserTypePageByName(String name){
        Name.click();
        Name.sendKeys(name);
        FilterBtn.click();
    }

    public boolean verifyStatusField(){
        return Status.isDisplayed();
    }

    public void filterUserTypePageByStatusActive(){
        Status.click();
        Active.click();
        FilterBtn.click();
    }

    public void filterUserTypePageByStatusInactive(){
        Status.click();
        Inactive.click();
        FilterBtn.click();
    }
}
