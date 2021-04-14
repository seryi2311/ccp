import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

public class LoginTest extends WebDriverSettings {


    @Test
    public void incorrectLoginTest(){

        loginPage.loginPage(login, password + "1");
        driver.findElement(By.xpath("//span[contains(text(),'Ошибка аутентификации')]"));
    }

    @Test
    public void correctLoginTest(){
        loginPage.loginPage(login, password);
        driver.findElement(By.xpath("//h2[text() = 'Информация']"));
    }
}
