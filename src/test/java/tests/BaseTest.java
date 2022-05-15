package tests;

import com.codeborne.selenide.Configuration;
import org.junit.Before;


import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @Before
    public void setUp() {
        open("https://www.newegg.com");
        Configuration.browserSize = "1920x1080";
    }
}
