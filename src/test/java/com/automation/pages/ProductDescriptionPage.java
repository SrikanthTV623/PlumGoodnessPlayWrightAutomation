package com.automation.pages;

import com.microsoft.playwright.Locator;

public class ProductDescriptionPage extends BasePage{

    Locator productDescriptionTxt;
    Locator addToCartBtn;

    public ProductDescriptionPage(){
        productDescriptionTxt = page.locator("//h1[@class='product-title h5']");
        addToCartBtn = page.getByText("Add to cart");
    }

    public Locator productDescriptionPageDisplayed(){
        return productDescriptionTxt;
    }

    public void clickOnAddToCartBtn(){
        addToCartBtn.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
