import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.LibraryPage;
import pages.MainPage;

public class FormsForPrintingTest extends WebDriverSettings{

    public MainPage mainPage;
    public LibraryPage libraryPage;

    @Before
    public void initPages(){
        this.mainPage = PageFactory.initElements(driver, MainPage.class);
        this.libraryPage = PageFactory.initElements(driver, LibraryPage.class);
    }

    @Test
    public void getFormsForPrintingTest(){
        loginPage.loginPage(login, password);
        mainPage.formsForPrintingClick();
        libraryPage.checkGetFormsForPrinting();
    }

    @Test
    public void createDocument() throws InterruptedException {
        loginPage.loginPage(login, password);
        mainPage.formsForPrintingClick();
        libraryPage.checkGetFormsForPrinting();
        libraryPage.clickAddCategory();
        libraryPage.enterName();
        libraryPage.clickAddCategory();
        libraryPage.checkCreateDocument();
    }

    @Test
    public void deleteCategoryTest(){
        loginPage.loginPage(login, password);
        mainPage.generalInformationLibraryClick();
        libraryPage.deleteCategory();
    }
}
