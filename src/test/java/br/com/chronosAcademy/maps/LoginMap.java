package br.com.chronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {

    @FindBy(css = "#menuUserLink")
    public WebElement btnLogin;

    @FindBy(css = ".closeBtn")
    public WebElement btnFechar;

    @FindBy(css = ".PopUp")
    public WebElement divFecharModal;
    public WebElement impUserName;
    public WebElement impPassword;
    public WebElement btnSignIn;
    public WebElement impRemember;
    public WebElement linkCreateAccount;
}
