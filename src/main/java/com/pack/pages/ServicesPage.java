package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ServicesPage extends TestBase {

    @FindBy(xpath = "//span[@class='link-title'][contains(.,'Services')]")
    WebElement Services;

    @FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'+ Add')]")
    WebElement AddBtn;

    @FindBy(xpath = "//input[contains(@placeholder,'Service Name')]")
    WebElement Name;

    @FindBy(xpath = "//input[contains(@formcontrolname,'description')]")
    WebElement Description;

    @FindBy(xpath = "//input[contains(@formcontrolname,'price')]")
    WebElement Price;

    @FindBy(xpath = "//input[contains(@type,'number')]")
    WebElement Termination;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-icons/app-permissions/div[2]/form/div/div/div/div/div[2]/div/div[5]/div/div/select")
    WebElement Quantity;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-icons/app-permissions/div[2]/form/div/div/div/div/div[2]/div/div[5]/div/div/select/option[1]")
    WebElement QuantityOption;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Submit')]")
    WebElement SubmitBtn;

    @FindBy(xpath = "//span[@class='invalid-feedback'][contains(.,'Name is required.')]")
    WebElement Validation;

    @FindBy(xpath = "//span[@class='invalid-feedback'][contains(.,'Price is required.')]")
    WebElement Validation1;

    @FindBy(xpath = "//span[@class='invalid-feedback'][contains(.,'Termination Period is required.')]")
    WebElement Validation2;

    public ServicesPage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyServicesPageTitle(){
        return driver.getTitle();
    }

    public ServicesPage clickOnServicesPageLink(){
        Services.click();
        return new ServicesPage();
    }

    public boolean verifyAddBtn(){
        return AddBtn.isDisplayed();
    }

    public void verifyMandatoryFields(){
        AddBtn.click();
        Name.click();
        Name.sendKeys(Keys.TAB);
        Validation.isDisplayed();
        Description.click();
        Description.sendKeys(Keys.TAB);
        Price.click();
        Price.sendKeys(Keys.TAB);
        Validation1.isDisplayed();
        Termination.click();
        Termination.sendKeys(Keys.TAB);
        Validation2.isDisplayed();
    }

    public void verifyAddingServices(String name, String description, String price, String terminationperiod){
        AddBtn.click();
        Name.click();
        Name.sendKeys(name);
        Description.click();
        Description.sendKeys(description);
        Price.click();
        Price.sendKeys(price);
        Termination.click();
        Termination.sendKeys(terminationperiod);
        Quantity.click();
        QuantityOption.click();
        SubmitBtn.click();
    }
}
