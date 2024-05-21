package org.example.modelos;

import org.example.helpers.validaciones.PanelValidacion;

public class Panel {

    private Integer id;
    private Double autonomia;
    private Double capacidad;
    private String tamano;
    private String fabricante;

    PanelValidacion panelValidacion = new PanelValidacion();

    public Panel() {
    }

    public Panel(Integer id, Double autonomia, Double capacidad, String tamano, String fabricante) {
        this.id = id;
        this.autonomia = autonomia;
        this.capacidad = capacidad;
        this.tamano = tamano;
        this.fabricante = fabricante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

        this.id = id;

    }

    public Double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Double autonomia) {
        try{
            this.panelValidacion.validarAutonomia(autonomia);
            this.autonomia = autonomia;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    public Double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
