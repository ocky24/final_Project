package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class loginpages extends PageObject {
    private By usernameField(){
        return By.id("id");
    }
    private By passwordField(){
        return By.id("password");
    }
    private By LoginButton(){
        return By.xpath("//button[@class='btnn btn btn-primary btn-block mt-4']");
    }
    private By errorNotificationID(){
        return By.xpath("(//li[normalize-space()='ID terlalu pendek, minimal 7 karakter!'])[1]");
    }
    private By errorNotificationPassword(){
        return By.xpath("//li[contains(text(),'Credentials Salah, silahkan masukkan data yang benar!')]");
    }

    @Step
    public void openPage(){open();}

    @Step
    public void validateonLoginPage(){
        $(LoginButton()).isDisplayed();
    }

    @Step
    public void inputID(String id){
        $(usernameField()).type(id);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickloginButton() {
        $(LoginButton()).click();
    }

    @Step
    public void invalidID(String id){
        $(usernameField()).type(id);
    }

    @Step
    public void errornotificationID () {$(errorNotificationID()).isDisplayed();}

    @Step
    public void invalidPassword(String password) {$(passwordField()).type(password);
    }
    @Step
    public void errorNotificationpassword(){$(errorNotificationPassword()).isDisplayed();}
}
