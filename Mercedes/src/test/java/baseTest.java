import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class baseTest {

    WebDriver driver;

@BeforeAll
    public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();

  //  HtmlUnitDriver driver = new HtmlUnitDriver();
  //  driver.setJavascriptEnabled(true);

    driver.get("https://www.hepsiburada.com/");
    driver.manage().window().maximize();


       }

       @AfterAll
        public void tearDown(){
        driver.quit();
       }
}
