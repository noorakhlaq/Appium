@EndToEnd
Feature: end to end

  Scenario Outline:
    Given user unlock device
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then I should see Products page with title "<title>"
    And the product is listed with title "<title Name>" and price "<price>"
    When I click product title "<title Name>"
    Then I should be on product details page with title "<title>", price "<price>" and description "<description>"
    And add the product to the cart
    When I click on cart button
    And user click on Checkout
    And user enter address "<First Name>", "<Last Name>" and "<Postal Code>"
    And click on finish button
    And Lock the device

    Examples:
      | username      | password     | title    | title Name                        | price  | description                                                                                                                            | First Name | Last Name | Postal Code |
      | standard_user | secret_sauce | PRODUCTS | Test.allTheThings() T-Shirt (Red) | $29.99 | carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection. | Abdul      | Noor      | 530044      |
      | standard_user | secret_sauce | PRODUCTS | Test.allTheThings() T-Shirt (Red) | $29.99 | carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection. | Prasad     | Katta     | 500084      |