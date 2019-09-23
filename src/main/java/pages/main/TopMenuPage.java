package pages.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import pages.topMenu.ContactUsPage;

public class TopMenuPage extends BasePage {

    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "contact-link")
    private WebElement buttonContactUs;

    public ContactUsPage openContactUs() {
        buttonContactUs.click();
        return new ContactUsPage(driver);
    }
}
