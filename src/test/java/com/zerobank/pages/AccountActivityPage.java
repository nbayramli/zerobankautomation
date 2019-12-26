package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage {

    @FindBy(id= "account_activity_tab")
    public WebElement accountActivityTab;

    @FindBy(className= "ui-state-default ui-corner-top ui-tabs-selected ui-state-active")
    public WebElement findTransactions;

    @FindBy(css = "div > div > div:nth-child(2) > div > table > tbody > tr:nth-child(1) > td:nth-child(1) > a")
    public WebElement savings;

    @FindBy(xpath = "//option[@value='1']")
    public WebElement dropdownSavings;

    @FindBy(xpath = "//*[text()='Brokerage']")
    public WebElement brokerage;

    @FindBy(xpath = "//option[@value='6']")
    public WebElement dropdownBrokerage;

    @FindBy(xpath = "//*[text()='Checking']")
    public WebElement checking;

    @FindBy(xpath = "//option[@value='2']")
    public WebElement dropdownChecking;

    @FindBy(xpath = "//a[text()='Credit Card']")
    public WebElement creditCard;

    @FindBy(xpath = "//option[@value='5']")
    public WebElement dropdownCreditCard;

    @FindBy(xpath = "//a[text()='Loan']")
    public WebElement loan;

    @FindBy(xpath = "//option[@value='4']")
    public WebElement dropdownLoan;

    @FindBy(xpath = "//table/thead/tr/th[1]")
    public WebElement date;

    @FindBy(xpath = "//table/thead/tr/th[2]")
    public WebElement description;

    @FindBy(xpath = "//table/thead/tr/th[3]")
    public WebElement deposit;

    @FindBy(xpath = "//table/thead/tr/th[4]")
    public WebElement withdrawal;

    @FindBy(id = "aa_fromDate")
    public WebElement fromDate;

    @FindBy(id = "aa_toDate")
    public WebElement toDate;

    @FindBy(className = "btn btn-primary")
    public WebElement search;

    public AccountActivityPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void pagesubtitle() {
        accountActivityTab.click();
        Driver.get().getTitle();

    }

    public void getDropDownOptions(String str) {
        WebElement dropdown = Driver.get().findElement(By.id("aa_accountId"));
        Select select=new Select(dropdown);
        select.selectByVisibleText(str);
        }

    }
