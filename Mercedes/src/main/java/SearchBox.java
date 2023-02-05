import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends basePage{


    By searchBoxLocator= By.xpath("//body/div[@id='container']/div[1]/div[1]/div[4]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");
    By submitButtonLocator = By.xpath("//div[contains(text(),'ARA')]");
    public SearchBox(WebDriver driver) {
        super(driver);
    }



    public void search(String text) {
        type(searchBoxLocator, text);
        click(submitButtonLocator);
    }
}
