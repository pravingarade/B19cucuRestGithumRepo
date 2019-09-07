Feature: Get rest asured test data driven
  
Scenario Outline: Test get request101
    Given user start the rest asured test
    When user hit get request
    Then user checks at path "<JSPath>" the "<JSValue>" count
    
    Examples:
    
   |JSPath 																						|	JSValue 											 |
   |MRData.CircuitTable.Circuits[0].circuitName 			| Albert Park Grand Prix Circuit |
   |MRData.CircuitTable.Circuits[8].Location.locality | Monte-Carlo                    |
   
    