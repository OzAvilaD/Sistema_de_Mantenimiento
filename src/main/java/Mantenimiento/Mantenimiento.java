/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mantenimiento;

/**
 *
 * @author tracs
 */
public class Mantenimiento {
    
    private String nombre;
    private String id_maquina;
    private String descripcion;

    public Mantenimiento() {
    }

    public Mantenimiento(String nombre, String id_maquina, String descripcion) {
        this.nombre = nombre;
        this.id_maquina = id_maquina;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId_maquina() {
        return id_maquina;
    }

    public void setId_maquina(String id_maquina) {
        this.id_maquina = id_maquina;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Registro{" + "| nombre=" + nombre + " | id_maquina=" + id_maquina + ", | descripcion=" + descripcion + '}';
    }
    
    
    
    
    
    
}
