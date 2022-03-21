package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class ResetPassword {
    @Given("user go to login and press into forget password")
    public void user_GoTologinAndPressResetPassword()  {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

        Hooks.driver.findElement(By.className("forgot-password")).click();

    }
    @When("user add email address  and click recover")
    public void UserAddEmailAndRecover() throws InterruptedException {
        Hooks.driver.findElement(By.className("email")).sendKeys("n.ghareeb@qpix.io");
        //buttons
        Hooks.driver.findElement(By.className("buttons")).click();
        Thread.sleep(3000);


    }

    @Then("user get alert of mail sent to your mail")
    public void user_getAlert() throws InterruptedException {

        String expecetedResult = "Email with instructions has been sent to you.";
        String actualResult =Hooks.driver.findElement(By.className("content")).getText();
        Assert.assertEquals(actualResult.contains(expecetedResult),true);
    }
}
