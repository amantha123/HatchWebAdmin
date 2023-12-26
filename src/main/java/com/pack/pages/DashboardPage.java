package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends TestBase {

    @FindBy(xpath = "//h4[@class='mb-3 mb-md-0'][contains(.,'Welcome to Dashboard')]")
    WebElement Label;

    @FindBy(xpath = "//h6[@class='card-title mb-2'][contains(.,'Hatch Users')]")
    WebElement HatchUsers;

    @FindBy(xpath = "//h3[@class='mb-2'][contains(.,'59')]")
    WebElement Count;

    @FindBy(xpath = "//h6[@class='card-title mb-2'][contains(.,'Active Users')]")
    WebElement ActiveUsers;

    @FindBy(xpath = "//h3[@class='mb-2'][contains(.,'0')]")
    WebElement ActiveUsersCount;

    @FindBy(xpath = "//h6[@class='card-title mb-0'][contains(.,'Meeting Room Utilization')]")
    WebElement MeetingRoomUtilizationLabel;

    // Initializing the Page Objects:
    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyDashboardPageTitle(){
        return driver.getTitle();
    }

    public boolean verifyLabel(){
        return Label.isDisplayed();
    }

    public boolean verifyHatchUsersLabel(){
        return HatchUsers.isDisplayed();
    }

    public boolean verifyHatchUsersCount(){
        return Count.isDisplayed();
    }

    public boolean verifyActiveUsersLabel(){
        return ActiveUsers.isDisplayed();
    }

    public boolean verifyActiveUsersCount(){
        return ActiveUsersCount.isDisplayed();
    }

    public boolean verifyMeetingRoomUtilizationLabel(){
        return MeetingRoomUtilizationLabel.isDisplayed();
    }

}
