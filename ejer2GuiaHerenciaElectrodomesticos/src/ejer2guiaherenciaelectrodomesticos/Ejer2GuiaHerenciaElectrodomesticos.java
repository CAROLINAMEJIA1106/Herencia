/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer2guiaherenciaelectrodomesticos;


import Service.ServiceElectrodomestico;

/**
 *
 * @author Carolina
 */
public class Ejer2GuiaHerenciaElectrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceElectrodomestico es = new ServiceElectrodomestico();
        System.out.println("------ Programa de ingreso de datos de Electrodomésticos -----");
        es.crearLavadora();
        es.precioFinalLavadora();
        es.crearTelevisor();
        es.precioFinalTelevisor();
    }
    
}
