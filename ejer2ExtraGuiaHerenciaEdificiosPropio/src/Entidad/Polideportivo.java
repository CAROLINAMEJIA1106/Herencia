/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Carolina
 */
public class Polideportivo extends Edificio{
    private String nombre;
    private Boolean tipoInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, Boolean tipoInstalacion, Integer largo, Integer ancho, Integer alto) {
        super(largo, ancho, alto);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(Boolean tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", tipoInstalacion=" + tipoInstalacion + '}';
    }
    
    

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del polideportivo " + this.nombre +" es: " + (super.ancho*super.largo));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del polideportivo " + this.nombre + " es: " +(super.alto*super.ancho*super.largo));
    }
    
}
