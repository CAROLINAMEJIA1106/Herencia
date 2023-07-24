/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class ServiceElectrodomestico {
    
    Electrodomestico elec = new Electrodomestico();
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Lavadora lav = new Lavadora();
    Televisor tv = new Televisor();
    
    public void crearLavadora(){
        
        System.out.println("----- Ingrese los datos de la Lavadora ------");
        elec.crearElectrodomestico();
        elec.comprobarcolor();
        elec.comprobarConsumoEnerg();
        System.out.print("Por favor ingrese la carga de la Lavadora: ");
        lav.setCarga(read.nextInt());
        
    }
    public void precioFinalLavadora(){
        elec.precioFinal();
        if(lav.getCarga()>30){
            elec.setPrecio(elec.getPrecio()+500);
        }else{
            if(lav.getCarga()<=30){
                
            }else{
                System.out.println("Error C");
            }
        }
        System.out.println("El precio final de la Lavadora es: ");
        System.out.println(" "+elec.getPrecio());
    }
    public void crearTelevisor(){
        
        String tdt;
        System.out.println("----- Ingrese los datos del Televisor ------");
        elec.crearElectrodomestico();
        elec.comprobarcolor();
        elec.comprobarConsumoEnerg();
        System.out.print("Por favor ingrese la resolución en pulgadas del Televisor: ");
        tv.setResolucion(read.nextInt());
        System.out.print("El Televisor tiene TDT ó sintonizador?(ingrese la letra T para true ó F para false): ");
        tdt = read.next();
        if(tdt.equalsIgnoreCase("T")){
            tv.setSintonizador(true);
        }else{
            tv.setSintonizador(false);
        }
        
    }
    public void precioFinalTelevisor(){
        elec.precioFinal();
        if(tv.getResolucion()> 40){
            elec.setPrecio(elec.getPrecio() + (elec.getPrecio()*30) / 100);
        }
        if(tv.getSintonizador()== true){
            elec.setPrecio(elec.getPrecio()+500);
        }
        System.out.println("El precio final del Televisor es: ");
        System.out.println(" "+ elec.getPrecio());
    }
}
