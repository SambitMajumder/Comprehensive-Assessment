Feature: Testing the Sort By feature

Scenario: Testing the Sort By feature
    Given Getting Driver from the openURLSD
    When User clicked on the option Personalized Gifts
    Then Validate if it is the Personalized Gifts page
    Then Select Best selling from Sort By feature
    And Validate the first Product