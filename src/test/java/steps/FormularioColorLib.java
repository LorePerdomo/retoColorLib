package steps;

import org.apache.bcel.generic.PUSH;
import org.junit.Assert;
import pageobject.Iniciarcolorlib;

public class FormularioColorLib {

    Iniciarcolorlib iniciarcolorlib;

    public void iniciarPaginaColorlib(){
        iniciarcolorlib.open();
    }

    public void iniciarSesion(){
        iniciarcolorlib.usuario.sendKeys("DEMO");
        iniciarcolorlib.contrasena.sendKeys("DEMO");
        iniciarcolorlib.iniciarsesion.click();

    }

    public void clickFormulario(){
        iniciarcolorlib.fomr.click();
        iniciarcolorlib.frmularioValidarion.click();
        iniciarcolorlib.signomaspopup.click();
        iniciarcolorlib.signomasblokc.click();
    }

    public void llenadoFormulario(){
        iniciarcolorlib.requerido.sendKeys("Arleidys");
        iniciarcolorlib.correoelectronico.sendKeys("arleidys2008@hotmail.com");
        iniciarcolorlib.contrasenaFormulario.sendKeys("samara2421");
        iniciarcolorlib.confimarcontrasenaformulario.sendKeys("samara2421");
        iniciarcolorlib.fecha.sendKeys("23/07/2021");
        iniciarcolorlib.url.sendKeys("https://colorlib.com/polygon/metis/form-validation.html");
        iniciarcolorlib.aceptoPoliticas.click();
        iniciarcolorlib.trescaracteres.sendKeys("123");
        iniciarcolorlib.maxioseiscaracteres.sendKeys("123wdg");
        iniciarcolorlib.minimotrescaracteres.sendKeys("123");
        iniciarcolorlib.minimodiesisescaratcteres.sendKeys("12");
        iniciarcolorlib.validarfomulario.click();

    }
    public void question(){
        String palabraactual = iniciarcolorlib.palabraActual.getText();
        Assert.assertEquals("Popup Validation", palabraactual);
    }

    public void escenarioFallido(){
        iniciarcolorlib.validarfomulario.click();
    }

    public void questioEscenariofallifo(){
        String palabraActual =iniciarcolorlib.palabraescenariofallido.getText();
        Assert.assertEquals("This field is required.",palabraActual);
    }

}
