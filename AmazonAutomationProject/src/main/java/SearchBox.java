import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{
    private final By searchBox = By.id("twotabsearchtextbox");
    private final By searchButton = By.id("nav-search-submit-button");
    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text){
        type(searchBox,text);
        click(searchButton);
    }
}
