package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccountActivityStepDefinitions extends AccountActivityPage {

    LoginPage loginPage = new LoginPage();

    AccountActivityPage accountActivityPage=new AccountActivityPage();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
       Driver.get().get(ConfigurationReader.getProperty("url"));
       String userName = ConfigurationReader.getProperty("user_name");
       String password = ConfigurationReader.getProperty("password");
        loginPage.login(userName, password);
        System.out.println("User logged in successfully");
    }

    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
        BrowserUtils.wait(2);
        savings.click();
        System.out.println("Clicked to Savings link");
    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        BrowserUtils.wait(2);
        accountActivityPage.pagesubtitle();
        Assert.assertTrue(accountActivityTab.isDisplayed());

    }

    @Then("Account drop down should have Savings selected")
    public void account_drop_down_should_have_Savings_selected() {
    accountActivityPage.getDropDownOptions("Savings");
    Assert.assertTrue(dropdownSavings.isSelected());
    }

        @When("the user clicks on Brokerage link on the Account Summary page")
        public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
            BrowserUtils.wait(2);
            brokerage.click();
            System.out.println("Clicked to Brokerage link");
        }

        @Then("Account drop down should have Brokerage selected")
        public void account_drop_down_should_have_Brokerage_selected() {
            BrowserUtils.wait(2);
            accountActivityPage.getDropDownOptions("Brokerage");
            Assert.assertTrue(dropdownBrokerage.isSelected());
            System.out.println("Brokerage is selected");
        }

        @When("the user clicks on Checking link on the Account Summary page")
        public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
            BrowserUtils.wait(2);
            checking.click();
            System.out.println("Clicked to Checking link");
        }

        @Then("Account drop down should have Checking selected")
        public void account_drop_down_should_have_Checking_selected() {
            BrowserUtils.wait(2);
        accountActivityPage.getDropDownOptions("Checking");
            Assert.assertTrue(dropdownChecking.isSelected());
            System.out.println("Checking is selected");
        }

        @When("the user clicks on Credit card link on the Account Summary page")
        public void the_user_clicks_on_Credit_card_link_on_the_Account_Summary_page() {
            BrowserUtils.wait(2);
            creditCard.click();
        System.out.println("Clicked to Credit Card link");
    }

    @Then("Account drop down should have Credit Card selected")
    public void account_drop_down_should_have_Credit_Card_selected() {
        BrowserUtils.wait(2);
        accountActivityPage.getDropDownOptions("Credit Card");
        Assert.assertTrue(dropdownCreditCard.isSelected());
        System.out.println("Credit Card is selected");
    }

    @When("the user clicks on Loan link on the Account Summary page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page() {
        BrowserUtils.wait(2);
        loan.click();
    }

    @Then("Account drop down should have Loan selected")
    public void account_drop_down_should_have_Loan_selected() {
        BrowserUtils.wait(2);
        accountActivityPage.getDropDownOptions("Loan");
        Assert.assertTrue(dropdownLoan.isSelected());
        System.out.println("Loan is selected");
    }

}
