@FlightBooking
Feature: Flight Booking on Agoda
  As a frequent traveler
  I want to book the cheapest AirAsia flight from Jakarta to Singapore
  So that I can travel economically

  Scenario: Book cheapest AirAsia flight from Jakarta to Singapore for tomorrow
    Given I am on Agoda home page
    When I navigate to flights section
    And I set departure city as "Jakarta" and arrival city as "Singapore"
    And I select departure date as tomorrow
    And I click search flights button
    And I filter flights by AirAsia airline
    And I select the cheapest AirAsia flight
    Then I should be redirected to contact details page
    And I should verify selected airline is AirAsia
    And I should verify total price matches selected flight
    And I should verify flight details are correct
    And I should verify passenger details section is available
    And I should verify contact information section is available
    And I should verify all important data is displayed correctly