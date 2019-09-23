package base;

import configuration.Configuration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import providers.DriverProvider;

import java.io.IOException;

public class TestBase {

    protected WebDriver driver;
    protected Configuration configuration;

    @BeforeMethod
    public void setUpBeforeEach() throws IOException {
        configuration = new Configuration();
        driver = new DriverProvider().getDriver(configuration.getBrowser());
        driver.get(configuration.getLink());
    }

    @AfterMethod
    public void tearDownAfterEach() {
        driver.quit();
    }
}
