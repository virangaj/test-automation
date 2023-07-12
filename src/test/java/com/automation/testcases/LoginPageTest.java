package com.automation.testcases;

import com.automation.base.TestBase;
import com.automation.pages.LoginPage;
import com.automation.utils.TestUtils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;

    String sheetName = "Users";
    TestUtils testUtil;


    public LoginPageTest() {
        super();
    }


    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
    }


    @Test(priority = 1)
    public void loginPageLogoTest() {
        boolean flag = loginPage.validateActiTimeLogo();
        Assert.assertTrue(flag);
    }


    @DataProvider
    public Object[][] getactiTimeTestData() {
        return TestUtils.getTestData(sheetName);
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}
