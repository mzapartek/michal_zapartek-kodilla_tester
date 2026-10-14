package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");
        Thread.sleep(30000);
        WebElement categoryElement = driver.findElement(By.cssSelector("select[aria-label='Kategoria i opcje wyszukiwania']"));
        Select categorySelect = new Select(categoryElement);
        categorySelect.selectByVisibleText("Elektronika");
        WebElement searchField = driver.findElement(By.cssSelector("input[placeholder='czego szukasz?']"));
        searchField.sendKeys("Mavic mini");
        WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit']"));
        searchButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("article")));
        List<WebElement> products = driver.findElements(By.tagName("article"));
        for (WebElement product : products) {
            System.out.println(product.getText());
        }
    }
}