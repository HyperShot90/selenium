package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleSearchPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    // Locators
    private final By searchBoxLocator = By.name("q");
    private final By searchButtonLocator = By.name("btnK");

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void navigateToGoogle() {
        driver.get("https://www.google.com");
    }

    public void searchFor(String searchTerm) {
        // Wait for search box to be visible and enter search term
        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(searchBoxLocator));
        searchBox.clear();
        searchBox.sendKeys(searchTerm);

        // Submit the search
        searchBox.submit();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
} 