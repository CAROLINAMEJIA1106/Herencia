/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Carolina
 */
public class Perro extends Animal {

    public Perro(String nombre, String alimento, Integer Edad, String raza) {
        super(nombre, alimento, Edad, raza);
    }

    

    @Override
    public void Alimentarse() {
        System.out.println("El alimento del perro " +nombre +" es: "+ alimento);
    
    
    }
    
}
