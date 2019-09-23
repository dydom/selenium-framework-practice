package contuctUsTests;

import base.TestBase;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.main.MainPage;

import java.io.File;

public class FormSendSuccessTest extends TestBase {

    private MainPage mainPage;
    private Faker faker;

    @BeforeMethod
    public void setUp() {
        mainPage = new MainPage(driver);
        faker = new Faker();
    }

    @Test
    public void formSendMandatoryFields() {
        String successMessage = mainPage.getTopMenu()
                .openContactUs()
                .fillSubject()
                .fillEmail(faker.internet().emailAddress())
                .fillMessage(faker.lorem().fixedString(100))
                .sendForm()
                .getSuccessMessage();

        Assert.assertEquals(successMessage, "Your message has been successfully sent to our team.");
    }

    @Test
    public void formSendAllFields() {
        String successMessage = mainPage.getTopMenu()
                .openContactUs()
                .fillSubject()
                .fillEmail(faker.internet().emailAddress())
                .fillMessage(faker.lorem().fixedString(100))
                .fillOrder(faker.lorem().characters(20))
                .fillAttachment(new File("src/test/resources/sample.txt").getAbsolutePath())
                .sendForm()
                .getSuccessMessage();

        Assert.assertEquals(successMessage, "Your message has been successfully sent to our team.");
    }
}
