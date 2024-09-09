package com.automation.pages;

import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;

public class LoginPage extends BasePage {

    FrameLocator iframeId;
    Locator mobileNumberField;
    Locator welcomeMessage;

    public LoginPage(){
        iframeId = page.frameLocator("//iframe[@id='iframe-kp']");
        mobileNumberField = iframeId.locator("//input[@id='phone-input']");
        welcomeMessage = iframeId.getByText("🎉 Congratulations!Let the");
    }

    public Locator verifyLoginPage(){
        iframeId.first();
        return mobileNumberField;
    }

    public void enterMobileNumber(String phoneNoValue){
        mobileNumberField.fill(phoneNoValue);
    }

    public Locator isLoginSuccessfully(){
        System.out.println(welcomeMessage.textContent());
        return welcomeMessage;
    }
}
