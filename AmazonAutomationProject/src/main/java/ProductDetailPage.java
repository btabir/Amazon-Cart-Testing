import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{
    private final By addToCartButton = By.id("add-to-cart-button");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage(){
        return isDisplayed(addToCartButton);
    }

    public void addToCart() {
        click(addToCartButton);
    }
}
