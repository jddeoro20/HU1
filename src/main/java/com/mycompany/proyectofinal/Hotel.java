/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author Jesus
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
        private List<Habitacion> listaHabitaciones = new ArrayList<>();
        private Scanner in = new Scanner (System.in);
        
        public void tipoHabitacion(){
            int opcion = 0;
            boolean salir = false;
            do{
                System.out.println("Menu tipo habitaciones");
                System.out.println("Opcion 1 - Habitacion pequeña");
                System.out.println("Opcion 2 - Habitacion mediana");
                System.out.println("Opcion 3 - Habitacion grande");
                System.out.println("Escoja una opcion: ");
                opcion = in.nextInt();
                switch (opcion) {
                    case 1: seleccion(50000, "pequeña");
                            break;
                    case 2: seleccion(70000,"mediana");
                            break;
                    case 3: seleccion(100000, "grande");
                            break;
                }
                System.out.println("¿Desea realizar otra reserva? S/N");
                String estado = in.next().toUpperCase();
                if (!estado.contentEquals("S")) {
                        salir = true;
                }
            }while (!salir);
        }
       
        
        public void seleccion(int precio, String referencia) {
            System.out.println("digite el numero de personas: ");
            int cantidad = in.nextInt();
            Persona[] lista = new Persona[cantidad];
            for (int i = 0; i < lista.length; i++) {
                    System.out.println("Nombre: ");
                    String nombre = in.next();
                    System.out.println("Apellido: ");
                    String apellido = in.next();
                    System.out.println("Identificacion: ");
                    int id = in.nextInt();
                    System.out.println("Edad: ");
                    int edad = in.nextInt();
                    System.out.println("Fecha de Check In(dd/mm): ");
                    String checkIn = in.next();
                    System.out.println("Fecha de Check Out(dd/mm): ");
                    String checkOut = in.next();
                    lista[i] = new Persona(nombre, apellido, id, edad, checkIn, checkOut);
        }
            listaHabitaciones.add(new Habitacion(referencia, precio, lista));
            
            
            for (Habitacion habitacion : listaHabitaciones){
                System.out.println(habitacion);
            }
        }
}
