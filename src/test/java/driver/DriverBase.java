package driver;

import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebDriver;

public class DriverBase extends ThucydidesWebDriverSupport {
    protected WebDriver driver;

    public DriverBase(WebDriver driver){
        this.driver = driver;

        useDriver(getDriver());
    }
}

