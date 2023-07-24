/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Interface.calculosFormas;

/**
 *
 * @author Carolina
 */
public class Circulo implements calculosFormas {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public void area() {
        System.out.println("El área del círculo es: " + (pI*(Math.pow(this.radio, 2))));
    }

    @Override
    public void perimetro() {
        System.out.println("El perimetro del circuo es: " + (pI * (2*this.radio)));
    }
    
    
}
