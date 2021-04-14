package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LibraryPage {

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
}
