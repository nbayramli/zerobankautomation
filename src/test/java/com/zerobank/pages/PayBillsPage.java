package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBillsPage {

    @FindBy(id= "pay_bills_tab")
    public WebElement payBillsTab;

    @FindBy(xpath = "//*[text()='Add New Payee']")
    public WebElement addNewPayee;

    @FindBy(xpath = "//*[text()='Amount']")
    public WebElement amount;

    @FindBy(id= "np_new_payee_name")
    public WebElement payeeName;

    @FindBy(id= "np_new_payee_address")
    public WebElement payeeAdress;

    @FindBy(id= "np_new_payee_account")
    public WebElement payeeAccount;

    @FindBy(id= "np_new_payee_details")
    public WebElement payeeDetails;

    @FindBy(id = "add_new_payee")
    public WebElement addButton;

    @FindBy(id = "alert_content")
    public WebElement message;


    @FindBy(id= "sp_date")
    public WebElement payDate;

    @FindBy(xpath = "//table/thead/tr/th[3]")
    public WebElement deposit;

    @FindBy(xpath = "//table/thead/tr/th[4]")
    public WebElement withdrawal;

    public PayBillsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void pagesubtitle() {
        payBillsTab.click();
        Driver.get().getTitle();

    }
}
