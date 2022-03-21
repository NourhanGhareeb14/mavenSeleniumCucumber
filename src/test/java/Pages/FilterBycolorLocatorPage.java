package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FilterBycolorLocatorPage {

    WebDriver driver;
    public FilterBycolorLocatorPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    By btn_Category=By.xpath("//*[text()='Apparel ']");
    By btn_subCategory=By.xpath("//*[text()=' Shoes ']");
    By btn_Color=By.id("attribute-option-15");


    public void click_category(){
        driver.findElement(btn_Category).click();
    }
    public void click_sub_category(){
        driver.findElement(btn_subCategory).click();
    }
    public void click_color(){
        driver.findElement(btn_Color).click();
    }
}
