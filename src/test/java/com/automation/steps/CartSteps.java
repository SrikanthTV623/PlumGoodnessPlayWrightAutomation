package com.automation.steps;

import com.automation.pages.CartPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CartSteps {
    CartPage cartPage = new CartPage();

    @Then("verify item is added into cart and should displays {string}")
    public void verify_item_is_added_into_cart_and_should_displays(String cartCountKey) {
        assertThat(cartPage.sendCartCount()).containsText(cartCountKey);
    }
}
