Feature: Form Automation
  As A User I would like to log in, add item to the cart and buy it

  Scenario: user can log in to account
    Given   user navigates to the app url
    When    user click sign in button
    And     user fills email textfield
    And     user fills password textfield
    And     user enter sign in button
    And     user choose women department
    And     user chose and view the item
    And     user add it to the cart
    And     user click on proceed to checkout
    And     user click on proceed to checkout again
    And     user check street delivery
    And     user check city delivery
    And     user proceed to checkout before shipping
    And     user click on terms of service
    And     user proceed to checkout before payment
    And     user choose option to pay by check
    And     user confirm order
    And     user check tjat order is submitted
    And     user back to orders
    Then    user is logged out