/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoracomplejos;
import java.util.Scanner;
/**
 *
 * @author rojas
 */
public class CalculadoraComplejos {
    private double real;
    private double imag;

    public CalculadoraComplejos(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static CalculadoraComplejos suma(CalculadoraComplejos c1, CalculadoraComplejos c2) {
        double sumaReal = c1.real + c2.real;
        double sumaImag = c1.imag + c2.imag;
        return new CalculadoraComplejos(sumaReal, sumaImag);
    }

    public static CalculadoraComplejos resta(CalculadoraComplejos c1, CalculadoraComplejos c2) {
        double restaReal = c1.real - c2.real;
        double restaImag = c1.imag - c2.imag;
        return new CalculadoraComplejos(restaReal, restaImag);
    }

    public static CalculadoraComplejos multiplicacion(CalculadoraComplejos c1, CalculadoraComplejos c2) {
        double multReal = c1.real * c2.real - c1.imag * c2.imag;
        double multImag = c1.real * c2.imag + c1.imag * c2.real;
        return new CalculadoraComplejos(multReal, multImag);
    }

    public static CalculadoraComplejos division(CalculadoraComplejos c1, CalculadoraComplejos c2) {
        double divisor = c2.real * c2.real + c2.imag * c2.imag;
        double divReal = (c1.real * c2.real + c1.imag * c2.imag) / divisor;
        double divImag = (c1.imag * c2.real - c1.real * c2.imag) / divisor;
        return new CalculadoraComplejos(divReal, divImag);
    }

    @Override
    public String toString() {
        if (imag < 0) {
            return String.format("%.2f - %.2fi", real, -imag);
        } else {
            return String.format("%.2f + %.2fi", real, imag);
        }
    }
    
    public static void main(String[] args) {
        
        
        
        CalculadoraComplejos suma;  
        CalculadoraComplejos resta;
        CalculadoraComplejos mult;
        CalculadoraComplejos div;
        
        Scanner tcn= new Scanner(System.in);
        
        int op;
        double real,imag;
        
        System.out.println("De el valor real del numero complejo 1: ");
        real=tcn.nextDouble();
        System.out.println("De el valor complejo del numero complejo 1: ");
        imag=tcn.nextDouble();
        CalculadoraComplejos c1 = new CalculadoraComplejos(real,imag);
        
        System.out.println("De el valor real del numero complejo 2: ");
        real=tcn.nextDouble();
        System.out.println("De el valor complejo del numero complejo 2: ");
        imag=tcn.nextDouble();
        CalculadoraComplejos c2 = new CalculadoraComplejos(real,imag);
        
        
        System.out.println("Nunmero complejo 1: "+c1);
        System.out.println("Numero complejo 2: "+c2);
        
        
        op=CalculadoraComplejos.menu();
        
        switch(op){
            
            case 1:
                System.out.println("La suma es: " + CalculadoraComplejos.suma(c1, c2));
                break;
            case 2:
                System.out.println("La resta es: " + CalculadoraComplejos.resta(c1, c2));
                break;
            case 3:
                System.out.println("La multiplicación es: " + CalculadoraComplejos.multiplicacion(c1, c2));
                break;
            case 4:
                
                System.out.println("La división es: " + CalculadoraComplejos.division(c1, c2));
                break;
            default:
                System.out.println("No eligio ninguna opcion");
        }
    }
    
    public static int menu(){
        int op;
        Scanner tcn= new Scanner(System.in);
                
        System.out.println("Que desea hacer: ");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        
        op=tcn.nextInt();
        
        return op;
    }
    
    
    
}

