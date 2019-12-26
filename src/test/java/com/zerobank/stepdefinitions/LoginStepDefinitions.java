package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinitions {

      LoginPage loginPage=new LoginPage();

    @Given("user is on the login page")
       public void user_is_on_the_login_page() {
        System.out.println("I am on the login page");
        Driver.get().get(ConfigurationReader.getProperty("url"));

    }

    @Then("user logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        System.out.println("Login with valid credentials");
        String userName = ConfigurationReader.getProperty("user_name");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(userName, password);
    }

    @And("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
        BrowserUtils.wait(2);
        Assert.assertEquals(string, loginPage.getPageSubTitle());
        System.out.println("Verifying page subtitle: " + string);
    }



    @Then("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {
        System.out.println("Login with "+string+" username and "+string2+" password.");
    }

    @Then("user verifies that {string} error message is displayed")
    public void user_verifies_that_error_message_is_displayed(String string) {
        System.out.println("Verified that warning message is displayed: "+string);
    }

    @Then("user  does not enters username and password")
    public void user_does_not_enters_username_and_password() {
        System.out.println("Login with "+" username and "+ " password.");
    }

}
