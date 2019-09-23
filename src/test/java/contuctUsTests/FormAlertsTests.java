package contuctUsTests;

import base.TestBase;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.main.MainPage;

public class FormAlertsTests extends TestBase {

    private MainPage mainPage;
    private Faker faker;

    @BeforeMethod
    public void setUp() {
        mainPage = new MainPage(driver);
        faker = new Faker();
    }

    @Test
    public void emailAddressAlert() {
        String alertMessage = mainPage.getTopMenu()
                .openContactUs()
                .sendForm()
                .getAlertMessage();

        Assert.assertEquals(alertMessage, "There is 1 error\n" + "Invalid email address.");
    }

    @Test
    public void messageAlert() {
        String alertMessage = mainPage.getTopMenu()
                .openContactUs()
                .fillEmail(faker.internet().emailAddress())
                .sendForm()
                .getAlertMessage();

        Assert.assertEquals(alertMessage, "There is 1 error\n" + "The message cannot be blank.");
    }

    @Test
    public void subjectAlert() {
        String alertMessage = mainPage.getTopMenu()
                .openContactUs()
                .fillEmail(faker.internet().emailAddress())
                .fillMessage(faker.lorem().fixedString(100))
                .sendForm()
                .getAlertMessage();

        Assert.assertEquals(alertMessage, "There is 1 error\n" + "Please select a subject from the list provided.");
    }
}
