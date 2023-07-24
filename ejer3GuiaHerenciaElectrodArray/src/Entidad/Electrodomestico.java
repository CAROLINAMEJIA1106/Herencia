/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Electrodomestico {
    protected Integer precio;
    protected String color;
    protected Character consEnerg;
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, String color, Character consEnerg, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consEnerg = consEnerg;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsEnerg() {
        return consEnerg;
    }

    public void setConsEnerg(Character consEnerg) {
        this.consEnerg = consEnerg;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    
    public final void comprobarConsumoEnerg(){
        if(this.consEnerg.equals('A')|| this.consEnerg.equals('B')|| this.consEnerg.equals('C')|| this.consEnerg.equals('D')||this.consEnerg.equals('E')||this.consEnerg.equals('F')){
            System.out.println(" "+this.consEnerg);
        }else{
            this.consEnerg = 'F';
            System.out.println(" "+this.consEnerg);
            
        }
    }
    public final void comprobarcolor(){
        if(this.color.equalsIgnoreCase("blanco")||this.color.equalsIgnoreCase("negro")||this.color.equalsIgnoreCase("rojo")||this.color.equalsIgnoreCase("azul")||this.color.equalsIgnoreCase("gris")){
            System.out.println(" "+this.color);
        }else{
            this.color = "Blanco";
            System.out.println(" "+this.color);
        }
    }
    
    public final void crearElectrodomestico(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Por favor ingrese el color del electrodoméstico:  ");
        this.color = read.next();
        this.precio = 1000;
        System.out.print("Por favor ingrese el consumo energético del electrodoméstico: ");
        this.consEnerg = read.next().charAt(0);
        this.consEnerg = Character.toUpperCase(this.consEnerg);
        System.out.print("Por favor ingrese el peso del electrodoméstico: ");
        this.peso = read.nextInt();
    }
    
    public final void precioFinal(){
        switch (this.consEnerg) {
            case 'A':
                this.precio = this.precio + 1000;
                break;
            case 'B':
                this.precio = this.precio + 800;
                break;
            case 'C':
                this.precio = this.precio + 600;
                break;
            case 'D':
                this.precio = this.precio + 500;
                break;
            case 'E':
                this.precio = this.precio + 300;
                break;
            case 'F':
                this.precio = this.precio + 100;
                break;
            default:
                System.out.println("Error A");
        }
        if(this.peso>=1&&this.peso<=19){
            this.precio = this.precio + 100;
        }else{
            if(this.peso>=20&&this.peso<=49){
                this.precio = this.precio + 500;
            }else{
                if(this.peso>=50&&this.peso<=79){
                    this.precio = this.precio + 800;
                }else{
                    if(this.peso>=80){
                        this.precio = this.precio + 1000;
                    }else{
                        System.out.println("Error B");
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consEnerg=" + consEnerg + ", peso=" + peso + '}';
    }
    
    
}
