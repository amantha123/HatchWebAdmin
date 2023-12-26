package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.DashboardPage;
import com.pack.pages.LoginPage;
import com.pack.pages.MeetingRoomBookingsPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MeetingRoomBookingsPageTest extends TestBase {

    LoginPage loginPage;
    MeetingRoomBookingsPage meetingRoomBookingsPage;
    DashboardPage dashboardPage;
    TestUtil testUtil;

    public MeetingRoomBookingsPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        meetingRoomBookingsPage = new MeetingRoomBookingsPage();
    }

    @Test(priority= 1)
    public void verifyMeetingRoomBookingsPageTitleTest(){
        String meetingRoomBookingsPageTitle = meetingRoomBookingsPage.verifyMeetingRoomBookingsPageTitle();
        Assert.assertEquals(meetingRoomBookingsPageTitle, "Hatch - Admin");
    }

    @Test(priority = 2)
    public void navigateMeetingRoomBookingsPageTest(){
        meetingRoomBookingsPage.clickOnMeetingRoomBookingsPageLink();
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 3)
    public void verifySelectMeetingRoomTest(){
        meetingRoomBookingsPage.clickOnMeetingRoomBookingsPageLink();
        meetingRoomBookingsPage.verifySelectMeetingRoom();
    }

    @Test(priority = 4)
    public void filterMeetingRoomBookingsBySelectMeetingRoomTest(){
        meetingRoomBookingsPage.clickOnMeetingRoomBookingsPageLink();
        meetingRoomBookingsPage.filterMeetingRoomBookingsBySelectMeetingRoom();
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 5)
    public void verifySelectCompanyTest(){
        meetingRoomBookingsPage.clickOnMeetingRoomBookingsPageLink();
        meetingRoomBookingsPage.verifySelectCompany();
    }

    @Test(priority = 6)
    public void filterMeetingRoomBookingsBySelectCompanyTest(){
        meetingRoomBookingsPage.clickOnMeetingRoomBookingsPageLink();
        meetingRoomBookingsPage.filterMeetingRoomBookingsBySelectCompany();
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 7)
    public void verifyMemberGuestTest(){
        meetingRoomBookingsPage.clickOnMeetingRoomBookingsPageLink();
        meetingRoomBookingsPage.verifyMemberGuest();
    }

    @Test(priority = 8)
    public void filterMeetingRoomBookingByMember(){
        meetingRoomBookingsPage.clickOnMeetingRoomBookingsPageLink();
        meetingRoomBookingsPage.filterMeetingRoomBookingByMember();
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 9)
    public void verifyWeekTest(){
        meetingRoomBookingsPage.clickOnMeetingRoomBookingsPageLink();
        meetingRoomBookingsPage.verifyWeek();
    }

    @Test(priority = 10)
    public void filterMeetingRoomBookingByWeekTest(){
        meetingRoomBookingsPage.clickOnMeetingRoomBookingsPageLink();
        meetingRoomBookingsPage.filterMeetingRoomBookingByWeek();
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 11)
    public void verifyDayTest(){
        meetingRoomBookingsPage.clickOnMeetingRoomBookingsPageLink();
        meetingRoomBookingsPage.verifyDay();
    }

    @Test(priority = 12)
    public void filterMeetingRoomBookingByDayTest(){
        meetingRoomBookingsPage.clickOnMeetingRoomBookingsPageLink();
        meetingRoomBookingsPage.filterMeetingRoomBookingByDay();
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 13)
    public void verifyAddMeetingBookingTest(){
        meetingRoomBookingsPage.clickOnMeetingRoomBookingsPageLink();
        meetingRoomBookingsPage.verifyAddMeetingBooking();
    }

    @Test(priority = 14)
    public void verifyAddingMeetingBookingTest(){
        meetingRoomBookingsPage.clickOnMeetingRoomBookingsPageLink();
        meetingRoomBookingsPage.verifyAddingMeetingBooking();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
