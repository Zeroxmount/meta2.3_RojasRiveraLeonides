/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dado;
import java.util.Random;
/**
 *
 * @author rojas
 */

public class Dado {

    private int lados;
    private Random random;

    public Dado(int lados) {
        if (lados != 6 && lados != 12) {
            throw new IllegalArgumentException("El número de lados debe ser 6 o 12.");
        }
        this.lados = lados;
        this.random = new Random();
    }

    public int lanzar() {
        return random.nextInt(lados) + 1;
    }

    public static void main(String[] args) {
        Dado[] dados = new Dado[5];
        dados[0] = new Dado(6);
        dados[1] = new Dado(6);
        dados[2] = new Dado(6);
        dados[3] = new Dado(12);
        dados[4] = new Dado(12);

        int[] resultados = new int[5];
        for (int i = 0; i < 5; i++) {
            resultados[i] = dados[i].lanzar();
            System.out.println("Dado " + (i+1) + ": " + resultados[i]);
        }
    }
}

    
