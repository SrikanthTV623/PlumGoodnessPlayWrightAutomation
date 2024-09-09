package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Then("verify user is on login page")
    public void verifyUserIsOnLoginPage() {
        assertThat(loginPage.verifyLoginPage()).isVisible();
    }


    @When("user enters a valid phone number {string} and OTP")
    public void userEntersAValidPhoneNumberAndOTP(String phoneNoValue) {
        loginPage.enterMobileNumber(ConfigReader.getConfigValue(phoneNoValue));
    }

    @Then("verify user is logged in and print the welcome message to console")
    public void verifyUserIsLoggedInAndPrintTheWelcomeMessageToConsole() {
        assertThat(loginPage.isLoginSuccessfully()).isVisible();
    }
}
