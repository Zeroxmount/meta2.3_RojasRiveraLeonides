/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moneda;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author rojas
 */


public class Moneda {
    private String valor;
    private ArrayList<String> resultadosAnteriores;
    
    public Moneda() {
        resultadosAnteriores = new ArrayList<>();
        lanzar();
    }
    
    public void lanzar() {
        Random random = new Random();
        int resultado = random.nextInt(2);
        if(resultado == 0) {
            valor = "cara";
        } else {
            valor = "cruz";
        }
        resultadosAnteriores.add(valor);
    }
    
    public String getValor() {
        return valor;
    }
    
    public ArrayList<String> getResultadosAnteriores() {
        return resultadosAnteriores;
    }
    
    public static void main(String[] args) {
        Moneda moneda = new Moneda();
        Scanner tcn = new Scanner(System.in);
        int op;
        do{
            
            System.out.println("La cara que salio es: "+moneda.getValor());
            System.out.println("Desea volver a interntar? \n0) Si\n1)no");
            
            op=tcn.nextInt();
            
        }while(op!=1);
        
        System.out.println("Lista de tiradas: ");
        
        for (int i = 0; i < moneda.getResultadosAnteriores().size(); i++) {
            
            System.out.println("Moneda "+i+1+" salio "+moneda.getResultadosAnteriores().get(i).toString());
            
        }
        
        
        
    }
    
    
}

