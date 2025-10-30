package com.automationselenium.page_factory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.automationselenium.abstractcomponents.AbstractComponent;
import com.automationselenium.page_factory.object_repository.ContactDetailsPageOR;

import static org.junit.Assert.*;

public class ContactDetailsPage extends AbstractComponent {
    
    private ContactDetailsPageOR or;
    
    public ContactDetailsPage(WebDriver driver) {
        super(driver);
        this.or = new ContactDetailsPageOR();
        PageFactory.initElements(driver, this.or);
    }
    
    public void verifySelectedAirline(String expectedAirline) {
        waitForElementToAppear(or.selectedAirline);
        String actualAirline = getText(or.selectedAirline);
        assertTrue("Expected airline: " + expectedAirline + " but found: " + actualAirline,
                  actualAirline.toLowerCase().contains(expectedAirline.toLowerCase()));
    }
    
    public void verifyTotalPrice(double expectedPrice) {
        waitForElementToAppear(or.totalPrice);
        String priceText = getText(or.totalPrice);
        double actualPrice = Double.parseDouble(priceText.replaceAll("[^0-9.]", ""));
        assertEquals("Total price verification failed", expectedPrice, actualPrice, 0.01);
    }
    
    public void verifyFlightDetails() {
        assertTrue("Flight details should be displayed", 
                   isElementDisplayed(or.flightDetailsSummary));
        assertTrue("Departure city should be displayed",
                   isElementDisplayed(or.departureCity));
        assertTrue("Arrival city should be displayed",
                   isElementDisplayed(or.arrivalCity));
        assertTrue("Departure date should be displayed",
                   isElementDisplayed(or.departureDate));
    }
    
    public void verifyPassengerSection() {
        assertTrue("Passenger details section should be available",
                   isElementDisplayed(or.passengerSection));
        assertTrue("Passenger first name field should be available",
                   isElementDisplayed(or.passengerFirstName));
        assertTrue("Passenger last name field should be available",
                   isElementDisplayed(or.passengerLastName));
    }
    
    public void verifyContactInformationSection() {
        assertTrue("Contact information section should be available",
                   isElementDisplayed(or.contactSection));
        assertTrue("Contact email field should be available",
                   isElementDisplayed(or.contactEmail));
        assertTrue("Contact phone field should be available",
                   isElementDisplayed(or.contactPhone));
    }
    
    public void verifyRoute(String expectedDeparture, String expectedArrival) {
        String actualDeparture = getText(or.departureCity);
        String actualArrival = getText(or.arrivalCity);
        
        assertTrue("Departure city should contain: " + expectedDeparture,
                   actualDeparture.toLowerCase().contains(expectedDeparture.toLowerCase()));
        assertTrue("Arrival city should contain: " + expectedArrival,
                   actualArrival.toLowerCase().contains(expectedArrival.toLowerCase()));
    }
    
    public void verifyFlightNumber() {
        assertTrue("Flight number should be displayed",
                   isElementDisplayed(or.flightNumber));
    }
}
