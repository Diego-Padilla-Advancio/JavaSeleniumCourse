package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager extends DriverBase {
    protected WebDriver driver;


    public void initDriver(){
        System.out.println("Initializing Driver!");
        System.setProperty("webdriver.chrome.driver", "C:\\browserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public DriverManager(){
        super(getDriver());
        driver = getDriver();
        this.driver.manage().window().maximize();
    }

    public void quitBrowser() {
        driver.quit();
    }
}
