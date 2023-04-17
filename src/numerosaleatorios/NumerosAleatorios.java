/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosaleatorios;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Random;
/**
 *
 * @author rojas
 */


public class NumerosAleatorios {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = generarNumerosAleatorios();
        System.out.println("Números aleatorios: " + numeros);
        System.out.println("");
        System.out.println("Con HashSet: ");
        contarRepeticionesHashSet(numeros);
        System.out.println("");
        System.out.println("Con Hashmap: ");
        contarRepeticionesHashMap(numeros);
    }

    public static ArrayList<Integer> generarNumerosAleatorios() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = rnd.nextInt(12);
            numeros.add(numeroAleatorio);
        }
        return numeros;
    }

    public static void contarRepeticionesHashSet(ArrayList<Integer> numeros) {
        HashSet<Integer> conjuntoNumeros = new HashSet<Integer>(numeros);
        for (Integer numero : conjuntoNumeros) {
            int repeticiones = contarRepeticiones(numero, numeros);
            System.out.println("El número " + numero + " se repite " + repeticiones + " veces.");
        }
    }

    public static void contarRepeticionesHashMap(ArrayList<Integer> numeros) {
        HashMap<Integer, Integer> mapaNumeros = new HashMap<Integer, Integer>();
        for (int i = 0; i < numeros.size(); i++) {
            int numero = numeros.get(i);
            if (mapaNumeros.containsKey(numero)) {
                int repeticiones = mapaNumeros.get(numero) + 1;
                mapaNumeros.put(numero, repeticiones);
            } else {
                mapaNumeros.put(numero, 1);
            }
        }
        for (Integer numero : mapaNumeros.keySet()) {
            int repeticiones = mapaNumeros.get(numero);
            System.out.println("El número " + numero + " se repite " + repeticiones + " veces.");
        }
    }

    public static int contarRepeticiones(int numero, ArrayList<Integer> numeros) {
        int repeticiones = 0;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == numero) {
                repeticiones++;
            }
        }
        return repeticiones;
    }

}

