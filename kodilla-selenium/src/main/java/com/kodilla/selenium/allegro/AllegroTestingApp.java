package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");
        Thread.sleep(30000);
        WebElement categoryElement = driver.findElement(By.xpath("//select[@aria-label='Kategoria i opcje wyszukiwania']"));
        Select categorySelect = new Select(categoryElement);
        categorySelect.selectByVisibleText("Elektronika");
        WebElement searchField = driver.findElement(By.xpath("//input[@placeholder='czego szukasz?']"));
        searchField.sendKeys("Mavic mini");
        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();
    }
}