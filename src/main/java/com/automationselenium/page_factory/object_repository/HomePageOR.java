package com.automationselenium.page_factory.object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageOR {
    
    // Flight Tab
    @FindBy(id = "tab-flight-tab")
    public WebElement flightsTab;
    
    // // Add Flight Option
    // @FindBy(xpath = "//span[contains(text(), '+ Add a flight')]")
    // public WebElement addFlightButton;
    
    // // Departure Input
    // @FindBy(css = "[data-element-name='flight-origin-input']")
    // public WebElement departureInput;
    
    // @FindBy(css = "[data-element-name='flight-origin-suggestions'] li:first-child")
    // public WebElement firstDepartureSuggestion;
    
    // // Arrival Input
    // @FindBy(css = "[data-element-name='flight-destination-input']")
    // public WebElement arrivalInput;
    
    // @FindBy(css = "[data-element-name='flight-destination-suggestions'] li:first-child")
    // public WebElement firstArrivalSuggestion;
    
    // // Date Picker
    // @FindBy(css = "[data-element-name='flight-departure-date-input']")
    // public WebElement departureDateInput;
    
    // @FindBy(css = "div[data-date='tomorrow']")
    // public WebElement tomorrowDate;
    
    // // Passenger Selection
    // @FindBy(css = "[data-element-name='travelers-input']")
    // public WebElement travelersInput;
    
    // @FindBy(css = "[data-element-name='apply-travelers']")
    // public WebElement applyTravelersButton;
    
    // // Search Button
    // @FindBy(css = "[data-element-name='flight-search-button']")
    // public WebElement searchButton;
    
    // // Flight Only Option (after clicking Flights tab)
    // @FindBy(xpath = "//div[contains(text(), 'Flight only')]")
    // public WebElement flightOnlyOption;
    
    // // Loading Indicator
    // @FindBy(css = "[data-element-name='loading-indicator']")
    // public WebElement loadingIndicator;
}
