/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer1guiaherenciaanimales;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *
 * @author Carolina
 */
public class Ejer1GuiaHerenciaAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich","Carnivoro",15,"Doberman");
        perro1.Alimentarse();
        
        Animal perro2 = new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro2.Alimentarse();
        
        Animal gato1 = new Gato("Pelusa","Galletas",15,"Slamés");
        gato1.Alimentarse();
        
        Animal caballo1 = new Caballo("Spark","Pasto",25,"Fino");
        caballo1.Alimentarse();
    }
    
}
