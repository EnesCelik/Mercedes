import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.List;


public class ProductPage extends basePage{

    By shippignLocator = By.xpath("//div[contains(text(),'Kategori')]");

 // //body/div[3]/main[1]/div[2]/div[1]/div[6]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/a[1]/div[2]/button[1]/div[1]
 // //body/div[3]/main[1]/div[2]/div[1]/div[6]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/a[1]/div[2]/button[1]
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    //  WebElement loginButtonLocator =  driver.findElement(By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[6]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/a[1]/div[2]/button[1]/div[1]"));
    //  action.moveToElement(loginButtonLocator).perform();

    public boolean isOnProductPage() {
        return isDisplayed(shippignLocator);
    }



}
