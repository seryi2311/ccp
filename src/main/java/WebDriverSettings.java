import org.junit.After;
import org.junit.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;


public class WebDriverSettings {
    public WebDriver driver;
    public String login;
    public String password;
    public LoginPage loginPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        this.login = SettingClass.login;
        this.password = SettingClass.password;
        this.loginPage = PageFactory.initElements(driver, LoginPage.class);
    }


}
