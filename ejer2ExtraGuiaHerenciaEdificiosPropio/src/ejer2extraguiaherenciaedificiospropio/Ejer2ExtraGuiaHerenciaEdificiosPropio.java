/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer2extraguiaherenciaedificiospropio;

import Entidad.Edificio;
import Entidad.EdificioOficina;
import Entidad.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author Carolina
 */
public class Ejer2ExtraGuiaHerenciaEdificiosPropio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Polideportivo pol = new Polideportivo();
       EdificioOficina eo = new EdificioOficina();
       ArrayList<Edificio> listadoEdificios = new ArrayList(); 
                
       listadoEdificios.add(new Polideportivo("JERONIMO MISTRAL", true, 10, 20, 30));
       listadoEdificios.add(new Polideportivo("EGG COOPERATION", true, 20, 50, 40));
       listadoEdificios.add(new EdificioOficina(18, 10, 6, 30, 15, 20)); 
       listadoEdificios.add(new EdificioOficina(40, 20, 10, 40, 20, 40));  
       System.out.println("A continuación mostraremos el listado de todos los polideportivos "
                + "y de los Edificios de Oficinas con sus Superficies y Volumenes");
        for (Edificio listadoEdificio : listadoEdificios) {
            listadoEdificio.calcularSuperficie();
            listadoEdificio.calcularVolumen();
        }
        //cuantos POLIDEPORTIVOS son techados
        int cont =0;
        int cont2=0;
        
        for (Edificio listadoEdificio : listadoEdificios) {
            if(listadoEdificio instanceof Polideportivo){
                
                pol = (Polideportivo) listadoEdificio;
                if(pol.getTipoInstalacion()==true){
                    cont += 1;
                }else{
                    cont2 += 1;
                }
            }
        }      
        System.out.println("La cantidad de polideportivos que son techados son: " + cont);
        System.out.println("La cantidad de polideportivos que no tienen techo son: " + cont2);
        
        //Edificios de oficinas con el numero de personas
        
        for (Edificio listadoEdificio : listadoEdificios) {
            if(listadoEdificio instanceof EdificioOficina){
                eo = (EdificioOficina) listadoEdificio;
                eo.cantidadPersonas();
            }
        }
            
    
        
    }
    
}
