import org.junit.Test;

public class LoginTest extends WebDriverSettings {


    @Test
    public void incorrectLoginTest(){

        loginPage.loginPage(login, password + "1");
        loginPage.checkIncorrectLogin();
    }

    @Test
    public void correctLoginTest(){
        loginPage.loginPage(login, password);
        loginPage.checkCorrectLogin();
    }
}
