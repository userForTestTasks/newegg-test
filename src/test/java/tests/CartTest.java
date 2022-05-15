package tests;

import org.junit.Test;
import pages.CartPage;
import pages.ProductPage;
import pages.SearchPage;
import pages.SearchResultsPage;

import static com.codeborne.selenide.Condition.text;

public class CartTest extends BaseTest {
    @Test
    public void userCanAddToCart() {

        SearchPage searchPage = new SearchPage();
        searchPage.closeCookieBanner();
        searchPage.searchFor("Iphone 13");

        SearchResultsPage results = new SearchResultsPage();
        results.getResultByText("13 Pro Max").click();

        ProductPage product = new ProductPage();
        String accurateName = product.rememberAccurateProductName();
        product.clickAddToCart();
        product.clickDontAddProtection();
        product.clickViewCart();

        CartPage cartPage = new CartPage();
        cartPage.howManyItemsInTheCart().shouldHave(text("1 Item"));
        cartPage.whatItemIsInTheCart().shouldHave(text(accurateName));
    }
}
