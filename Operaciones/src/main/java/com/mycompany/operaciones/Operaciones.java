/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operaciones;

import java.util.Scanner;

/**
 *
 * @author PREDATOR
 */
public class Operaciones {

    public static void main(String[] args) {
        System.out.println("Tipos de operaciones: ");
        Calculos calculo = new Calculos("Suma", "Resta", "Division", "Multiplicacion", "Factorial", "Potencia", "Raiz");
        System.out.println(calculo.getAtributos());
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int valor1;
        int valor2;
        
         System.out.println("Ingrese el valor 1: ");
         valor1 = sc.nextInt();
         System.out.println("Ingrese el valor 2: ");
         valor2 = sc2.nextInt();
         
        
        Sumar(valor1,valor2);
        System.out.println(" *** ");
        Restar(valor1,valor2);
        System.out.println(" *** ");
        Dividir(valor1,valor2);
        System.out.println(" *** ");
        Residuo(valor1,valor2);
        System.out.println(" *** ");
        Raiz(valor1, valor2);
        System.out.println(" *** ");
        Potencia(valor1, valor2);
        System.out.println(" *** ");
        Multiplicar(valor1,valor2);
    }
public static void Sumar(int valor1, int valor2){
   
    int suma;
    suma = valor1 + valor2;
    System.out.println("La suma es "+ suma);
}
public static void Restar(int valor1, int valor2){
    int resta;
    resta = valor1 - valor2;
    System.out.println("La resta es: "+ resta);
}
public static void Multiplicar(int valor1, int valor2){
    Scanner sc5 = new Scanner(System.in);
    Scanner sc6 = new Scanner(System.in);
        System.out.print("Introduce la cantidad de lineas a multplicar para el valor 1: ");                                                         
        int linea1 = sc5.nextInt();
        System.out.println("Tabla del " + valor1);
        for(int i = 1; i<=linea1; i++){
             System.out.println(valor1 + " * " + i + " = " + valor1*i);                                                     
        }
        System.out.print("Introduce la cantidad de lineas a multplicar para el valor 2: ");                                                         
        int linea2 = sc6.nextInt();
        System.out.println("Tabla del " + valor2);
        for(int i = 1; i<=linea2; i++){
             System.out.println(valor2 + " * " + i + " = " + valor2*i);                                                     
        }
}
public static void Dividir(int valor1, int valor2){
    int Dividir;
    Dividir = valor1 / valor2;
    System.out.println("La división es "+ Dividir);
}
public static void Residuo(int valor1, int valor2){
    int residuo;
    residuo = valor1 % valor2;
    System.out.println("El residuo de "+ valor1 + " % "+ valor2 + " es " + residuo);
    
}
public static void Raiz(int valor1, int valor2){
   double raiz1 = Math.sqrt(valor1);
   System.out.println("La raíz del valor 1 es: "+ raiz1);
   double raiz2 = Math.sqrt(valor2);
   System.out.println("La raíz del valor 2 es: "+ raiz2);
} 

public static void Potencia(int valor1, int valor2){
   Scanner sc3 = new Scanner(System.in);
   Scanner sc4 = new Scanner(System.in);
   double potencia;
   double potencia2;
   System.out.println("Ingrese la potencia para el valor 1: ");
   int exponente = sc3.nextInt();
   System.out.println("Ingrese la potencia para el valor 2: ");
   int exponente2 = sc4.nextInt();
   potencia = Math.pow(valor1, exponente);
   System.out.println("El resultado de la potencia del valor 1 es: "+ potencia);
   potencia2 = Math.pow(valor2, exponente2);
   System.out.println("El resultado de la potencia del valor 2 es: "+ potencia2);
}  
 
}

