import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Browser {
    private WebDriver webdriver;

    Browser(String webDriverType){
      switch (webDriverType) {
          case "Chrome":
              System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
              webdriver = new ChromeDriver();
              break;
          case "Firefox":
              System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
              webdriver = new FirefoxDriver();
              break;
      }
    }

    public WebDriver getWebdriver() {
        return webdriver;
    }
}
