import org.junit.Before;
import org.junit.Test;
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
    public void getGeneralInformationLibraryTest(){
        loginPage.loginPage(login, password);
        mainPage.generalInformationLibraryClick();
        libraryPage.checkGetGeneralInformationLibrary();
    }

    @Test
    public void createDocumentTest(){
        loginPage.loginPage(login, password);
        mainPage.generalInformationLibraryClick();
        libraryPage.checkGetGeneralInformationLibrary();
        libraryPage.clickAddCategory();
        libraryPage.enterName();
        libraryPage.clickAddCategory();
        libraryPage.checkCreateDocument();
    }

    @Test public void deleteCategoryTest(){
        loginPage.loginPage(login, password);
        mainPage.generalInformationLibraryClick();
        libraryPage.deleteCategory();
    }



}
