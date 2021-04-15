package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportPage {
    private final WebDriver driver;

    public ReportPage (WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//button[text() = 'Поиск по реисам']")
    WebElement buttonSearchByFlight;

    @FindBy(xpath = "//div[contains(@class, 'ng-select-container')]//input")
    WebElement inputField;

    @FindBy(xpath = "//span[text() = 'Поиск']")
    WebElement searchButton;

    @FindBy(xpath = "//a[contains(text(), 'S7 5223')]")
    WebElement reportOnFlightLink;

    public void buttonSearchByFlightClick(){
        buttonSearchByFlight.click();
    }

    public void enterNumberFlightInInputField(){
        inputField.sendKeys("5223");
        inputField.sendKeys(Keys.ENTER);
    }

    public void searchButtonClick(){
        searchButton.click();
    }

    public void checkGetReportTests(){
        driver.findElement(By.xpath("//*[text() = 'Cargo']"));
    }

    public void checkSearchByFlight(){
        reportOnFlightLink.isDisplayed();
    }
}
