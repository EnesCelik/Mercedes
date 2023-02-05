import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class LoginPage extends basePage{

    By inEmailLoginPage = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    By inPasswordLoginPage = By.xpath("//div[contains(text(),'Hoş geldiniz')]");
    By loginButtonLocator = By.xpath("//span[contains(text(),'Giriş Yap')]");
    By logTextLocator = By.xpath("//a[@id='login']");
    By EmailTextLocator = By.id("txtUserName");
    By EmailButtonLocator = By.id("btnLogin");
    By passwordTextLocator = By.id("txtPassword");
    By passwordButtonLocator = By.id("btnEmailSelect");

    public LoginPage(WebDriver driver) {
        super(driver);
    }



    Actions action = new Actions(driver);

    public void locator() {
         waitLogin();
         click(loginButtonLocator);

         waitLogin();
         click(logTextLocator);
    }

    public void eMail() {
        waitLogin();
        type(EmailTextLocator, "enescelik0318@gmail.com");

        waitLogin();
        click(EmailButtonLocator);
        waitLogin();
    }

    public void password() {

        type(passwordTextLocator, "172839Abc");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        click(passwordButtonLocator);
    }



}
