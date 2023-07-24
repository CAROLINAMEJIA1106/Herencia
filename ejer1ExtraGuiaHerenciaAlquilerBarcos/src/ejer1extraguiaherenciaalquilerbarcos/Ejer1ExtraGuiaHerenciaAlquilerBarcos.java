/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer1extraguiaherenciaalquilerbarcos;

import Service.ServiceAlquiler;

/**
 *
 * @author Carolina
 */
public class Ejer1ExtraGuiaHerenciaAlquilerBarcos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("--------- PUERTO DE BUENAVENTURA ---------");
        System.out.println(" ");
        System.out.println("PROGRAMA DE ALQUILER DE AMARRES PARA BARCOS");
        System.out.println("!!!!!! WELCOME !!!!!!");
        
        ServiceAlquiler sa = new ServiceAlquiler();
        sa.crearCliente();
        
        
    }
    
}
