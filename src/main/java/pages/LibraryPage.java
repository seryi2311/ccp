package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LibraryPage {

    private final WebDriver driver;

    public LibraryPage (WebDriver driver){
        this.driver = driver;
    }

    public String title = "auto UI test";

    @FindBy(xpath = "//button[contains(text(), 'Добавить категорию')]")
    private WebElement addCategory;

    @FindBy(xpath = "//input[@type = 'text']")
    private WebElement inputEnterName;

    @FindBy(xpath = "//td[text() = 'Удалить']")
    private WebElement deleteCategoryButton;

    public void clickAddCategory(){
        addCategory.click();
    }

    public void enterName(){
        inputEnterName.sendKeys(title);
    }

    public void deleteCategory(){
        deleteCategoryButton.click();
    }

    public void checkGetLibraryNa(){
        driver.findElement(By.xpath("//h1[contains(text(), 'Библиотека НА')]"));
        driver.findElement(By.xpath("//span[contains(text(), ' Редактировать ')]"));
    }

    public void checkGetGeneralInformationLibrary(){
        driver.findElement(By.xpath("//span[contains(text(),'Акты')]"));
    }

    public void checkGetFormsForPrinting(){
        driver.findElement(By.xpath("//h1[contains(text(), 'Бланки для печати')]"));
        driver.findElement(By.xpath("//span[contains(text(), ' Редактировать ')]"));
    }


    public void checkCreateDocument(){
        driver.findElement(By.xpath("//span[text() ='"+ this.title + "']"));
    }


}
