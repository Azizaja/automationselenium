package com.automationselenium.page_factory.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automationselenium.abstractcomponents.AbstractComponent;
import com.automationselenium.page_factory.object_repository.HomePageOR;

public class HomePage extends AbstractComponent {
    
    private HomePageOR or;
    
    public HomePage(WebDriver driver) {
        super(driver);
        this.or = new HomePageOR();
        PageFactory.initElements(driver, this.or);
    }
    
    public void navigateToFlightsSection() {
        click(or.flightsTab);
    }
    
    public void setDepartureCity(String city) {
        sendKeys(or.departureInput, city);
        waitForElementToBeClickable(or.firstDepartureSuggestion);
        click(or.firstDepartureSuggestion);
    }
    
    public void setArrivalCity(String city) {
        sendKeys(or.arrivalInput, city);
        waitForElementToBeClickable(or.firstArrivalSuggestion);
        click(or.firstArrivalSuggestion);
    }
    
    public void selectTomorrowDate() {
        click(or.departureDateInput);
        waitForElementToBeClickable(or.tomorrowDate);
        click(or.tomorrowDate);
    }
    
    public void clickSearchFlights() {
        click(or.searchButton);
        waitForElementToDisappear(or.loadingIndicator);
    }
    
    private void waitForElementToDisappear(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
}
