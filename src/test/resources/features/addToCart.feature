Feature: Validate Add To Cart Button In Plum Goodness Website

  Background:
    Given user opens website
    Then verify user is on the Plum Goodness homepage

  Scenario: User searches for a product and adds it to the cart
    When the user enters "search.value" into the search bar
    Then verify user is on searched "search.value" product page
    When user clicks on a product from the search results
    Then user should be redirected to the product details page
    When user clicks the Add to Cart button
    Then verify item is added into cart and should displays "1"

