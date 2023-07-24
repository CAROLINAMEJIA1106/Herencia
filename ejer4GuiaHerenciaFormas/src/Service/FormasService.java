/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Circulo;
import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class FormasService {
    Circulo cir = new Circulo();
    Rectangulo rect = new Rectangulo();
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    
    public void crearCirculo(){
        System.out.println("Por favor ingrese el radio del circulo: ");
        cir.setRadio(read.nextDouble());
        cir.area();
        cir.perimetro();
    }
    public void crearRectagulo(){
        System.out.println("Por favor ingrese la base del rectángulo: ");
        rect.setBase(read.nextDouble());
        System.out.println("Por favor ingrese la altura del rectángulo: ");
        rect.setAltura(read.nextDouble());
        rect.area();
        rect.perimetro();
    }
}
