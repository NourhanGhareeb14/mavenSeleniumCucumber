package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FilterByColor {
    @Given("user go to category then select subcategory")
    public void user_go_to_category_then_select_subcategory() throws InterruptedException {
        Hooks.driver.findElement(By.xpath("//*[text()='Apparel ']")).click();
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/apparel");
        Thread.sleep(2000);
        Hooks.driver.findElement(By.xpath("//*[text()=' Shoes ']")).click();
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/shoes");    }

    @And("user select color")
    public void user_select_color() throws InterruptedException {
        Thread.sleep(2000);
        Hooks.driver.findElement(By.id("attribute-option-15")).click();
        Thread.sleep(2000);
    }
    @Then("user get products with the selecetd color")
    public void user_get_products_with_the_selecetd_color()  {

        String expecetedResult = "adidas Consortium Campus 80s Running Shoes";
        String actualResult =Hooks.driver.findElement(By.xpath("//*[text()='adidas Consortium Campus 80s Running Shoes']")).getText();
        Assert.assertEquals(actualResult.contains(expecetedResult),true);
    }

}
