package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class homepages extends PageObject {
    private By homePage(){
        return By.xpath("//h1[normalize-space()='Selamat Datang Admin Simars!']");
    }
    private By newpatientregist(){return By.xpath("//a[normalize-space()='+ Pendaftaran pasien baru']");}
    private By oldpatientregist(){return By.xpath("//a[normalize-space()='+ Pendaftaran pasien lama']");}

    @Step
    public void onHomePage(){
        $(homePage()).isDisplayed();
    }

    @Step
    public void clickNewPatienRegist(){$(newpatientregist()).click();}

    @Step
    public void clickOldPatientRegist(){$(oldpatientregist()).click();}
}
