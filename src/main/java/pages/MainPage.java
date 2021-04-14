package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage{

    @FindBy(xpath = "//span[contains(text(),'Библиотека НА')]")
    private WebElement libraryNA;

    @FindBy(xpath = "//span[contains(text(),'Библиотека ОИ')]")
    private WebElement generalInformationLibrary;

    public void LibraryNAClick(){
        libraryNA.click();
    }

    public void generalInformationLibraryClick(){
        generalInformationLibrary.click();
    }
}
