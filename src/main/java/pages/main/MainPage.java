package pages.main;

import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MainPage extends BasePage {

    private TopMenuPage topMenuPage;

    public MainPage(WebDriver driver) {
        super(driver);
        topMenuPage = new TopMenuPage(driver);
    }

    public TopMenuPage getTopMenu() {
        return topMenuPage;
    }
}
