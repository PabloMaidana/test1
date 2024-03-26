/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eda_ordenamientos;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author usuario
 */
public class Ordenamiento {
    private int[] datos = new int [10000];

    public int[] getDatos() {
        return datos;
    }
 
     public void carga(){
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 10000);
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
    
    public void quickSort(int izq,int der){
        int pivote = datos[izq];
        int i = izq;
        int j = der;
        int aux;
        
        while(i < j){
            while (datos[i] <= pivote && i < j) i++; 
            while (datos[j] > pivote) j--;
            if (i < j) {
                aux = datos[i];
                datos[i] = datos[j];
                datos[j] = aux;
            }
        }
        datos[izq] = datos[j];
        datos[j] = pivote;
        
        if (izq < j-1) {
            quickSort(izq,j-1);
        }
        if (j+1 < der) {
            quickSort(j+1,der);
        }
    }
    
    public void bucketSort(){
        int n = datos.length;

        // Creamos una lista de cubetas
        ArrayList<Float>[] buckets = new ArrayList[n];

        // Inicializamos cada cubeta como una lista vacía
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Agregamos cada elemento al cubeta correspondiente
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * arr[i]);
            buckets[bucketIndex].add(arr[i]);
        }

        // Ordenamos cada cubeta individualmente utilizando otro algoritmo (p.ej. Insertion Sort)
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Concatenamos los elementos ordenados de cada cubeta en el arreglo original
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                datos[index++] = buckets[i].get(j);
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
