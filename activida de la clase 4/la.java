/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicion_condicional_remek;

import java.util.Scanner;

/**
 *
 * @author Sala de Sistemas 4
 */
public class la {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //variable
        int edad,sexo;
        //entrada
        System.out.println("Escriba su nombre:");
        entrada.nextLine();
        System.out.println("Escriba su apellido:");
        entrada.nextLine();
        System.out.println("Indique su edad.");
        edad = entrada.nextInt();
        System.out.println("Indique su genero mediante los numeros:\n1 para el masculino. \n2 para el femenino.");
        sexo = entrada.nextInt();
        //condicion
        if(sexo > 0 && sexo <=3){
            if(sexo == 1){
                System.out.println("Es usted un Hombre.");
            }
            else{
                System.out.println("Es usted una Mujer.");
            }
        }
        else{
            System.out.println("Usted no a indicado su genero.");
        }
        if(edad > 0 && edad <= 17){
            System.out.println("Es usted menor de edad.");
        }
        else{
            System.out.println("Es usted mayor de edad.");
        }
        
        
    }
}
