import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage{
    private final By siralaLocator = By.className("a-dropdown-label");
    private final By selectObject = By.className("a-size-medium");
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage(){
        return isDisplayed(siralaLocator);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return findAll(selectObject);
    }
}
