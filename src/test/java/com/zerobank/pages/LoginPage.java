package com.zerobank.pages;

import com.zerobank.utilities.Driver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "signin_button")
    public WebElement SigninInput;

    @FindBy(id = "user_login")
    public WebElement userNameInput;

    @FindBy(id = "user_password")
    public WebElement passwordInput;

    @FindBy(css = "input[type='submit']")
    public WebElement LoginButton;

    @FindBy(css = "[class='alert alert-error']")
    public WebElement warningMessage;

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    /**
     * reusable login method
     * just call this method to login
     * provide username and password as parameters
     * @param userName
     * @param password
     */
    public void login(String userName, String password){
        SigninInput.click();
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password, Keys.ENTER);
    }

}
