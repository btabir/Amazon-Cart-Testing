import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CardPage extends BasePage{
    private final By productInCartLocator = By.className("a-truncate-cut");
    public CardPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfProductAdded() {
        return productListInCart().size() > 0 ;
    }

    private List<WebElement> productListInCart(){
        return findAll(productInCartLocator);
    }
}
