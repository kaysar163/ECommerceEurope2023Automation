package com.magentoapplication.usermodule;

import com.magentoapplication.utility.FunctionClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsletterSubscriptionPage {
    WebDriver driver;
    FunctionClass functionClass;

    @FindBy(css = "a[href=\"http://magentoqa2.unitedcoder.com/newsletter/manage/\"]>strong")
    WebElement newsletterLink;
    @FindBy(css = "div.page-title")
    WebElement newsletterSubscriptionMessage;


    public NewsletterSubscriptionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        functionClass = new FunctionClass(driver);
    }

    public void clickNewsletterSubscriptionLink() {
        functionClass.waitUntilElementPresent(newsletterLink);
        newsletterLink.click();
    }

    public boolean verifySubscriptionPageIsOpened() {
        if (newsletterSubscriptionMessage.isDisplayed())
            return true;
        else return false;
    }
}
