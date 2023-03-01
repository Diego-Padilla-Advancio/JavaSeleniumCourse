package steps;

import PO.LoginPo;
import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginSteps extends DriverManager {

    LoginPo loginPo = new LoginPo(driver);
    @And("I fill username {string}")
    public void iFillUsername(String text) {
        loginPo.fillUserName(text);
    }

    @Then("I fill password {string}")
    public void iFillPassword(String arg0)  {
        loginPo.fillPassword(arg0);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPo.clickLoginButton();
    }
}
