/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.metodosdebusqueda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevin
 */
public class MetodosDeBusqueda {
   
    static List<Integer> listEnteros;

    static int numeroRandom = (int)(Math.random()*10+1);;

    public static void main(String[] args) {
        
        //creamos la lista de numeros
        listEnteros = new ArrayList<>();

        listEnteros.add(1);
        listEnteros.add(2);
        listEnteros.add(3);
        listEnteros.add(4);
        listEnteros.add(5);
        listEnteros.add(6);
        listEnteros.add(7);
        listEnteros.add(8);
        listEnteros.add(9);
        listEnteros.add(10);

        System.out.println("El numero aletorio es " + numeroRandom);
        System.out.println("------------------------------");
        System.out.println("Metodo de busqueda Lineal");
        metodoLineal();
        System.out.println("------------------------------");
        System.out.println("Metodo de busqueda binaria");
        metodoBinario();

    }
    public static void metodoLineal(){
        
        //buscamos el numero y si encuentra uno igual lo imprime
        for (int numeroLista : listEnteros) {
            if (numeroLista == numeroRandom){
                System.out.println("El numero seleccionado es : " + numeroLista);
            }
        }
       
    }

    public static void metodoBinario(){


        //Aqui realizamos la declaracion de las variables y tambien las definimos
        int primero, centro, ultimo, valorCentral;

        primero= 0;

        ultimo = listEnteros.size()-1;

        while (true){
            //hubicamos el centro de la lista
            centro = (primero + ultimo)/2;

            valorCentral = listEnteros.get(centro);

            System.out.println("Comparando " + numeroRandom + " y " + valorCentral);

            if (numeroRandom == valorCentral){
                System.out.println("El numero seleccionado es: " + valorCentral);
                break;
            }
            else if (numeroRandom < valorCentral){
                ultimo = centro - 1;
            }else{
                primero = centro + 1;
            }
        }
    }
}

