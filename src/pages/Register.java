package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import xpaths.LoadXpaths;

public class Register {
    private WebDriver driver;
    LoadXpaths xpath = new LoadXpaths("\\RegisterXpaths.properties");

    public Register(WebDriver driver){
        this.driver = driver;
        insertEmail("Email");
        clickNext("NextBtn");
        insertName("Name");
        insertPhone("Phone");
        insertPassword("Password");
        clickRegister("Register");
    }

    private void insertEmail(String property) {
        WebElement element = driver.findElement(By.xpath(xpath.getXpath(property)));
        System.out.println("Inserting" + property + "...");
        element.sendKeys("guitarloyal@gmail.com");
    }

    private void insertName(String property) {
        WebElement element = driver.findElement(By.xpath(xpath.getXpath(property)));
        System.out.println("Inserting" + property + "...");
        element.sendKeys("Joao Leal");
    }
    private void insertPhone(String property) {
        WebElement element = driver.findElement(By.xpath(xpath.getXpath(property)));
        System.out.println("Inserting" + property + "...");
        element.sendKeys("987654321");
    }
    private void insertPassword(String property) {
        WebElement element = driver.findElement(By.xpath(xpath.getXpath(property)));
        System.out.println("Inserting" + property + "...");
        element.sendKeys("bananas");
    }
    private void clickNext(String property) {
        WebElement element = driver.findElement(By.xpath(xpath.getXpath(property)));
        System.out.println("Clicking on Next button...");
        element.click();
    }
    private void clickRegister(String property) {
        WebElement element = driver.findElement(By.xpath(xpath.getXpath(property)));
        System.out.println("Clicking on Register button...");
        element.click();
    }
}
