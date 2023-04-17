/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baraja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author rojas
 */
public class Baraja {

    /**
     * @param args the command line arguments
     */
    private ArrayList<Carta> mazo;

  public Baraja() {
    this.mazo = new ArrayList<>();
    inicializa();
  }

  private void inicializa() {
    for (Figura f: Figura.values()) {
      for( int v= 1 ; v <= 13 ; v++) {
        try {
          mazo.add(new Carta(v,f));
        } catch (FueraDeRangoException e) {
          System.out.println(e);
        }
      }
    }
  }

  public void barajar() {
    Collections.shuffle(mazo);
  }

  public ArrayList<Carta> repartir(int n) {
    ArrayList<Carta> mano = new ArrayList<>();
    for(int i=1; i<=n; i++) {
      mano.add(mazo.remove(0));
    }
    return mano;
  }
  
  public Carta sacarCarta() {
        
      Random random= new Random();
      
      if (mazo.size() > 0) {
            int index = random.nextInt(mazo.size());
            Carta carta = mazo.get(index);
            mazo.remove(index);
            return carta;
        } else {
            return null;
        }
    }
  
  
    public static void main(String[] args) {
        
        Baraja baraja= new Baraja();
        
        System.out.println(baraja.toString());
        System.out.println("\n");
        System.out.println(baraja.sacarCarta());
        System.out.println("\n");
        System.out.println(baraja.toString());
        
        
        
        
    }
  
  
  

  @Override
  public String toString() {
    StringBuffer mazoStr = new StringBuffer();
    for (Carta c : mazo) {
      mazoStr.append(c.toString()+"\n");
    }
    return mazoStr.toString();
  }
    
}
