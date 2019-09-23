package pages.topMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.base.BasePage;

public class ContactUsPage extends BasePage {

    public ContactUsPage (WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "submitMessage")
    private WebElement buttonSend;

    @FindBy(css = ".alert-danger")
    private WebElement alertMessage;

    @FindBy(css = ".alert-success")
    private WebElement successMessage;

    @FindBy(id = "message")
    private WebElement fieldMessage;

    @FindBy(id = "email")
    private WebElement fieldEmail;

    @FindBy(id = "id_contact")
    private WebElement fieldSubject;

    @FindBy(id = "id_order")
    private WebElement fieldOrder;

    @FindBy(id = "fileUpload")
    private WebElement fieldAttachment;

    public ContactUsPage sendForm() {
        buttonSend.click();
        return this;
    }

    public String getAlertMessage() {
        return alertMessage.getText();
    }

    public String getSuccessMessage() {
        return  successMessage.getText();
    }

    public ContactUsPage fillEmail(String email) {
        fieldEmail.sendKeys(email);
        return this;
    }

    public ContactUsPage fillMessage (String message) {
        fieldMessage.sendKeys(message);
        return this;
    }

    public ContactUsPage fillOrder (String order) {
        fieldOrder.sendKeys(order);
        return this;
    }

    public ContactUsPage fillSubject() {
        Select select = new Select(fieldSubject);
        select.selectByIndex(rand.nextInt(select.getOptions().size()-1)+1);
        return this;
    }

    public ContactUsPage fillAttachment(String path) {
        fieldAttachment.sendKeys(path);
        return this;
    }
}
