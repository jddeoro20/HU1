/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author Jesus
 */
public class Persona {
        private String nombre;
        private String apellido;
        private int id;
        private int edad;
        private String checkIn;
        private String checkOut;
       
       
        
        
        public Persona(String nombre, String apellido, int id, int edad, String checkIn, String checkOut) {
                super();
                this.nombre = nombre;
                this.apellido = apellido;
                this.id = id;
                this.edad = edad;
                this.checkIn = checkIn;
                this.checkOut = checkOut;
                
        }

   
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
    public String getApellido() {
        return apellido;
    }

   
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


   
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public int getEdad() {
        return edad;
    }

    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getCheckIn() {
        return checkIn;
    }

   
    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }
    
     public String getCheckOut() {
        return checkOut;
    }

    
    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }
    
     @Override
    public String toString() {
        return "\nHuesped: [Nombre: " + nombre + apellido + ", documento: " + id + ", edad: " + edad + ", fecha de Check In: " + checkIn + "fecha de Check Out: " + checkOut; 
}
}

