Feature: Searching for a Product


  Scenario: Searching for a Product
    Given gettig driver from NavigatingMenuOptions
		When Write in the Search bar and click search icon
		Then Print the first Search result containing the Search keyword
