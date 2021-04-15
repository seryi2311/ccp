import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;
import pages.ReportPage;

public class ReportTest extends WebDriverSettings{
    public MainPage mainPage;
    public ReportPage reportPage;

    @Before
    public void initPages(){
        this.mainPage = PageFactory.initElements(driver, MainPage.class);
        this.reportPage = PageFactory.initElements(driver,ReportPage.class);
    }

    @Test
    public void getPageReportTest(){
        loginPage.loginPage(login, password);
        mainPage.reportLinkClick();
        reportPage.checkGetReportTests();
    }

    @Test
    public void searchByFlightTest(){
        loginPage.loginPage(login, password);
        mainPage.reportLinkClick();
        reportPage.checkGetReportTests();
        reportPage.buttonSearchByFlightClick();
        reportPage.checkGetReportTests();
        reportPage.enterNumberFlightInInputField();
        reportPage.searchButtonClick();
        reportPage.checkSearchByFlight();
    }
}
