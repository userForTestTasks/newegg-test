package pages;

import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    public void searchFor(String text) {
        $(byTitle("Search Site")).val(text).pressEnter();
    }
    public void closeCookieBanner(){
        $(byXpath(("//button[@aria-label='Close']"))).click();
    }
}
