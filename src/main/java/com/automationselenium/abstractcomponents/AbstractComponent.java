package com.automationselenium.abstractcomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AbstractComponent {
    
    protected WebDriver driver;
    protected WebDriverWait wait;
    
    public AbstractComponent(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }
    
    public void waitForElementToAppear(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    
    public void waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    
    public void waitForAllElementsToAppear(List<WebElement> elements) {
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }
    
    public void click(WebElement element) {
        waitForElementToBeClickable(element);
        element.click();
    }
    
    public void sendKeys(WebElement element, String text) {
        waitForElementToAppear(element);
        element.clear();
        element.sendKeys(text);
    }
    
    public String getText(WebElement element) {
        waitForElementToAppear(element);
        return element.getText();
    }
    
    public boolean isElementDisplayed(WebElement element) {
        try {
            waitForElementToAppear(element);
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}