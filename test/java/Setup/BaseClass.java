package Setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
    private WebDriver driver;
    By zipSearchBox = By.name("postcode");
    By searchButton = By.className("Form_c-search-btn_1EEhL");
    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
    }
    @AfterClass
    public void TearDown() {
        driver.quit();
    }

    /*@Test
    public void searchforRestaurant() {
        driver.findElement(zipSearchBox).sendKeys("AR511AA");
        driver.findElement(searchButton).click();
    }*/

}
