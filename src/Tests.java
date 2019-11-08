import org.openqa.selenium.WebDriver;
import pages.*;

public class Tests {

    public void registerTest(WebDriver driver) {
     new Home(driver);
     new Register(driver);
    }
}
