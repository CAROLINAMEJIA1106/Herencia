/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Barco;
import Entidad.BarcoGeneral;
import Entidad.BarcoMotor;
import Entidad.Velero;
import Entidad.Yate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Carolina
 */
public class ServiceAlquiler {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Barco b = new Barco();
    BarcoGeneral bg = new BarcoGeneral();
    Velero v = new Velero();
    BarcoMotor bm = new BarcoMotor();
    Yate y = new Yate();
    Integer valorAlquiler = 0;
    int op;
    
    
    public void crearCliente(){
        //Ingresamos los datos del cliente
        System.out.println("Iniciemos el proceso de Alquiler de amarres del Barco");
        System.out.print("Por favor ingrese el nombre del cliente: ");
        String nombre = read.next();
        System.out.print("Por favor ingrese el número de documento del cliente: ");
        Integer numDoc = read.nextInt();
        System.out.println("Por favor ingrese la fecha de alquiler del Barco: ");
        System.out.print("# del Año: ");
        int anio = read.nextInt();
        System.out.print("# del Mes: ");
        int mes = read.nextInt();
        System.out.print("# del día: ");
        int dia = read.nextInt();
        Date fechaAlq = new Date(anio-1900, mes-1, dia);
        System.out.println("Por favor ingrese la fecha de devolución del Barco: ");
        System.out.print("# del Año: ");
        int anio2 = read.nextInt();
        System.out.print("# del Mes: ");
        int mes2 = read.nextInt();
        System.out.print("# del día: ");
        int dia2 = read.nextInt();
        Date fechaDev = new Date(anio2-1900, mes2-1, dia2);
        System.out.print("Por favor ingrese la posición de Amarre del Barco(babor,estribor,popa o proa): ");
        String poscAmarre = read.next();
        
        //Calculamos la diferencia entre las fechas
        
        Long difFecha = fechaDev.getTime()- fechaAlq.getTime();

        TimeUnit time = TimeUnit.DAYS; 
        long diferencia = time.convert(difFecha, TimeUnit.MILLISECONDS);
        int dif = Math.toIntExact(diferencia); //convierto a int
        Integer di = dif;
        
        
        System.out.println("Diferencia de días:  "+ di);
        
        
        //ingresamos los datos del barco pero definimos tipo de barco a alquilar
        do{
            System.out.println("Del siguiente MENÚ por favor digite la opción de barco que va a alquilar: ");
            System.out.println("1. Barco General");
            System.out.println("2. Barco tipo Velero");
            System.out.println("3. Barco a Motor");
            System.out.println("4. Barco tipo Yate");
            System.out.println("5. Exit");
            op = read.nextInt();

            switch (op) {
                case 1:
                    bg.crearBarco();
                    bg.valorModuloBarco();

                    valorAlquiler = (di * bg.getValorModulo());
                    System.out.println("El valor de alquiler del Barco tipo General es: " + valorAlquiler);
                    break;
                case 2:
                    v.crearBarco();
                    System.out.println("Ingrese el número de mástiles: ");
                    v.setNumerosMastiles(read.nextInt());
                    v.valorModuloBarco();
                    valorAlquiler = (di * v.getValorModulo()) + v.getNumerosMastiles();
                    System.out.println("El valor de alquiler del Barco tipo Velero es: " + valorAlquiler);
                    break;
                case 3:
                    bm.crearBarco();
                    System.out.println("Ingrese la potencia en CV del Barco a motor: ");
                    bm.setPotenciaCVBM(read.nextInt());
                    bm.valorModuloBarco();
                    valorAlquiler = (di * bm.getValorModulo()) + bm.getPotenciaCVBM();
                    System.out.println("El valor de alquiler del Barco a Motor es: " + valorAlquiler);
                    break;
                case 4:
                    y.crearBarco();
                    System.out.println("Ingrese la potencia del motor del yate en CV: ");
                    y.setPotenciaCVY(read.nextInt());
                    System.out.println("Ingrese el numero de camarotes del yate: ");
                    y.setNumeroCamarotes(read.nextInt());
                    y.valorModuloBarco();
                    valorAlquiler = (di * y.getValorModulo()) + (y.getPotenciaCVY() + y.getNumeroCamarotes());
                    System.out.println("El valor de alquiler del Barco tipo Yate es: " + valorAlquiler);
                    break;
                case 5:
                    System.out.println("Thank you!!!! Exit");
                    break;
                default:
                    System.out.println("Opción NO válida!!!");
            }
        }while(op!=5);
        
    }
            
    
}
