/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer3guiaherenciaelectrodarray;

import Entidad.Electrodomestico;
import Service.ServiceElectrodomestico;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Carolina
 */
public class Ejer3GuiaHerenciaElectrodArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in).useDelimiter("\n");
        ServiceElectrodomestico es = new ServiceElectrodomestico();
        System.out.println("------ Programa de ingreso de datos de Electrodomésticos -----");
        ArrayList<Electrodomestico> listado = new ArrayList();
        ArrayList<Integer> precios = new ArrayList();
        String opcion;
        int cont1 = 0;
        int cont2 = 0;
        Integer precioTotalL = 0;
        Integer precioTotalTV = 0;
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Qué electrodoméstico desea ingresar?(L para lavadora o T para televisor): ");
            opcion = read.next();
            opcion = opcion.toUpperCase();
            switch (opcion) {
                case "L":
                    listado.add(es.crearLavadora());
                    precios.add(es.precioFinalLavadora());
                    cont1 += 1;
                    precioTotalL = es.precioTotalLavadoras();
                    break;
                case "T":
                    listado.add(es.crearTelevisor());
                    precios.add(es.precioFinalTelevisor());
                    cont2 += 1;
                    precioTotalTV = es.precioTotalTelevisores();
                    break;
                default:
                    System.out.println("Error Letra Inválida!!!");
            }
        }
        
        System.out.println("El listado de los electrodomésticos con sus precios individuales es: ");
        for (Integer precio : precios) {
            System.out.println(" "+precio);
        }
        
        System.out.println("El precio total de las " +cont1 + " lavadoras es: " + precioTotalL);
        
        System.out.println("El precio total de los " + cont2 + " televisores es:  " + precioTotalTV);
        System.out.println("El precio Total de los Electrodomésticos es: " + (precioTotalL+precioTotalTV));
    }
    
}
