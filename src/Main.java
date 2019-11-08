import org.openqa.selenium.WebDriver;
public class Main {
    static Tests tests = new Tests();

    public static void main(String[] args) {
        WebDriver driver;
        Browser browser = new Browser("Firefox");
        driver = browser.getWebdriver();
        driver.get("https://staging.engineer.ai/home");
// tests
        tests.registerTest(driver);

       driver.close();
    }
}
