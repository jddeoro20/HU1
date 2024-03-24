/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author Jesus
 */
import java.util.Arrays;

public class Habitacion {
        private String referencia;
        private int precio;
        private Persona[]listaPersonas;
        
         
        public Habitacion(String referencia, int precio, Persona[]listaPersonas){
                super();
                this.referencia = referencia;
                this.precio = precio;
                this.listaPersonas = listaPersonas;
               
        }

    
    public String getReferencia() {
        return referencia;
    }

   
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    
    public int getPrecio() {
        return precio;
    }

   
    public void setPrecio(int precio) {
        this.precio = precio;
    }

   
    public Persona[] getListaPersonas() {
        return listaPersonas;
    }

    
    public void setListaPersonas(Persona[] listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
    
 

      
    @Override
    public String toString() {
        return "\nHabitacion: [ Referencia habitacion: " + referencia + ", precio: " + precio + "]" + "\nDatos: " + Arrays.toString(listaPersonas);
    }

   
   
   
}
