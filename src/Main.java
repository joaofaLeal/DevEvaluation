import org.openqa.selenium.WebDriver;
public class Main {
    static Tests tests = new Tests();

    public static void main(String[] args) {
        WebDriver driver;
        Browser browser = new Browser("Chrome");
        driver = browser.getWebdriver();
// tests

       driver.close();
    }
}
