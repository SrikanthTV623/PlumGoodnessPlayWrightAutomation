package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Given("user opens website")
    public void user_opens_website() {
        homePage.openWebSite();
    }

    @Then("verify user is on the Plum Goodness homepage")
    public void verify_user_is_on_the_plum_goodness_homepage() {
        assertThat(homePage.verifyHomePageIsDisplayed()).isVisible();
    }

    @When("the user enters {string} into the search bar")
    public void the_user_enters_into_the_search_bar(String searchKey) {
        homePage.enterTheSearchValue(ConfigReader.getConfigValue(searchKey));
    }

    @When("user clicks on the login logo")
    public void userClicksOnTheLoginLogo() {
        homePage.clickOnLoginIcon();
    }
}
