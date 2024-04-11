/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transportes;

/**
 *
 * @author carlo
 */
public class Transportes {

    public static void main(String[] args) {
        //Crear un vehiculo terrestre
        
        VehiculoTerrestre vehiculoTerrestre=new VehiculoTerrestre("Toyota","Carolla",4);
        VehiculoAcuatico vehiculoAcuatico=new VehiculoAcuatico("Lancha","Yamaha","Motor de gas");
        VehiculoEspacial vehiculoEspacial=new VehiculoEspacial("Cohete","Nasa","Motor de propulsores");
        VehiculoAereo vehiculoAereo=new VehiculoAereo("Airbus","Viajes",2);
        
        //Mostrar informacion de los vehiculos
        System.out.println("Informacion de vehiculo terrestre");
        vehiculoTerrestre.mostrarInfo();
        
        System.out.println("Informacion de vehiculo acuatico");
        vehiculoAcuatico.mostrarInfo();
        
         System.out.println("Informacion de vehiculo espacial");
        vehiculoEspacial.mostrarInfo();
        
         System.out.println("Informacion de vehiculo aereo");
        vehiculoAereo.mostrarInfo();
        
        }
}
