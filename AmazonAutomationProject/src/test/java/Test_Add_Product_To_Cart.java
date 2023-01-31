import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Add_Product_To_Cart extends BaseTest{

    HomePage homePage;
    ProductPage productPage;
    ProductDetailPage productDetailPage;
    CardPage cardPage;
    @Order(1)
    @Test
    public void SearchProduct(){
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
    homePage.searchBox().search("Laptop");
    Assertions.assertTrue(productPage.isOnProductPage(),
                "Not on product page!");
    }
    @Order(2)
    @Test
    public void SelectProduct(){
        productPage = new ProductPage(driver);
        productDetailPage = new ProductDetailPage(driver);
    productPage.selectProduct(1);
    Assertions.assertTrue(productDetailPage.isOnProductPage(),
            "Not on product detail page");
    }
    @Order(3)
    @Test
    public void AddProductToCart(){
    productDetailPage.addToCart();
    Assertions.assertTrue(homePage.isProductCountUp(),
            "Product not added to cart at right top!");
    }
    @Order(4)
    @Test
    public void GoToChart(){
        cardPage = new CardPage(driver);
    homePage.goToCart();
    Assertions.assertTrue(cardPage.checkIfProductAdded(),
            "Product not added to cart!");
    }
}
