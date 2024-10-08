/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_de_mantenimiento;

import Mantenimiento.Mantenimiento;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tracs
 */
public class Proyecto_de_Mantenimiento {

    public static void main(String[] args) {
        List<Mantenimiento>  Registro = new ArrayList();
        
        System.out.println("------------------Bienvenido---------------------");
        
        boolean salir = true;
        int opcion;
        Scanner teclado = new Scanner(System.in);
        String nombre,id,descri;
        
        while (salir) {      
            System.out.println("--------Menu----------");
            System.out.println("1. Ingreso ");
            System.out.println("2. Mostrar");
            System.out.println("3. Eliminar");
            System.out.println("4. Modificar");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("ingresa la opcion que desee realizar");
            
            
            
            if(teclado.hasNextInt()){ // Verifica si el siguiente valor es un número entero
                
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("");
                        System.out.println("Ingrese nombre del usuario");
                        teclado.nextLine();
                        nombre = teclado.nextLine();
                        System.out.println("Ingrese id del usuario");
                        id = teclado.nextLine();
                        System.out.println("Ingrese la descripcion de problema");
                        descri = teclado.nextLine();
                        
                        Mantenimiento nuevoIngreso = new Mantenimiento(nombre, id, descri);
                        
                        Registro.add(nuevoIngreso);
                        
                        System.out.println("INGRESO EXITO ..........");                        
                        break;
                    case 2:
                        for (Mantenimiento regi : Registro) {
                            System.out.println(regi.toString()+"|");                            
                        }

                        break;
                    case 3:
                        
                        Mantenimiento elemento_eliminar = null;
                        System.out.println("Ingrese el id que desea eliminar");
                        teclado.nextLine();
                        id = teclado.nextLine();
                        for (Mantenimiento regi : Registro) {
                            if(regi.getId_maquina().equalsIgnoreCase(id)){
                                elemento_eliminar = regi;
                                break;
                            }                            
                        }
                        
                        if (elemento_eliminar!=null) {
                            Registro.remove(elemento_eliminar);
                            System.out.println("EL elemento ha sido eliminado!!!");
                        } else {
                            System.out.println("No se encontro el elemento!!!");
                        }

                        break;
                    case 4:
                        
                        Mantenimiento elemento_modificar = null;
                        System.out.println("Ingrese el id que desea modificar");
                        teclado.nextLine();
                        id = teclado.nextLine();
                        for (Mantenimiento regi : Registro) {
                            if(regi.getId_maquina().equalsIgnoreCase(id)){
                                elemento_modificar = regi;
                                break;
                            }                            
                        }
                        
                        if (elemento_modificar!=null) {
                            System.out.println("ingrese la nueva descripcion:");
                            descri = teclado.nextLine();
                            elemento_modificar.setDescripcion(descri);
                            System.out.println("EL elemento ha sido modificado!!!");
                        } else {
                            System.out.println("No se encontro el elemento!!!");
                        }

                        break;
                    case 5:
                        salir = false;
                        System.out.println("");
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("OPCION NO VALIDA!!! por favor, selecciona una opción del 1 al 5.");
                }

            }
            else {
                System.out.println("Error: Ingresa un número válido!");
                teclado.next(); // Limpia el valor ingresado no numérico
            }
        }
        
        teclado.close();
        
    }
}
