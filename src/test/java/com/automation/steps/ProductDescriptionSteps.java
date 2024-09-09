package com.automation.steps;

import com.automation.pages.ProductDescriptionPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ProductDescriptionSteps {
    ProductDescriptionPage productDescriptionPage = new ProductDescriptionPage();

    @Then("user should be redirected to the product details page")
    public void user_should_be_redirected_to_the_product_details_page() {
        assertThat(productDescriptionPage.productDescriptionPageDisplayed()).isVisible();
    }

    @When("user clicks the Add to Cart button")
    public void user_clicks_the_add_to_cart_button() {
        productDescriptionPage.clickOnAddToCartBtn();
    }
}
