package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPage {

    WebDriver driver;
    public SearchProductPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    By btn_searchfiled=By.id("small-searchterms");
    By txt_productname=By.id("small-searchterms");

    By btn_Search=By.cssSelector("button[class=\"button-1 search-box-button\"]");


    public void click_search(){
        driver.findElement(btn_searchfiled).click();
    }
    public void enter_productname(String product){
        driver.findElement(txt_productname).sendKeys(product);
    }
    public void clickOnsearch(){
        driver.findElement(btn_Search).click();
    }

}
