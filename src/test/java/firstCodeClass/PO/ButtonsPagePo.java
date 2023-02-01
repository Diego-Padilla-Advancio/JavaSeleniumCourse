package firstCodeClass.PO;

import firstCodeClass.DriverClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPagePo {
    //Declaring our WebElements
     private final WebDriver driver;
    public ButtonsPagePo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this); // Needed to use the @FindByMethods
    }

    @FindBy(xpath = "//button[@id='doubleClickBtn']") //@FindBy is an alternative way to declare a WebElement
    WebElement doubleClickMeButton;
    @FindBy(xpath = "//button[@id='rightClickBtn']")
    WebElement rightClickMeButton;
    @FindBy(xpath ="//button[(text() = 'Click Me')]")
    WebElement ClickMeButton;
    @FindBy(xpath ="//p[@id='doubleClickMessage']")
    WebElement doubleClickMeLabel;
    @FindBy(xpath = "//p[@id='rightClickMessage']")
    WebElement rightClickMeLabel;
    @FindBy(xpath = "//p[@id='dynamicClickMessage']")
    WebElement dynamicClickMeLabel;




    //Declaring our methods
    //Clicks
    public void doubleClickFirstButton() {
        Actions action = new Actions(driver);
        action.doubleClick(doubleClickMeButton).perform();
    }

    public void rightClickSecondButton() {
        Actions action = new Actions(driver);
        action.contextClick(rightClickMeButton).perform();
    }

    public void clickThirdButton() {
        ClickMeButton.click();
    }

    //Asserts
    public void checkDoubleClickMeLabel() {
        String actualText = doubleClickMeLabel.getText();
        String expectedText = "You have done a double click";
        Assert.assertEquals(expectedText, actualText);
    }

    public void checkRightClickMeLabel() {
        Assert.assertEquals("You have done a right click", rightClickMeLabel.getText());
    }

    public void checkDynamicClickMeLabel(String expectedText) {
        String actualText = dynamicClickMeLabel.getText();
        Assert.assertTrue(dynamicClickMeLabel.isEnabled());
        Assert.assertEquals(expectedText, actualText);
    }

}
