package pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class Iniciarcolorlib extends PageObject {

    @FindBy(xpath = "//*[@id=\"login\"]/form/input[1]")
    public WebElementFacade usuario;
    @FindBy(xpath = "//*[@id=\"login\"]/form/input[2]")
    public WebElementFacade contrasena;
    @FindBy(xpath = "//*[@id=\"login\"]/form/button")
    public WebElementFacade iniciarsesion;
    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/a")
    public WebElementFacade fomr;
    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/ul/li[2]/a")
    public WebElementFacade frmularioValidarion;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[1]/div/div/header/div[2]/nav/a[1]/i")
    public WebElementFacade signomaspopup;
    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div[2]/div/div/header/div[2]/nav/a[1]/i")
    public WebElementFacade signomasblokc;
    @FindBy(xpath = "//*[@id=\"required\"]")
    public WebElementFacade requerido;
    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElementFacade correoelectronico;
    @FindBy(id = "password")
    public WebElementFacade contrasenaFormulario;
    @FindBy(id = "confirm_password")
    public WebElementFacade confimarcontrasenaformulario;
    @FindBy(id = "date")
    public WebElementFacade fecha;
    @FindBy(id = "url")
    public WebElementFacade url;
    @FindBy(id = "agree")
    public WebElementFacade aceptoPoliticas;
    @FindBy(id = "minsize")
    public WebElementFacade trescaracteres;
    @FindBy(id = "maxsize")
    public WebElementFacade maxioseiscaracteres;
    @FindBy(id = "minNum")
    public WebElementFacade minimotrescaracteres;
    @FindBy(id = "maxNum")
    public WebElementFacade minimodiesisescaratcteres;
    @FindBy(xpath = "//*[@id=\"inline-validate\"]/div[12]/input")
    public WebElementFacade validarfomulario;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[1]/div/div/header/h5")
    public WebElementFacade palabraActual;
    @FindBy(xpath = "//*[@id=\"required-error\"]")
    public WebElementFacade palabraescenariofallido;
}
