/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Carolina
 */
public class Televisor extends Electrodomestico {
    private Integer resolucion;
    private Boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean sintonizador, Integer precio, String color, Character consEnerg, Integer peso) {
        super(precio, color, consEnerg, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    
    
}
