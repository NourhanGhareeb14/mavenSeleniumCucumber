package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.Assert;

import java.util.ArrayList;

public class search {


    @When("user clicks on search field")
    public void user_clicks_on_search_field()
    {
        // locate search field and click on it
        Hooks.driver.findElement(By.id("small-searchterms")).click();
    }

    @And("user search with name of product")
    public void user_search_with_name_of_product()
    {
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("book");
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]")).click();

    }

    @Then("user could find relative results")
    public void user_could_find_relative_results()
    {
        int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();  // 0
        System.out.println(count);
        Assert.assertTrue(count > 0);

        // findelements     [webelement0, webelement1]
        for (int x = 0; x < count ; x++) {
            System.out.println(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText());
            Assert.assertTrue(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText().toLowerCase().contains("book"));
        }
    }
}
