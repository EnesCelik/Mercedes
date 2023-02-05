import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class caseTwo extends baseTest{

    LoginPage loginPage;
    UserPage userPage;
    BirthDayPage birthDayPage;

    @Test
    @Order(1)
    public void login(){

        loginPage = new LoginPage(driver);
        loginPage.locator();
        loginPage.eMail();
        loginPage.password();
    }

    @Test
    @Order(2)
    public void userInfo(){


        userPage = new UserPage(driver);


// //body/div[@id='container']/div[1]/div[1]/div[4]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/ul[1]/li[5]/a[1]
    }

    @Test
    @Order(3)
    public void changeBirthday(){

        birthDayPage = new BirthDayPage(driver);
// //input[@id='txtBirthDay']
    }




}
