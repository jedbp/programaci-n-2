/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Usuario
 */
public class lista {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        //
        int ob;
        System.out.println("quien es usted:");
        String persona = entrada.next();
        System.out.println("Que desea hacer: \n1.Ver lista. \n2.Eliminar nombre de la lista. \n3.Buscar a...");
        ob = entrada.nextInt();
        
        ArrayList <String> persona1 = new ArrayList();
        persona1.add("juan");
        persona1.add("diego");
        persona1.add("salazar");
        persona1.add(persona);
        
        switch(ob){
            case 1:
                Collections.sort(persona1);
                System.out.println("Todos los que han ingresado son:"+persona1);
                break;
            case 2:
                persona1.remove(3);
                System.out.println(persona1+"\nSu nombre a sido eliminado con exito.");
                break;
            case 3:
                System.out.println("Usted esta buscando a:");
                String persona2 = entrada.next();
                System.out.println("¿La persona que busca se encuentra aqui?:"+persona1.contains(persona2));
                break;
        }
    }
}
