package Page;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

import Commons.Configuration;

public class googlePage extends LoadableComponent<googlePage> {
    private WebDriver driver;
    private WebDriverWait ewait;

    @FindBy(css = "input[value='Ingresar']")
    private WebElement submit;

    @FindBy(id = "emailLogin")
    private WebElement email;

    @FindBy(id = "passwordLogin")
    private WebElement pass;

    public googlePage() {
        driver = Configuration.webDriverManagerChrome();
        ewait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public WebDriver getdriver() {
        return driver;
    }

    public boolean searchGoogle(String emailText, String passText) {
        ewait.until(ExpectedConditions.visibilityOf(submit));
        email.clear();
        email.sendKeys(emailText);
        pass.clear();
        pass.sendKeys(passText);
        // submit.submit();
        submit.click();
        /**
         * ewait.until(ExpectedConditions.titleContains("Google"));
         * if (driver.getTitle().equalsIgnoreCase(search + " - Buscar con Google")) {
         * System.out.println(search + " - Buscar con Google");
         * return true;
         * } else {
         * return false;
         * }
         **/
        return true;
    }

    @Override
    protected void load() {
        driver.get(Configuration.url);

    }

    @Override
    protected void isLoaded() throws Error {
        assertTrue(driver.getTitle().equals("Colppy | Sistema Contable Online"), "Pagina no encontrada");

    }

}
