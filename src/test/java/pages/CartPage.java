package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    public SelenideElement howManyItemsInTheCart(){
        return $(".row-title-note") ;
    }

    public SelenideElement whatItemIsInTheCart(){
        return $(".item-info .item-title") ;
    }
}
