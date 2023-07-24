/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Carolina
 */
public class Velero extends Barco {
    private Integer numerosMastiles;

    public Velero() {
    }

    public Velero(Integer numerosMastiles, String matricula, Integer eslora, Integer anioFabric, Integer valorModulo) {
        super(matricula, eslora, anioFabric, valorModulo);
        this.numerosMastiles = numerosMastiles;
    }

    public Integer getNumerosMastiles() {
        return numerosMastiles;
    }

    public void setNumerosMastiles(Integer numerosMastiles) {
        this.numerosMastiles = numerosMastiles;
    }
    
    
}
