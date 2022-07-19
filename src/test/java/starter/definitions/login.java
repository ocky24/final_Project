package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.loginpages;

public class login {
    @Steps
    starter.pages.loginpages login;

    @Steps
    starter.pages.homepages homepage;

    @Given("admin on login page")
    public void ontheLoginPage(){
        login.openPage();
        login.validateonLoginPage();
    }

    @When("admin input valid id")
    public void ValidID(){
        login.inputID("admin-1");
    }

    @And("admin input valid password")
    public void ValidPassword(){
        login.inputPassword("root");
    }

    @And("admin click on masuk button")
    public void LoginButton(){
        login.clickloginButton();
    }
    @Then("admin on homepage")
    public void HomePage(){
        homepage.onHomePage();
    }

    @When("admin input invalid id")
    public void invalidID(){login.invalidID("admin");
    }
    @Then("error notification appears")
    public void errorNotificationID(){login.errornotificationID();
    }
    @And("admin input invalid password")
    public void invalidPassword(){
    login.invalidPassword("rooot");
    }
    @Then("error password notification appears")
    public void errorPasswordNotificationAppears(){
    login.errorNotificationpassword();
    }
    @And("admin click new patient registration button")
    public void clickNewPationRegistButton(){
    homepage.clickNewPatienRegist();
    }
    @And("admin click old patient registration button")
    public void clickoldPationRegistButton(){
        homepage.clickOldPatientRegist();
    }
}
