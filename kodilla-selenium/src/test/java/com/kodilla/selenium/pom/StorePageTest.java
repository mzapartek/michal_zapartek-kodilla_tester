package com.kodilla.selenium.pom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StorePageTest {
    WebDriver driver;
    StorePage storePage;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/test/store");
        storePage = new StorePage(driver);
    }

    @Test
    public void testSearchNoteBook() {
        storePage.search("NoteBook");
        int count = storePage.getProductsCount();
        assertEquals(2, count);
        System.out.println("NoteBook: " + count);
    }

    @Test
    public void testSearchSchool() {
        storePage.search("School");
        int count = storePage.getProductsCount();
        System.out.println("School: " + count);
        assertEquals(1, count);
    }

    @Test
    public void testSearchBrand() {
        storePage.search("Brand");
        int count = storePage.getProductsCount();
        System.out.println("Brand: " + count);
        assertEquals(1, count);
    }

    @Test
    public void testSearchBusiness() {
        storePage.search("Business");
        int count = storePage.getProductsCount();
        System.out.println("Business: " + count);
        assertEquals(0, count);
    }

    @Test
    public void testSearchGaming() {
        storePage.search("Gaming");
        int count = storePage.getProductsCount();
        System.out.println("Gaming: " + count);
        assertEquals(1, count);
    }

    @Test
    public void testSearchPowerful() {
        storePage.search("Powerful");
        int count = storePage.getProductsCount();
        System.out.println("Powerful: " + count);
        assertEquals(0, count);
    }

    @Test
    public void testSearchIgnoresCase() {
        storePage.search("NoteBook");
        int normalCount = storePage.getProductsCount();

        storePage.search("NOTEBOOK");
        int upperCount = storePage.getProductsCount();

        assertEquals(normalCount, upperCount);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }
}