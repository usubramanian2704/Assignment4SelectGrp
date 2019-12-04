package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class steps {
    private WebDriver driver;
    By zipSearchBox = By.name("postcode");
    By searchButton = By.className("Form_c-search-btn_1EEhL");

    @Given("^I am on the launch page of the application$")
    public void iAmOnTheLaunchPageOfTheApplication() {
        driver.get("https://www.just-eat.co.uk");
        System.out.println("Launching the browser");
    }

    @When("^I enter the zipcode and search$")
    public void iEnterTheZipcode() {
        driver.findElement(zipSearchBox).sendKeys("AR511AA");
        driver.findElement(searchButton).click();

    }

    @Then("^A new page should open with restaurant details$")
    public void aNewPageShouldOpenWithRestaurantDetails() {
        assertTrue(driver.getTitle().contains("Restaurants and takeaways in Area51, AR51 | Just Eat"),"This is not the right page");
    }

    @When("^I enter the name of the city and search$")
    public void iEnterTheNameOfTheCity() {
        driver.findElement(zipSearchBox).sendKeys("London");
        driver.findElement(searchButton).click();
    }
    @Then("^An error message should display below the postal code box$")
    public void anErrorMessageShouldDisplayBelowThePostalCodeBox() {
        String errorMessage = driver.findElement(By.className("Form_c-search-error_2nadt")).getText();
        assertTrue(errorMessage.contains("Please enter a full, valid postcode"), "This works only for postal code");

    }
    @And("^I select Pizza from the top Menu$")
    public void iSelectPizzaFromTheTopMenu() {
        driver.findElement(By.id("pizza-desktop-tile")).click();

    }
    @Then("^I should see '83' restaurants in the result of the search$")
    public void iShouldSeeRestaurantsInTheResultOfTheSearch() {
        /* Verify if 83 restaurants are displayed with the element locators */
    }
}
