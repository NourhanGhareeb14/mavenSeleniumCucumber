package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ChangCategoryLocatorPage {

    WebDriver driver;
    public ChangCategoryLocatorPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    By category1=By.xpath("//*[text()='Digital downloads ']");
    By category2=By.xpath("//*[text()='Jewelry ']");
    public void click_category(){
        driver.findElement(category1).click();
    }
    public void click_category2(){
        driver.findElement(category2).click();
    }
}
