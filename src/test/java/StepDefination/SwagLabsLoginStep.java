package StepDefination;

import java.io.IOException;

import Base.BrowserOpen;
import Page.SwagLabsLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabsLoginStep extends BrowserOpen {
	@Given("^user on login page$")
    public void user_on_login_page() throws IOException {
        intilization();
        System.out.println("login page");
    }
    @When("^user pass valid (.*) and (.*)$")
    public void user_pass_valid_username_and_password(String uN,String pW) {

        SwagLabsLoginStep sw=new SwagLabsLoginStep();
        sw.user_pass_valid_username_and_password(uN,pW);
        System.out.println("passed username and password");

    }
    @When("^user click on login button$")
    public void user_click_on_login_button() {
        SwagLabsLoginPage sw=new SwagLabsLoginPage();
        sw.user_click_on_login_button();
        System.out.println("clicked login button");

    }
    @Then("^user will redirected to hompage$")
    public void user_will_redirected_to_hompage() {
        System.out.println("redirected to home page");
        driver.quit();
    }
}
