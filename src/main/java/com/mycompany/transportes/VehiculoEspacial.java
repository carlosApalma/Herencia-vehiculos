/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportes;

/**
 *
 * @author carlo
 */
public class VehiculoEspacial extends Vehiculo{
   private String Turbina;
   
   public VehiculoEspacial(String marca, String modelo, String Turbina){
       super(marca,modelo);
       this.Turbina=Turbina;
   }
public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("Modelo de turbina: "+Turbina);
}
}
