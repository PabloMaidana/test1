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
    private int[] datos = new int [10000];
    
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
       int q = datos.length;
        boolean intercambio;
        for (int i = 0; i < q - 1; i++) {
            intercambio = false;
            for (int j = 0; j < q - i - 1; j++) {
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
        int n = datos.length;
        for (int i = 1; i < n; ++i) {
            int key = datos[i];
            int j = i - 1;

            // Mover los elementos del arreglo arr[0..i-1] que son mayores que key
            // a una posición adelante de su posición actual
            while (j >= 0 && datos[j] > key) {
                datos[j + 1] = datos[j];
                j = j - 1;
            }
            datos[j + 1] = key;
        }
    }
    public void shellSort(){
        
    }
    
}
