/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Carolina
 */
public abstract class Edificio {
    protected Integer largo;
    protected Integer ancho;
    protected Integer alto;

    public Edificio() {
    }

    public Edificio(Integer largo, Integer ancho, Integer alto) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Edificio{" + "largo=" + largo + ", ancho=" + ancho + ", alto=" + alto + '}';
    }
    
    public abstract void calcularSuperficie();
    public abstract void calcularVolumen();
}
