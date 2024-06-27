package site.stellarburgers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
    private static WebDriver driver;
    public static WebDriver getWebDriver() {
        if (driver == null) {
            String browser = System.getProperty("browser", "chrome");
            switch (browser) {
                case "chrome":
                    return WebDriverManager.chromedriver().create();
                case "yandex":
                    System.setProperty("webdriver.chrome.driver", "src/test/resources/yandexdriver");
                    return new ChromeDriver();
                default:
                    throw new RuntimeException("Unsupported browser " + browser);
            }
        }
        return driver;
    }
}
