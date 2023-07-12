package com.automation.testcases;

import com.automation.base.TestBase;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initializationProcess();
        loginPage = new LoginPage();
        homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
    }

    @Test(priority = 1)
    public void homePageTaskLinkTest() {
        homePage.clickOnTaskLink();
    }
    @Test(priority = 2)
    public void homePageUserLinkTest() {
        homePage.clickOnUserLink();
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
