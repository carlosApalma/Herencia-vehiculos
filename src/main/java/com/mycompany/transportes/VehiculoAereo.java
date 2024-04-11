/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportes;

/**
 *
 * @author carlo
 */
public class VehiculoAereo extends Vehiculo {
    private int numAlas;
    
    public VehiculoAereo (String marca, String modelo, int numAlas){
        super(marca,modelo);
        this.numAlas=numAlas;
    }

public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("Numero de alas: "+numAlas);
}
}
