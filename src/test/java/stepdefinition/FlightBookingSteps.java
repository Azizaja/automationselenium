package stepdefinition;


import hook.Hooks;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

import com.automationselenium.page_factory.pages.ContactDetailsPage;
import com.automationselenium.page_factory.pages.FlightSelectionPage;
import com.automationselenium.page_factory.pages.HomePage;

import static org.junit.Assert.*;

public class FlightBookingSteps {
    
    private WebDriver driver;
    private HomePage homePage;
    private FlightSelectionPage flightSelectionPage;
    private ContactDetailsPage contactDetailsPage;
    private double expectedFlightPrice;
    
    public FlightBookingSteps() {
        this.driver = Hooks.getDriver();
    }
    
    @Given("I am on Agoda home page")
    public void i_am_on_agoda_home_page() {
        driver.get(Hooks.getProperty("base.url"));
        homePage = new HomePage(driver);
    }
    
    @When("I navigate to flights section")
    public void i_navigate_to_flights_section() {
        homePage.navigateToFlightsSection();
    }
    
    @When("I set departure city as {string} and arrival city as {string}")
    public void i_set_departure_city_as_and_arrival_city_as(String departure, String arrival) {
        homePage.setDepartureCity(departure);
        homePage.setArrivalCity(arrival);
    }
    
    @When("I select departure date as tomorrow")
    public void i_select_departure_date_as_tomorrow() {
        homePage.selectTomorrowDate();
    }
    
    @When("I click search flights button")
    public void i_click_search_flights_button() {
        homePage.clickSearchFlights();

    }
    
    @When("I filter flights by AirAsia airline")
    public void i_filter_flights_by_air_asia_airline() {
        
    }
    
    @When("I select the cheapest AirAsia flight")
    public void i_select_the_cheapest_air_asia_flight() {
  
        flightSelectionPage = new FlightSelectionPage(driver);
        assertTrue("Flight summary should be displayed", 
                   flightSelectionPage.isFlightSummaryDisplayed());
        
        flightSelectionPage.clickContinue();
    }
    
    @Then("I should be redirected to contact details page")
    public void i_should_be_redirected_to_contact_details_page() {
        contactDetailsPage = new ContactDetailsPage(driver);
        assertTrue("Should be on contact details page", 
                   driver.getCurrentUrl().contains("contact") || 
                   driver.getCurrentUrl().contains("details"));
    }
    
    @Then("I should verify selected airline is AirAsia")
    public void i_should_verify_selected_airline_is_air_asia() {
        contactDetailsPage.verifySelectedAirline("AirAsia");
    }
    
    @Then("I should verify total price matches selected flight")
    public void i_should_verify_total_price_matches_selected_flight() {
        contactDetailsPage.verifyTotalPrice(expectedFlightPrice);
    }
    
    @Then("I should verify flight details are correct")
    public void i_should_verify_flight_details_are_correct() {
        contactDetailsPage.verifyFlightDetails();
        contactDetailsPage.verifyRoute("Jakarta", "Singapore");
        contactDetailsPage.verifyFlightNumber();
    }
    
    @Then("I should verify passenger details section is available")
    public void i_should_verify_passenger_details_section_is_available() {
        contactDetailsPage.verifyPassengerSection();
    }
    
    @Then("I should verify contact information section is available")
    public void i_should_verify_contact_information_section_is_available() {
        contactDetailsPage.verifyContactInformationSection();
    }
    
    @Then("I should verify all important data is displayed correctly")
    public void i_should_verify_all_important_data_is_displayed_correctly() {
        contactDetailsPage.verifySelectedAirline("AirAsia");
        contactDetailsPage.verifyTotalPrice(expectedFlightPrice);
        contactDetailsPage.verifyFlightDetails();
        contactDetailsPage.verifyPassengerSection();
        contactDetailsPage.verifyContactInformationSection();
    }
}
