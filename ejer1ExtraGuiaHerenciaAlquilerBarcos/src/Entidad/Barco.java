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
public class Barco {
    protected String matricula;
    protected Integer eslora;
    protected Integer anioFabric;
    protected Integer valorModulo;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer anioFabric, Integer valorModulo) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabric = anioFabric;
        this.valorModulo = valorModulo;
    }

    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioFabric() {
        return anioFabric;
    }

    public void setAnioFabric(Integer anioFabric) {
        this.anioFabric = anioFabric;
    }

    public Integer getValorModulo() {
        return valorModulo;
    }

    public void setValorModulo(Integer valorModulo) {
        this.valorModulo = valorModulo;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabric=" + anioFabric + ", valorModulo=" + valorModulo + '}';
    }
    
    
    public final void crearBarco(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Por favor ingrese la matricula del Barco: ");
        this.matricula = read.next();
        System.out.println("Por favor ingrese la eslora del Barco en metros: ");
        this.eslora = read.nextInt();
        System.out.println("Por favor ingrese el Año de Fabricación del Barco: ");
        this.anioFabric = read.nextInt();
    }
    public final void valorModuloBarco(){
        this.valorModulo = 10 * this.eslora;
    }
}
