package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummaryPage {


    @FindBy(id = "  account_summary_tab")
    public WebElement accountSummaryTab;

    @FindBy(xpath = "//*[text() ='Cash Accounts']")
    public WebElement cashAccounts;

    @FindBy(xpath = "//*[text() ='Investment Accounts']")
    public WebElement investmentAccounts;

    @FindBy(id = "user_password")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[text() ='Credit Accounts']")
    public WebElement creditAccounts;

    @FindBy(xpath = "//*[text() ='Loan Accounts']")
    public WebElement loanAccounts;

    public AccountSummaryPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void pagesubtitle() {
        accountSummaryTab.click();
        Driver.get().getTitle();

    }
}
