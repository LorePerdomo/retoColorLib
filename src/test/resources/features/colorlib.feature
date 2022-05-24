#language: es
@hu
Característica:Verificar el diligenciamiento de la pantalla “Inline Validation”
Antecedentes:
Dado que quiero ingresar a la pagina colorlib
Y e inicio sesion en la pagina
Y doy click en el menu Forms y Clic en submenú “Form Validation”
@CP1
Escenario:Diligenciar Formulario Inline Validation Exitosamente
Cuando Diligencio todos los campos del formulario y doy Clic en botón Validate
Entonces tengo Respuesta Exitosa

@CP2
  Escenario: Diligenciar Formulario Inline Validation Fallida
    Cuando no Diligencio todos los campos del formulario Y Clic en botón Validate
    Entonces 	tengo Respuesta Fallida