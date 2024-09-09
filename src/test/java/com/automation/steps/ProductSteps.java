package com.automation.steps;

import com.automation.pages.ProductPage;
import com.automation.utils.ConfigReader;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ProductSteps {
    ProductPage productPage = new ProductPage();

    @Then("verify user is on searched {string} product page")
    public void verify_user_is_on_searched_product_page(String searchKey) {
        assertThat(productPage.verifyUserIsOnSearchedProductPage()).containsText(ConfigReader.getConfigValue(searchKey));
    }

    @When("user clicks on a product from the search results")
    public void user_clicks_on_a_product_from_the_search_results() {
        productPage.clickOnFirstProductInSearchedResult();
    }
}
