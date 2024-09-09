package com.automation.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.nio.file.Paths;

public class CartPage extends BasePage{

    Locator cartCountNumber;

    public CartPage(){
        cartCountNumber = page.locator("//div[@id='cart-icon-bubble']//span[1]");
    }

    public Locator sendCartCount(){
        return cartCountNumber;
    }
}
