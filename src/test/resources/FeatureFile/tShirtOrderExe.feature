Feature: AutomationPractie Ordering Product

	@Scenario1
  Scenario: Order T-Shirt (and Verify in Order History)
    Given user launches browser and pass url
    When user clicks signIn link
    When user enters username and password
    |testing999@test.com|password1|
    And users clicks signIn button
    And user clicks on tShirt button
  	And user clicks on AddToCard button
  	And user clicks on ProceedToCheckOut button
  	And user to check the order and clicks submit
  	And user submit Address Confirmation
  	And user checks terms service and clicks submit
  	And user clicks pay by check
  	And user clicks on confirm my order
  	Then user verifies order in order history
  	
  @Scenario2
  Scenario: 
    Given user launches browser and pass url
    When user clicks signIn link
    When user enters username and password
    |testing999@test.com|password1|
    And users clicks signIn button
    And user clicks my personal info button
    And user updates FirstName and LastName
    |Pavan Prasadh|R|
    And user enters valid username and password
    |testing999@test.com|password1|
    And user clicks save button
    Then verify the message
   
  	


 
