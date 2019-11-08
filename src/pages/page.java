package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import xpaths.LoadXpaths;

public class page {
    private WebDriver driver;
    LoadXpaths xpath = new LoadXpaths("\\xpaths.properties");

    public page(WebDriver driver){
        this.driver = driver;
        insertCredentials("Username");
        insertCredentials("Password");
        clickInLogin();
    }

    private void insertCredentials(String property) {
        WebElement element = driver.findElement(By.xpath(xpath.getXpath(property)));
        System.out.println("Inserting" + property + "...");
        element.sendKeys("upadmin");
    }

    private void clickInLogin() {
        WebElement element = driver.findElement(By.xpath(xpath.getXpath("Loginbtn")));
        System.out.println("Clicking on login button...");
        element.click();
    }
}
