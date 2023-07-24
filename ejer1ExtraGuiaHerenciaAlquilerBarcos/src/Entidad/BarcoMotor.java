/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Carolina
 */
public class BarcoMotor extends Barco {
    private Integer potenciaCVBM;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer potenciaCVBM, String matricula, Integer eslora, Integer anioFabric, Integer valorModulo) {
        super(matricula, eslora, anioFabric, valorModulo);
        this.potenciaCVBM = potenciaCVBM;
    }

    public Integer getPotenciaCVBM() {
        return potenciaCVBM;
    }

    public void setPotenciaCVBM(Integer potenciaCVBM) {
        this.potenciaCVBM = potenciaCVBM;
    }
    
    
}
