package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Register {
    @Given("user go to register screen")
    public void user_go_to_register_screen () throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
     }

    @When("user add all required data")
    public void user_add_all_required_data() throws InterruptedException {
        Hooks.driver.findElement(By.id("gender-female")).click();
        Hooks.driver.findElement(By.id("FirstName")).sendKeys("Nourhan");
        Hooks.driver.findElement(By.id("LastName")).sendKeys("Ghareeb");
        Hooks.driver.findElement(By.id("Email")).sendKeys("n.gharee999b@qpix.io");
        Hooks.driver.findElement(By.id("Password")).sendKeys("12345678");
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys("12345678");
        Hooks.driver.findElement(By.id("register-button")).click();
        Thread.sleep(3000);
     }
    @Then("user create new account")
    public void user_create_new_account() throws InterruptedException {

         String expecetedResult ="Your registration completed";
        String actualResult =Hooks.driver.findElement(By.className("result")).getText();

        Assert.assertEquals(actualResult.contains(expecetedResult),true);


    }



}
