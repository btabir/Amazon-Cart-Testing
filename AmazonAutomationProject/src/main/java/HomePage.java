import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    SearchBox searchBox ;
    private final By cartCountLocator = By.id("nav-cart-count");
    private final By cartLocator = By.id("nav-cart-count-container");
    
    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public void goToCart() {
        click(cartLocator);
    }

    public boolean isProductCountUp() {
        return getCartCount()>0;
    }



    private int getCartCount(){
        String counter = find(cartCountLocator).getText();
        return Integer.parseInt(counter);
    }
}
