@Important
Feature: Get rest asured test100
  
@smoke  
Scenario: Test get request101
    Given user start the rest asured test
    When user hit get request
    Then user checks the "30" count 
    Then user checks at path "MRData.CircuitTable.Circuits[0].circuitName" the "Albert Park Grand Prix Circuit" count
    Then user checks at path "MRData.CircuitTable.Circuits[8].Location.locality" the "Monte-Carlo" count 
    
@smoke @regression
Scenario: Test get request102
    Given user start the rest asured test
    When user hit get request
    Then user checks the "30" count 
    Then user checks at path "MRData.CircuitTable.Circuits[0].circuitName" the "Albert Park Grand Prix Circuit" count
    Then user checks at path "MRData.CircuitTable.Circuits[8].Location.locality" the "Monte-Carlo" count 

Scenario: Test get request103
    Given user start the rest asured test
    When user hit get request
    Then user checks the "30" count 
    Then user checks at path "MRData.CircuitTable.Circuits[0].circuitName" the "Albert Park Grand Prix Circuit" count
    Then user checks at path "MRData.CircuitTable.Circuits[8].Location.locality" the "Monte-Carlo" count 

@regression
Scenario: Test get request104
    Given user start the rest asured test
    When user hit get request
    Then user checks the "30" count 
    Then user checks at path "MRData.CircuitTable.Circuits[0].circuitName" the "Albert Park Grand Prix Circuit" count
    Then user checks at path "MRData.CircuitTable.Circuits[8].Location.locality" the "Monte-Carlo" count 
    

  