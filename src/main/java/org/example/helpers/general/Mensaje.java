package org.example.helpers.general;

public enum Mensaje {
    MENSAJE_NUMEROS("Error! solo se aceptan numeros revisa por favor"),
    ERROR_MENSAJE_N_NEGATIVOS("error el numero no puede ser negativo"),
    ERROR_NUMERO_MAXIMO("error el numero no puede ser mayor de 30")
    ;

    //Atributo
    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
