package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeSearchPage {
    private WebDriver driver;
    By zipSearchBox = By.name("postcode");
    By searchButton = By.className("Form_c-search-btn_1EEhL");

    public HomeSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchUsingZip(String zipCode) {
        driver.findElement(zipSearchBox).sendKeys(zipCode);
        driver.findElement(searchButton).click();
    }
}
