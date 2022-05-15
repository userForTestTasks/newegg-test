package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {

    public ElementsCollection getResults() {
        return $$(".list-wrap .item-cell");
    }
    public SelenideElement getFirstResult() {
        return $(".list-wrap .item-title") ;
    }
    public SelenideElement getResultByText(String text){
        return $(byXpath("//a[@class='item-title' and contains(text(), '"+text+"')]"));
    }
}
