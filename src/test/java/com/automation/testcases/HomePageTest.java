package com.automation.testcases;

import com.automation.base.TestBase;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import org.testng.annotations.BeforeMethod;

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
}
