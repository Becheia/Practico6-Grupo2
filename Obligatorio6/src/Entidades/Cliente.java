/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author estudiante
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String ciudad;
    private String dni;
    private String direccion;
    public Cliente(String nombre, String apellido, String ciudad, String dni,String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.dni = dni;
        this.direccion=direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente:" + nombre + " " + apellido + ", Ciudad: " + ciudad + ", DNI: " + dni + '\n';
    }
    
   
}
