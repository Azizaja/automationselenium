package com.automationselenium.page_factory.pages;

import com.automationselenium.abstractcomponents.AbstractComponent;
import com.automationselenium.page_factory.object_repository.FlightSelectionPageOR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

// public class FlightSelectionPage extends AbstractComponent {
    
//     private FlightSelectionPageOR or;
    
//     public FlightSelectionPage(WebDriver driver) {
//         super(driver);
//         this.or = new FlightSelectionPageOR();
//         PageFactory.initElements(driver, this.or);
//     }
    
//     public double getSelectedFlightPrice() {
//         waitForElementToAppear(or.selectedFlightPrice);
//         String priceText = getText(or.selectedFlightPrice);
//         return Double.parseDouble(priceText.replaceAll("[^0-9.]", ""));
//     }
    
//     public String getSelectedAirline() {
//         return getText(or.selectedAirline);
//     }
    
//     public void clickContinue() {
//         click(or.continueButton);
//     }
    
//     public boolean isFlightSummaryDisplayed() {
//         return isElementDisplayed(or.flightSummary);
//     }
// }
