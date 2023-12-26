package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.View;

public class EstimatesPage extends TestBase {

    @FindBy(xpath = "//span[@class='link-title'][contains(.,'Estimates')]")
    WebElement Estimates;

    @FindBy(xpath = "(//i[contains(@class,'feather icon-eye')])[9]")
    WebElement ViewIcon;

    public EstimatesPage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyEstimatesPageTitle(){
        return driver.getTitle();
    }

    public EstimatesPage clickOnEstimatesPageLink(){
        Estimates.click();
        return new EstimatesPage();
    }

    public boolean verifyEstimationViewIcon(){
        return ViewIcon.isDisplayed();
    }

    public void verifyViewingEstimation(){
        ViewIcon.click();
    }
}
