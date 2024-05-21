package org.example.helpers.validaciones;

import org.example.helpers.general.Mensaje;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PanelValidacion {


    public boolean validarAutonomia(Double autonomia) throws Exception{
        //solo numeros
        String regex = "^[0-9]+$";
        String autonomiaCadena=String.valueOf(autonomia);
        Pattern patron = Pattern.compile(regex);
        Matcher coincidencia= patron.matcher(autonomiaCadena);
        if(!coincidencia.matches()){
            throw new Exception(Mensaje.MENSAJE_NUMEROS.getMensaje());
        }

        //no negativos
        if(autonomia<0.0){
            throw new Exception(Mensaje.ERROR_MENSAJE_N_NEGATIVOS.getMensaje());
        }

        //numero maximo 30.0
        if(autonomia>30.0){
            throw new Exception(Mensaje.ERROR_NUMERO_MAXIMO.getMensaje());
        }

        return true;
    }

    public boolean validarCapacidad(Double capacidad)throws Exception{
        return true;
    }

    public boolean validarTamano(String tamano)throws Exception{
        return true;
    }

    public boolean validarFabricante(String fabricante)throws Exception{
        return true;
    }

}
