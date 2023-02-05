import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class basePage {

    WebDriver driver;

    public basePage(WebDriver driver){
        this.driver = driver ;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }

    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    public void click(By locator){
        find(locator).click();
    }

    public void waitLogin(){
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    public void type(By locator , String text){
        find(locator).sendKeys(text);
    }

}
