package com.automation.pages;

import com.automation.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[@name='username']")
    @CacheLookup
    WebElement userName;
    @FindBy(xpath = "//input[@type='password'and @name='pwd']")
    WebElement passWord;
    @FindBy(xpath = "//a[@id='loginButton']")
    WebElement loginButton;
    @FindBy(xpath = "//input[@name='remember']")
    WebElement keepmeLoggedinCheckBox;
    @FindBy(xpath = "//a[@id='toPasswordRecoveryPageLink']")
    WebElement forgotYourPasswordLink;
    @FindBy(xpath = "//div[@class='atLogoImg']")
    WebElement actiTimeLogo;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public Boolean validateActiTimeLogo() {
        return actiTimeLogo.isDisplayed();
    }
    public void enterUserName(String uName) {
        userName.sendKeys(uName);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void enterPassword(String pwd) {

        passWord.sendKeys(pwd);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
