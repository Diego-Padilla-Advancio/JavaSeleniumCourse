package steps;

import PO.ProductsPo;
import driver.DriverManager;
import io.cucumber.java.en.And;

public class ProductSteps extends DriverManager {
ProductsPo productsPo = new ProductsPo(driver);

    @And("I get the description of the element with header {string}")
    public void iGetTheDescriptionOfTheElementWithHeader(String header) {
        System.out.println( productsPo.getDescriptionOfGivenHeader(header));

    }


    @And("I click shopping cart button")
    public void iClickShoppingCartButton() {
        productsPo.clickShoppingCartButton();
    }

    @And("Click backpack ADD TO CART button")
    public void clickBackpackADDTOCARTButton() {
        productsPo.clickbackpackAddToCartButton();
    }
}
