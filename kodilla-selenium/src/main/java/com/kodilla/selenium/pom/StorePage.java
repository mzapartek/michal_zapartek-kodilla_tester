package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class StorePage {

    WebDriver driver;

    @FindBy(name = "search")
    WebElement searchField;

    @FindBy(css = "section > div > div")
    List<WebElement> products;

    public StorePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void search(String phrase) {
        searchField.clear();
        searchField.sendKeys(phrase);
    }

    public int getProductsCount() {
        return products.size();
    }

    public void waitForProductsCount(int expectedCount) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(d -> products.size() == expectedCount);
    }
}