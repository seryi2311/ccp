import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.LibraryPage;
import pages.MainPage;

public class GeneralInformationLibraryTest extends WebDriverSettings{
    public MainPage mainPage;
    public LibraryPage libraryPage;

    @Before
    public void initPage(){
        this.mainPage = PageFactory.initElements(driver, MainPage.class);
        this.libraryPage = PageFactory.initElements(driver, LibraryPage.class);
    }

    @Test
    public void getLibraryNaTest(){
        loginPage.loginPage(login, password);
        mainPage.generalInformationLibraryClick();
        driver.findElement(By.xpath("//span[contains(text(), 'Библиотека ОИ')]"));
    }

    @Test
    public void createDocumentTest(){
        loginPage.loginPage(login, password);
        mainPage.generalInformationLibraryClick();
        driver.findElement(By.xpath("//span[contains(text(),'Акты')]"));
        libraryPage.clickAddCategory();
        libraryPage.enterName();
        WebElement button = driver.findElement(By.xpath("//button[contains(text(), 'Добавить категорию')]"));
        button.click();
        driver.findElement(By.xpath("//span[text() ='"+ libraryPage.title + "']"));
    }

    @Test public void deleteCategoryTest(){
        loginPage.loginPage(login, password);
        mainPage.generalInformationLibraryClick();
        libraryPage.deleteCategory();
    }



}
