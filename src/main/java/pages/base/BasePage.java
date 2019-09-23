package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class BasePage {

    protected WebDriver driver;
    protected Random rand;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        rand = new Random();
        PageFactory.initElements(driver, this);
    }
}
