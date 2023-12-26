package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class UpgradeDowngradeRequestPage extends TestBase {

    @FindBy(xpath = "//span[@class='link-title'][contains(.,'Upgrade/Downgrade Requests')]")
    WebElement UpgradeDowngradeRequest;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-permissions/div[2]/div/div/div/div[2]/div[1]/div[1]/div/select")
    WebElement Company;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-permissions/div[2]/div/div/div/div[2]/div[1]/div[1]/div/select/option[73]")
    WebElement CompanyOption;

    @FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Filter')]")
    WebElement FilterBtn;

    public UpgradeDowngradeRequestPage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyUpgradeDowngradeRequestPageTitle(){
        return driver.getTitle();
    }

    public UpgradeDowngradeRequestPage clickOnUpgradeDowngradePageLink(){
        UpgradeDowngradeRequest.click();
        return new UpgradeDowngradeRequestPage();
    }

    public boolean verifyCompanyField(){
        return Company.isDisplayed();
    }

    public void filterSubscriptionsUpgradeDowngradeRequests(){
        Company.click();
        WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-base/div/div[2]/div/div/app-permissions/div[2]/div/div/div/div[2]/div[1]/div[1]/div/select/option[73]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        CompanyOption.click();
        FilterBtn.click();
    }

}
