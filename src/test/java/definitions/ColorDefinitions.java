package definitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import steps.FormularioColorLib;

public class ColorDefinitions {
    @Steps
    FormularioColorLib formularioColorLib;

    @Dado("^que quiero ingresar a la pagina colorlib$")
    public void queQuieroIngresarALaPaginaColorlib() {
        formularioColorLib.iniciarPaginaColorlib();
    }

    @Y("^e inicio sesion en la pagina$")
    public void eInicioSesionEnLaPagina() {
        formularioColorLib.iniciarSesion();
    }

    @Y("^doy click en el menu Forms y Clic en submenú “Form Validation”$")
    public void doyClickEnElMenuFormsYClicEnSubmenúFormValidation() {
        formularioColorLib.clickFormulario();
    }

    @Cuando("^Diligencio todos los campos del formulario y doy Clic en botón Validate$")
    public void diligencioTodosLosCamposDelFormularioYDoyClicEnBotónValidate() {
        formularioColorLib.llenadoFormulario();

    }

    @Entonces("^tengo Respuesta Exitosa$")
    public void tengoRespuestaExitosa() {
        formularioColorLib.question();
    }

    @Cuando("^no Diligencio todos los campos del formulario Y Clic en botón Validate$")
    public void noDiligencioTodosLosCamposDelFormularioYClicEnBotónValidate() {
        formularioColorLib.escenarioFallido();

    }

    @Entonces("^tengo Respuesta Fallida$")
    public void tengoRespuestaFallida() {
        formularioColorLib.questioEscenariofallifo();
    }
}
