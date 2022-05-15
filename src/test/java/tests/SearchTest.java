package tests;

import org.junit.Test;

import pages.SearchPage;
import pages.SearchResultsPage;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;


public class SearchTest extends BaseTest {
    @Test
    public void userCanSearch() {

        new SearchPage().searchFor("MacBook Pro 15");

        SearchResultsPage results = new SearchResultsPage();
        results.getResults().shouldHave(sizeGreaterThan(1));
        results.getFirstResult().shouldHave(text("Macbook Pro 15.4"));
    }
}
