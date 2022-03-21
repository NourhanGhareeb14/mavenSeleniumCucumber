package stepDefinitions;

import Pages.ResetPasswordPage;
import Pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class ResetPassword {
     ResetPasswordPage resetPasswordPage;
      @Given("user go to login and press into forget password")
    public void user_GoTologinAndPressResetPassword() throws InterruptedException {
           resetPasswordPage=new ResetPasswordPage(Hooks.driver);
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

      //  Hooks.driver.findElement(By.className("forgot-password")).click();
          resetPasswordPage.click_forget();

    }
    @When("user add email address  and click recover")
    public void UserAddEmailAndRecover()
    {
        resetPasswordPage=new ResetPasswordPage(Hooks.driver);
            resetPasswordPage.enter_email("n.ghareeb@qpix.io");
        //Hooks.driver.findElement(By.className("email")).sendKeys("n.ghareeb@qpix.io");

       // Hooks.driver.findElement(By.name("send-email")).click();
        resetPasswordPage.click_recover();
    }

    @Then("user get alert of mail sent to your mail")
    public void user_getAlert() throws InterruptedException {

        String expecetedResult = "Email with instructions has been sent to you.";
        Thread.sleep(3000);
        String actualResult =Hooks.driver.findElement(By.className("content")).getText();
        System.out.println(actualResult);
         Assert.assertEquals(actualResult.contains(expecetedResult),true);



    }
}
