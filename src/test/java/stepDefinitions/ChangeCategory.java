package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ChangeCategory {
    @Given("user go to category and assert on url")
    public void user_go_to_category() throws InterruptedException {
        Hooks.driver.findElement(By.xpath("//*[text()='Digital downloads ']")).click();
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/digital-downloads");
        Thread.sleep(2000);
    }

    @And("user select another category")
    public void user_select_nother_category() throws InterruptedException {
        Hooks.driver.findElement(By.xpath("//*[text()='Jewelry ']")).click();


    }
    @Then("assert category changed")
    public void assert_category_changed() throws InterruptedException {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/jewelry");
            }
}
