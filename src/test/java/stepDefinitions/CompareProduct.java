package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareProduct {
    @Given("user go to product and add it to compare list")
    public void user_go_to_product_and_user_add_it_to_comparelist() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/apple-macbook-pro-13-inch ");
        Hooks.driver.findElement(By.xpath("//*[text()='Add to compare list']")).click();
    }

    @And("user select another product and add it to compare list")
    public void user_anotherproducttocomparelist() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/lenovo-thinkpad-x1-carbon-laptop");
        Hooks.driver.findElement(By.xpath("//*[text()='Add to compare list']")).click();
        Thread.sleep(2000);


    }
    @Then("open compare list and check the added product")
    public void user_get_products_added_to_comparelist() throws InterruptedException {

        Hooks.driver.findElement(By.xpath("//*[text()='Compare products list']")).click();
        Thread.sleep(2000);
        //  Assert.assertEquals(driver.getCurrentUrl(),"https://garnell-fe.vercel.app/");
        String expecetedResult ="Lenovo Thinkpad X1 Carbon Laptop";
        String actualResult =Hooks.driver.findElement(By.className("product-name")).getText();
        Assert.assertEquals(actualResult.contains(expecetedResult),true);

    }
}
