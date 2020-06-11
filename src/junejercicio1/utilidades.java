/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junejercicio1;

import java.util.ArrayList;

/**
 *
 * @author ANDRESLF
 */
public class utilidades {
      public static String concatenar(ArrayList <String> textos){
        String cadena="";
        StringBuilder sb= new StringBuilder();
        for (String palabra:textos){
            sb.append(palabra);
           }
        cadena=sb.toString();
        return cadena;
    }
    public static double sumar(double []  datos){
        double suma=0;
        for (int i = 0; i < datos.length; i++) {
            suma+=datos[i];
           }
        return suma;
    }
}
