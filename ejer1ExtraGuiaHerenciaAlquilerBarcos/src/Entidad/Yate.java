/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Carolina
 */
public class Yate extends Barco {
    private Integer potenciaCVY;
    private Integer numeroCamarotes;

    public Yate() {
    }

    public Yate(Integer potenciaCVY, Integer numeroCamarotes, String matricula, Integer eslora, Integer anioFabric, Integer valorModulo) {
        super(matricula, eslora, anioFabric, valorModulo);
        this.potenciaCVY = potenciaCVY;
        this.numeroCamarotes = numeroCamarotes;
    }

    public Integer getPotenciaCVY() {
        return potenciaCVY;
    }

    public void setPotenciaCVY(Integer potenciaCVY) {
        this.potenciaCVY = potenciaCVY;
    }

    public Integer getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(Integer numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }
    
    
}
