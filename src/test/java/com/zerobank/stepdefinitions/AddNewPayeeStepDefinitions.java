package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AddNewPayeeStepDefinitions extends PayBillsPage {

    LoginPage loginPage = new LoginPage();

    @Given("Add New Payee tab")
    public void add_New_Payee_tab() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
        String userName = ConfigurationReader.getProperty("user_name");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(userName, password);
        payBillsTab.click();
        addNewPayee.click();
        System.out.println("User is in PayBills Page and clicked to add New Payee tab");
    }

    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(io.cucumber.datatable.DataTable dataTable) {
    BrowserUtils.wait(3);
    payeeName.sendKeys("The Law Offices of Hyde, Price & Scharks");
    payeeAdress.sendKeys("100 Same st, Anytown, USA, 10001");
    payeeAccount.sendKeys("Checking ");
    payeeDetails.sendKeys("XYZ account");
    addButton.click();
        System.out.println("New Payee added");
    }

    @Then("message The new Payee The Law Offices of Hyde, Price & Scharks successfully created. should be displayed")
    public void message_The_new_Payee_The_Law_Offices_of_Hyde_Price_Scharks_successfully_created_should_be_displayed() {
        message.isDisplayed();
        System.out.println(message.getText());
        Assert.assertEquals(message.getText(),"The new payee The Law Offices of Hyde, Price & Scharks was successfully created.");
        System.out.println("The message successfully displayed");

    }


}
