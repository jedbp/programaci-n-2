/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class persona {
    
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Edad;
    private static List<String> lista = new ArrayList<>();
    
    public persona(String nombre, String Apellido, String Direccion, String Edad){
        
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.Edad = Edad;
        
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the Edad
     */
    public String getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    /**
     * @return the datos
     */
    public List<String> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setDatos(List<String> lista) {
        this.lista = lista;
    }

     public static void agregar(String Nombre, String Apellido, String Direccion, String Edad) {
        lista.add(Nombre + " " + Apellido + ", " + Direccion + ", " + Edad + ".");
    }
     public static void ListaPersonas() {
     for (String persona : lista) {
        System.out.println(persona);
     }
    }
    public static String obtenerLista() {
    StringBuilder sb = new StringBuilder();
    for (String persona : lista) {
        sb.append(persona).append("\n");
    }
    return sb.toString();
} 
}