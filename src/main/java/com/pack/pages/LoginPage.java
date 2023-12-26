package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[contains(@id,'exampleInputEmail1')]")
    WebElement UserName;

    @FindBy(xpath = "//input[contains(@formcontrolname,'password')]")
    WebElement Password;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Login')]")
    WebElement Login;

    @FindBy(xpath = "//a[@href='/auth/login']")
    WebElement Hatch_Logo;


    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean validateCRMImage(){
        return Hatch_Logo.isDisplayed();
    }

    public DashboardPage login(String un, String pwd){
        UserName.sendKeys(un);
        Password.sendKeys(pwd);
        Login.click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", Login);

        return new DashboardPage();
    }
}
