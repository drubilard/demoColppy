package Commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Configuration {
    public static final String url = "https://test.colppy.com/";

    public static WebDriver webDriverManagerChrome() {
        WebDriverManager.chromedriver().version("111").setup();
        return new ChromeDriver();
    }
}
