/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Carolina
 */
public class Lavadora extends Electrodomestico {
    private Integer carga;

    public Lavadora() {
    }
    

    public Lavadora(Integer carga, Integer precio, String color, Character consEnerg, Integer peso) {
        super(precio, color, consEnerg, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
    
    
    
}
