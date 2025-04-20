package com.example.tests;

import com.example.pages.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchTest {
    private WebDriver driver;
    private GoogleSearchPage searchPage;

    @BeforeMethod
    public void setUp() {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Initialize page objects
        searchPage = new GoogleSearchPage(driver);
    }

    @Test
    public void testGoogleSearch() {
        // Navigate to Google using page object
        searchPage.navigateToGoogle();

        // Perform search using page object
        searchPage.searchFor("Selenium WebDriver");

        // Verify the title contains our search term
        String pageTitle = searchPage.getPageTitle();
        Assert.assertTrue(pageTitle.contains("Selenium WebDriver"), 
            "Page title should contain 'Selenium WebDriver'");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
} 