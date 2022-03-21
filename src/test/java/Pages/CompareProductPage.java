package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CompareProductPage {

    WebDriver driver;
    public CompareProductPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    By btn_AddtoCompare=By.xpath("//*[text()='Add to compare list']");

    public void click_addtocompare(){
        driver.findElement(btn_AddtoCompare).click();
    }
}
