import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import java.util.Stack;

public class HomePage extends basePage {

    SearchBox searchBox;
    By cartCountLocator = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/section[1]/section[1]/div[3]/ul[1]/li[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]");
    By homePageLocator = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/svg[1]/path[1]");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() {
      return getCartCount() > 1;
    }

    public void goToCart() {
        click(homePageLocator);
    }

    private int getCartCount(){

        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }
}
