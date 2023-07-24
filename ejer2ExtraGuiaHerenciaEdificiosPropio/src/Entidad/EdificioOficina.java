/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class EdificioOficina extends Edificio {
    private Integer numeroOficinas;
    private Integer cantidadPersonasPorOf;
    private Integer numeroDePisos;

    public EdificioOficina() {
    }

    public EdificioOficina(Integer numeroOficinas, Integer cantidadPersonasPorOf, Integer numeroDePisos, Integer largo, Integer ancho, Integer alto) {
        super(largo, ancho, alto);
        this.numeroOficinas = numeroOficinas;
        this.cantidadPersonasPorOf = cantidadPersonasPorOf;
        this.numeroDePisos = numeroDePisos;
    }

    public Integer getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(Integer numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public Integer getCantidadPersonasPorOf() {
        return cantidadPersonasPorOf;
    }

    public void setCantidadPersonasPorOf(Integer cantidadPersonasPorOf) {
        this.cantidadPersonasPorOf = cantidadPersonasPorOf;
    }

    public Integer getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(Integer numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    @Override
    public String toString() {
        return "EdificioOficina{" + "numeroOficinas=" + numeroOficinas + ", cantidadPersonasPorOf=" + cantidadPersonasPorOf + ", numeroDePisos=" + numeroDePisos + '}';
    }
    
    

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del Edificio de Oficinas de " +this.numeroDePisos + " pisos es: " + (super.ancho*super.largo));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del Edificio de Oficinas de " +this.numeroDePisos + " pisos es: " + (super.ancho*super.largo*super.alto));
    }
    
    public void cantidadPersonas(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        int listadoOficinas[] = new int[this.numeroDePisos];
        int cantidadPersonasPiso[] = new int[this.numeroDePisos];
        int cantidadTotalPersonasEd = 0;
        for (int i = 0; i < this.numeroDePisos; i++) {
            System.out.print("Cuantas oficinas hay en el piso " + (i+1) + " ?: ");
            listadoOficinas[i] = read.nextInt();
        }
        for (int i = 0; i < this.numeroDePisos; i++) {
            cantidadPersonasPiso[i] = cantidadPersonasPorOf*listadoOficinas[i];
            cantidadTotalPersonasEd += cantidadPersonasPiso[i];
        }
        System.out.println("La cantidad de personas TOTALES en este Edificio de Oficinas de " + numeroDePisos + " pisos es: " + cantidadTotalPersonasEd);
        System.out.println("La cantidad de personas por piso en este Edificio de Oficinas de " + numeroDePisos + " pisos es: ");
        for (int i = 0; i < numeroDePisos; i++) {
            System.out.println(" " + cantidadPersonasPiso[i] + " personas en el " + (i+1) + "°piso");
        }
    }
    
    
}    
