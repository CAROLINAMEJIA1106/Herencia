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
public class Rectangulo implements calculosFormas {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public void area() {
        System.out.println("El área del rectángulo es: " + (this.base * this.altura));
    }

    @Override
    public void perimetro() {
        System.out.println("El perímetro del rectángulo es: " + ((this.base+this.altura)*2));
    }
    
    
}
