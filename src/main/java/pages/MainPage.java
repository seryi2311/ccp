package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage{

    @FindBy(xpath = "//span[contains(text(),'Библиотека НА')]")
    private WebElement libraryNALink;

    @FindBy(xpath = "//span[contains(text(),'Библиотека ОИ')]")
    private WebElement generalInformationLibraryLink;

    @FindBy(xpath = "//span[contains(text(), 'Бланки для печати')]")
    private WebElement formsForPrintingLink;

    @FindBy(xpath = "//span[contains(text(),'Отчеты')]")
    private WebElement reportLink;

    public void LibraryNAClick(){
        libraryNALink.click();
    }

    public void generalInformationLibraryClick(){
        generalInformationLibraryLink.click();
    }

    public void formsForPrintingClick(){
        formsForPrintingLink.click();
    }

    public void reportLinkClick(){
        reportLink.click();
    }
}
