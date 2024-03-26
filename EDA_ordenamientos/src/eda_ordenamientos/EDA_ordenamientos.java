/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eda_ordenamientos;

/**
 *
 * @author usuario
 */
public class EDA_ordenamientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ordenamiento ordenar = new Ordenamiento();
        ordenar.carga();
        ordenar.shellSort();
        ordenar.muestra();
//        ordenar.busquedaLineal(15);
    }
    
}
