package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import xpaths.LoadXpaths;

import java.util.concurrent.TimeUnit;

public class Home {
    private WebDriver driver;

    LoadXpaths xpath = new LoadXpaths("\\HomePageXpaths.properties");

    public Home(WebDriver driver){
        this.driver = driver;
        clickSignUpBtn("SignUp");
        clickRegisterBtn("Register");

    }

    private void clickSignUpBtn(String property) {
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath(xpath.getXpath(property)));
        System.out.println("Clicking on signup button...");
        element.click();
    }

    private void clickRegisterBtn(String property) {
        WebElement element = driver.findElement(By.xpath(xpath.getXpath(property)));
        System.out.println("Clicking on register button...");
        element.click();
    }
}
