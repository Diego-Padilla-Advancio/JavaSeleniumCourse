package PO;

import driver.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPo  {
    private WebDriver driver;
    public CartPo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this); // Needed to use the @FindByMethods
    }


    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removeFirstItemButton;

    @FindBy(xpath = "//div[@class = 'inventory_item_name']")
    WebElement inventoryElement;

    @FindBy(xpath = "//div[@class = 'inventory_item_name']")
    List<WebElement> inventoryElementList;


    public void clickRemoveFirstItemButton(){removeFirstItemButton.click();}

    public void assertInventoryIsEmpty(){
      //  Assert.assertFalse(inventoryElement.isDisplayed());
        Assert.assertTrue(inventoryElementList.isEmpty());
    }

}
