/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Carolina
 */
public class Caballo extends Animal{

    public Caballo(String nombre, String alimento, Integer Edad, String raza) {
        super(nombre, alimento, Edad, raza);
    }

    

    @Override
    public void Alimentarse() {
        System.out.println("El alimento del caballo " + nombre + " es: " + alimento);
    }
    
}
