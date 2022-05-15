package pages;

import java.lang.constant.Constable;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    public String rememberAccurateProductName(){
       return $(".product-title").getText();
    }
    public void clickAddToCart() {
        $(byText("Add to cart")).click();
    }
    public void clickDontAddProtection() {
        $(byText("No, thanks")).click();
    }
    public void clickViewCart() {
        $(byText("View Cart")).click();
    }
}
