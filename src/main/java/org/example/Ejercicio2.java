package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Ejercicio2 {
    public void ejercicio2(){
        LocalDateTime fecha = LocalDateTime.now();
        int anyoActual = fecha.getYear();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige un año:");
        int anyoUsuario = entrada.nextInt();
        int anyoBisiesto=0;
        int anyoBisiestoCuatro=0;

        for (int i = anyoUsuario; i<=anyoActual; i++ ){
            if (i%100 == 0 && i%400 ==0 ){
                anyoBisiesto ++;
            }
            if (i%4==0 && i %100!= 0){
               anyoBisiesto++;
            }

        }

        System.out.println("Han habido " + anyoBisiesto+ " años bisiestos." );

    }
}
