/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operaciones;

/**
 *
 * @author PREDATOR
 */
public class Calculos {
    String suma;
    String resta;
    String multiplicacion;
    String division;
    String factorial;
    String potencia;
    String raiz;

    public Calculos(String suma, String resta, String multiplicacion, String division, String factorial, String potencia, String raiz) {
        this.suma = suma;
        this.resta = resta;
        this.multiplicacion = multiplicacion;
        this.division = division;
        this.factorial = factorial;
        this.potencia = potencia;
        this.raiz = raiz;
    }

    public String getSuma() {
        return suma;
    }

    public void setSuma(String suma) {
        this.suma = suma;
    }

    public String getResta() {
        return resta;
    }

    public void setResta(String resta) {
        this.resta = resta;
    }

    public String getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(String multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getFactorial() {
        return factorial;
    }

    public void setFactorial(String factorial) {
        this.factorial = factorial;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getRaiz() {
        return raiz;
    }

    public void setRaiz(String raiz) {
        this.raiz = raiz;
    }
    
    public String getAtributos(){
        return this.suma+ "\n" + 
                this.resta + "\n" +
                this.multiplicacion + "\n" +
                this.division + "\n" +
                this.factorial + "\n" +
                this.potencia + "\n" +
                this.raiz + "\n";
    }
    
    

    
    
    
}
