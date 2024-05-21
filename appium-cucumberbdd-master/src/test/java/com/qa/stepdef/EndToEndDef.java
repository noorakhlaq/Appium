package com.qa.stepdef;

import com.qa.pages.BasePage;
import com.qa.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class EndToEndDef extends BasePage {
    @Given("user unlock device")
    public void user_unlock_device() throws MalformedURLException, InterruptedException {
        Thread.sleep(3000);
        unlock();
        Thread.sleep(3000);

    }

    @When("I enter username as {string}")
    public void iEnterUsernameAs(String username) throws InterruptedException {
        new LoginPage().enterUserName(username);
    }

    @When("I enter password as {string}")
    public void iEnterPasswordAs(String password) {
        new LoginPage().enterPassword(password);
    }

    @When("I login")
    public void iLogin() {
        new LoginPage().pressLoginBtn();
    }


    @Then("add the product to the cart")
    public void add_the_product_to_the_cart() throws InterruptedException {
        Thread.sleep(10000);
//        scroll();
        clickOnAddToCart();
        Thread.sleep(3000);

    }

    @When("I click on cart button")
    public void i_click_on_cart_button() {
        clickOnCart();
    }

    @When("user click on Checkout")
    public void user_click_on_checkout() throws InterruptedException {
        Thread.sleep(3000);
        clickOnCheckOut();
    }

    @When("user enter address {string}, {string} and {string}")
    public void user_enter_address_and(String string, String string2, String string3) throws InterruptedException {
        enterAddress(string, string2, string3);
        Thread.sleep(3000);
        continues();
        Thread.sleep(3000);

    }

    @When("click on finish button")
    public void click_on_finish_button() throws InterruptedException {

        finish();
        Thread.sleep(3000);
    }

    @When("Lock the device")
    public void lock_the_device() throws MalformedURLException, InterruptedException {
        Thread.sleep(3000);
        lock();

    }

}
