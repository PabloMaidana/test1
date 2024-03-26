/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eda_ordenamientos;

/**
 *
 * @author usuario
 */
public class Ordenamiento {
    private int[] datos = new int [10];
    
     public void carga(){
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 10);
        }
    }
    public void muestra(){
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i]);
            System.out.print(" ");
            if (i%10==0) {
                System.out.println("");
            }
        }
    }
    public void bubbleSort(){
       int tam = datos.length;
        boolean intercambio;
        for (int i = 0; i < tam - 1; i++) {
            intercambio = false;
            for (int j = 0; j < tam - i - 1; j++) {
                if (datos[j] > datos[j + 1]) {
                    int aux = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = aux;
                    intercambio = true;
                }
            }
            if (!intercambio)
                break;
        }
    }
    public void insertionSort(){
        int tam = datos.length;
        for (int i = 1; i < tam; ++i) {
            int elem = datos[i];
            int j = i - 1;
            while (j >= 0 && datos[j] > elem) {
                datos[j + 1] = datos[j];
                j = j - 1;
            }
            datos[j + 1] = elem;
        }
    }
    
    public void shellSort(){
        int tam = datos.length;
        for (int intervalo = tam / 2; intervalo > 0; intervalo /= 2) {
            for (int i = intervalo; i < tam; i++) {
                int elem = datos[i];
                int j;
                for (j = i; j >= intervalo && datos[j - intervalo] > elem; j -= intervalo) {
                    datos[j] = datos[j - intervalo];
                }
                datos[j] = elem;
            }
        }
    }
    
    public void busquedaLineal(int n){
        int tam = datos.length;
        for (int i = 0; i < tam ; i++) {
            if (datos[i] == n ) {
                System.out.println("El numero " + n + " se encuentra en la posicion " + i);
            }
        }
    }
//    system current time milis
//    public void busquedaBinaria(int n){
//        int tam = datos.length;
//        int i = tam / 2;
//        boolean encontrado;
//        while(datos[i] != n){
//            if (datos) {
//                
//            }
//        }
//        
//    }
    
}
