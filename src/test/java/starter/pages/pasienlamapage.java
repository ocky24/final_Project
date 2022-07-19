package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class pasienlamapage extends PageObject {
    private By onOldPatientRegistPage() { return By.xpath("//label[normalize-space()='ID']");}
    private By inputFieldIDPatient(){return By.id("id");}
    private By norekField(){return By.id("norek");}
    private By dropdownpolimata(){return By.xpath("//select[@id='poli']");}
    private By dropdowndoctor(){return By.xpath("//select[@id='dokter']");}
    private By time(){return By.xpath("//select[@id='time']");}
    private By keluhanField(){return By.id("keluhan");}
    private By ConfirmButton(){return By.xpath("//button[@class='btnDaftarPasien btn btn-primary btn-block mt-4']");}
    private By registSuccess(){return By.xpath("//strong[normalize-space()='PENDAFTARAN BERHASIL']");}

    @Step
    public void onoldregist() {$(onOldPatientRegistPage()).isDisplayed();}

    @Step
    public void inputvalididpatient(String idpatient){
        $(inputFieldIDPatient()).type(idpatient);
    }

    @Step
    public void norekfield(String record){$(norekField()).containsValue(record);}


}
