import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.LibraryPage;
import pages.MainPage;

public class LibraryNATest extends WebDriverSettings{
    public MainPage mainPage;
    public LibraryPage libraryPage;

    @Before
    public void initPages(){
        this.mainPage = PageFactory.initElements(driver, MainPage.class);
        this.libraryPage = PageFactory.initElements(driver, LibraryPage.class);
    }

    @Test
    public void getLibraryNaTest(){
        loginPage.loginPage(login, password);
        mainPage.LibraryNAClick();
        libraryPage.checkGetLibraryNa();
    }

    @Test
    public void createDocumentTest() throws InterruptedException {
        loginPage.loginPage(login, password);
        mainPage.LibraryNAClick();
        libraryPage.checkGetLibraryNa();
        libraryPage.clickAddCategory();
        libraryPage.enterName();

        libraryPage.clickAddCategory();
        libraryPage.checkCreateDocument();
    }

    @Test public void deleteCategoryTest(){
        loginPage.loginPage(login, password);
        mainPage.LibraryNAClick();
        libraryPage.deleteCategory();
    }
}
