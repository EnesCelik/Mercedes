import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Assertions;


public class caseOne extends baseTest {

    HomePage homePage ;
    ProductPage productsPage ;
    ProductDetailPage productDetailPage ;
    LoginPage loginPage;

    @Test
    @Order(0)
    public void login(){
        loginPage = new LoginPage(driver);
        loginPage.locator();
        loginPage.eMail();
        loginPage.password();
    }

    @Test
    @Order(2)
    public void searchLaptop(){
          homePage = new HomePage(driver);
          productsPage = new ProductPage(driver);
        homePage.searchBox().search("Laptop");
        Assertions.assertTrue(productsPage.isOnProductPage(),
                "Not on products page!");
    }

    @Test
    @Order(3)
    public void addProducts(){
        productDetailPage = new ProductDetailPage(driver);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
                "Not on product detail page!");
    }

    @Test
    @Order(4)
    public void cartPage(){
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCountUp(),
                "Product count did not increase!");
    }

}
