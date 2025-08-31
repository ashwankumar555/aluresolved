package AllureReports.allure.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyCalculatorTest {

    double sum;  // shared instance variable

    @Given("Addition scenario")
    public void additionScenario() {
        System.out.println("Starting addition scenario");
    }

    @When("User enters n1 as {double} and n2 as {double}")
    public void user_enters_numbers(double n1, double n2) {
        sum = n1 + n2;
        System.out.println("Sum calculated: " + sum);
    }

    @Then("Addition result should be {double}")
    public void addition_should_be(double expectedSum) {
        Assert.assertEquals(expectedSum, sum, 0.001);
        System.out.println("Addition validated successfully");
    }
}
