/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.ordenaminetos.main;

import java.util.Arrays;
import static mx.itson.ordenamientos.business.Ordenamiento_seleccion.Ordenamiento_seleccion;

/**
 *
 * @author PC AGRA
 */
public class Main_seleccion {
      public static void main(String[] args) {
        int[] lista = {64, 25, 12, 22, 11}; // Se puede cambiar por cualquier otra lista
        System.out.println("Antes de ordenar: " + Arrays.toString(lista));
        
        Ordenamiento_seleccion(lista);
        
        System.out.println("Después de ordenar: " + Arrays.toString(lista));
    
}
      }
      
