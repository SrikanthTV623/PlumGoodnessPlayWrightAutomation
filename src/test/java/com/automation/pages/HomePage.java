package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.microsoft.playwright.Locator;

public class HomePage extends BasePage{

    Locator plumLogo;
    Locator searchBarField;
    Locator loginIconInHomePage;

    public HomePage(){
        plumLogo = page.getByAltText("Plum Goodness");
        searchBarField = page.getByPlaceholder("Search");
        loginIconInHomePage = page.locator("//div[@id='kp-login-button-header-logo']");
    }

    public void openWebSite() {
        page.navigate(ConfigReader.getConfigValue("application.url"));
    }

    public Locator verifyHomePageIsDisplayed(){
        return plumLogo;
    }

    public void enterTheSearchValue(String searchValue){
        searchBarField.fill(searchValue);
        searchBarField.press("Enter");
    }

    public void clickOnLoginIcon(){
        loginIconInHomePage.click();
    }

}
