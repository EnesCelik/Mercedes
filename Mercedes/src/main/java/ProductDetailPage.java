import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends basePage {


    By finishShopping = By.xpath("//div[contains(text(),'Kategori')]");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(finishShopping);
    }

    public void addToCart() {
    }
}
