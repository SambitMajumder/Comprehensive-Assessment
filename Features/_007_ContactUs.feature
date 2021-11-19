Feature: Contact Us page submit

  Scenario Outline: Contact Us page submit
    Given Got the driver from AddGiftCard
    When User clicked the Contact us option
    Then User entered the name <name> email <email> message <message>
    And Click on the Sumbit button and verify submission

    Examples: 
      | name  | email | message  |
      | Raju Halder | raju1@gmail.com | This is for testing project |
  
