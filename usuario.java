/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
class usuario {
    
    private String nombre_completo;
    private String nickname;
    private String clave;
    private String sexo;
    private String fecha_de_creacion;
    private Map <String, String> datos;
    
    public usuario(String nombre_completo, String nickname, String clave, String sexo, String fecha_de_creacion){
        this.nombre_completo = nombre_completo;
        this.nickname = nickname;
        this.clave = clave;
        this.sexo = sexo;
        this.fecha_de_creacion = fecha_de_creacion;
        this.datos = new HashMap<>();
        datos.put("nombre_completo", nombre_completo);
        datos.put("nickname", nickname);
        datos.put("clave", clave);
        datos.put("sexo", sexo);
        datos.put("fecha_de_creacion", fecha_de_creacion);
    }

    /**
     * @return the nombre_completo
     */
    public String getNombre_completo() {
        return nombre_completo;
    }

    /**
     * @param nombre_completo the nombre_completo to set
     */
    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    /**
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the fecha_de_creacion
     */
    public String getFecha_de_creacion() {
        return fecha_de_creacion;
    }

    /**
     * @param fecha_de_creacion the fecha_de_creacion to set
     */
    public void setFecha_de_creacion(String fecha_de_creacion) {
        this.fecha_de_creacion = fecha_de_creacion;
    }

    /**
     * @return the datos
     */
    public Map <String, String> getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(Map <String, String> datos) {
        this.datos = datos;
    }
     public String buscarDato(String key) {
        return getDatos().get(key);
    }

    public void eliminarDato(String key) {
        getDatos().remove(key);
    }
    @Override
    public String toString() {
        return "Usuario{" + "nombre='" + getNombre_completo() + '\'' +",nickname='" + getNickname() + '\'' +",clave='" + getClave() + '\'' +",tipo='" + getSexo() + '\'' +",creado el='" + getFecha_de_creacion() + '\'' +'}';
    }

    
    public static void main(String[] args){
        Map<String, usuario> usuarios = new HashMap<>();
        Scanner entrada = new Scanner(System.in);
        boolean x = true;
        while(x){
            System.out.println("Menú de Opciones:");
            System.out.println("1. Agregar Usuario");
            System.out.println("2. Buscar Usuario");
            System.out.println("3. Eliminar Usuario");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int op = entrada.nextInt();
            entrada.nextLine();
            switch (op) {
                case 1:
                   System.out.print("Nombre Completo:");
                     String nombre_completo = entrada.nextLin();
                    
                   System.out.print("Nickname:");
                     String nickname = entrada.nextLine();
                    
                   System.out.print("Clave:");
                     String clave = entrada.nextLine();
                    
                   System.out.print("Genero:");
                     String sexo = entrada.nextLine();
                    
                   System.out.print("Fecha de Creación:");
                     String fecha_creacion = entrada.nextLine();

                    usuario usuario = new usuario(nombre_completo, nickname, clave, sexo, fecha_creacion);
                    usuarios.put(nickname, usuario);
                    System.out.println("Usuario agregado exitosamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el nickname del usuario a buscar: ");
                    nickname = entrada.next();
                    usuario = usuarios.get(nickname);
                    if (usuario != null) {
                       System.out.println("Usuario encontrado: " + usuario);
                    } 
                    else {
                     System.out.println("Usuario no encontrado.");
                   }
                    break;
                case 3:
                    System.out.print("Ingrese el nickname del usuario a eliminar: ");
                    nickname = entrada.next();
                    usuario = usuarios.remove(nickname);
                    if (usuario != null) {
                      System.out.println("Usuario eliminado exitosamente.");
                    } 
                    else {
                     System.out.println("Usuario no encontrado.");
                   }
                    break;
                case 4:
                    x = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
       }
     }
    }
}