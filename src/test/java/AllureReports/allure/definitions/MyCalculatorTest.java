package AllureReports.allure.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
 
public class MyCalculatorTest {

 
    @Given("Addition scenario")
    
 
    @When("User enters n1 as {double} and n2 as {double}")
    public double addition(double n1, double n2) {
 
       double sum = n1+n2;
       System.out.println(sum);
       return sum;

    }
 
    @Then("Addition should be calculated successfully")
    public void getSum(double sum)
    {
    	Assert.assertEquals(sum, 9.0);
    	
    }
}