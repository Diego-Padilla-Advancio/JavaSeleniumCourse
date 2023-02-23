package steps;

import PO.CartPo;
import driver.DriverManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartSteps extends DriverManager {

    CartPo cartPo = new CartPo(driver);

    @And("Click and remove first inventory in cart")
    public void iClickShoppingCartButton() {
        cartPo.clickRemoveFirstItemButton();
    }
    @And("Validate that my cart is empty")
    public void validate() {
        cartPo.assertInventoryIsEmpty();
    }


}

