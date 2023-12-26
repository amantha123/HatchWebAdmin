package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MeetingRoomBookingsPage extends TestBase {

    @FindBy(xpath = "//span[@class='link-title'][contains(.,'Meeting Room Bookings')]")
    WebElement MeetingRoomBookings;

    @FindBy(xpath = "(//select[contains(@class,'form-select')])[1]")
    WebElement SelectMeetingRoom;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-user/div/div[2]/div/div/div/div/form/div[1]/div/div[1]/div/select/option[5]")
    WebElement MeetingRoomOption;

    @FindBy(xpath = "(//select[contains(@class,'form-select')])[2]")
    WebElement SelectCompany;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-user/div/div[2]/div/div/div/div/form/div[1]/div/div[2]/div/select/option[23]")
    WebElement CompanyOption;

    @FindBy(xpath = "(//select[contains(@class,'form-select')])[3]")
    WebElement MemberGuest;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-user/div/div[2]/div/div/div/div/form/div[1]/div/div[3]/div/select/option[2]")
    WebElement MemberOption;

    @FindBy(xpath = "//button[@aria-label='weekViewSet'][contains(.,'week')]")
    WebElement Week;

    @FindBy(xpath = "//button[@aria-label='dayViewSet'][contains(.,'day')]")
    WebElement Day;

    @FindBy(xpath = "//button[@aria-label='addMeeting'][contains(.,'Add Meeting Booking')]")
    WebElement AddMeetingBooking;

    @FindBy(xpath = "//input[contains(@id,'selectedDate')]")
    WebElement MeetingDate;

    @FindBy(xpath = "//input[contains(@id,'startTime')]")
    WebElement StartTime;

    @FindBy(xpath = "//input[contains(@id,'endTime')]")
    WebElement EndTime;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Search')]")
    WebElement SearchBtn;

    @FindBy(xpath = "//select[contains(@formcontrolname,'selectedAsset')]")
    WebElement SelectAMeetingRoom;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/div/div/div[2]/form/div[1]/div[1]/div/select/option[2]")
    WebElement MeetingRoom;

    @FindBy(xpath = "//select[contains(@formcontrolname,'selectedCompany')]")
    WebElement SelectACompany;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/div/div/div[2]/form/div[1]/div[2]/div/select/option[28]")
    WebElement Company;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Save Meeting Booking')]")
    WebElement SaveMeetingBooking;

    public MeetingRoomBookingsPage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyMeetingRoomBookingsPageTitle(){
        return driver.getTitle();
    }

    public MeetingRoomBookingsPage clickOnMeetingRoomBookingsPageLink(){
        MeetingRoomBookings.click();
        return new MeetingRoomBookingsPage();
    }

    public boolean verifySelectMeetingRoom(){
        return SelectMeetingRoom.isDisplayed();
    }

    public void filterMeetingRoomBookingsBySelectMeetingRoom(){
        SelectMeetingRoom.click();
        MeetingRoomOption.click();

    }

    public boolean verifySelectCompany(){
        return SelectCompany.isDisplayed();
    }

    public void filterMeetingRoomBookingsBySelectCompany(){
        SelectCompany.click();
        CompanyOption.click();
    }

    public boolean verifyMemberGuest(){
        return MemberGuest.isDisplayed();
    }

    public void filterMeetingRoomBookingByMember(){
        MemberGuest.click();
        MemberOption.click();
    }

    public boolean verifyWeek(){
        return Week.isDisplayed();
    }

    public void filterMeetingRoomBookingByWeek(){
        Week.click();
    }

    public boolean verifyDay(){
        return Day.isDisplayed();
    }

    public void filterMeetingRoomBookingByDay(){
        Day.click();
    }

    public boolean verifyAddMeetingBooking(){
        return AddMeetingBooking.isDisplayed();
    }

    public void verifyAddingMeetingBooking(){
        AddMeetingBooking.click();
        MeetingDate.click();
        MeetingDate.sendKeys("20231217");
        MeetingDate.sendKeys(Keys.TAB);
        StartTime.sendKeys("1710");
        StartTime.sendKeys(Keys.TAB);
        EndTime.sendKeys("1711");
        SearchBtn.click();
        SelectAMeetingRoom.click();
        MeetingRoom.click();
        SelectACompany.click();
        Company.click();
        SaveMeetingBooking.click();

    }
}
