package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage (WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='IDToken1']")
    private WebElement loginField;

    @FindBy(xpath = "//input[@id='IDToken2']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@name='Login.Submit']")
    private WebElement signInButton;



    public void enterLogin(String login){
        loginField.sendKeys(login);
    }

    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }

    public void pressSignUpButton(){
        signInButton.click();
    }


    public void loginPage (String login, String password){
        driver.get("https://sso.s7.aero/OpenAM/UI/Login?goto=https%3A%2F%2Fsso.ccp-test.s7.aero%2Fsite%2Fdo-login&realm=S7&gx_charset=UTF-8");
        enterLogin(login);
        enterPassword(password);
        pressSignUpButton();
    }

    public void checkIncorrectLogin(){
        driver.findElement(By.xpath("//span[contains(text(),'Ошибка аутентификации')]"));
    }

    public void checkCorrectLogin(){
        driver.findElement(By.xpath("//h2[text() = 'Информация']"));
    }
}
