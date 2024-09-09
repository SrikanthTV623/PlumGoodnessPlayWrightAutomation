package com.automation.pages;

import com.microsoft.playwright.Locator;

public class ProductPage extends BasePage{

    Locator toVerifyFirstItemText;
    Locator firstItem;

    public ProductPage(){
        toVerifyFirstItemText = page.locator("//div[@id='usf_container']//ul//li[1]//a[@class='card-link text-current js-prod-link']");
        firstItem = page.locator("//div[@id='usf_container']//ul//li[1]");
    }

    public Locator verifyUserIsOnSearchedProductPage(){
        return toVerifyFirstItemText;
    }

    public void clickOnFirstProductInSearchedResult(){
        firstItem.click();
    }
}
