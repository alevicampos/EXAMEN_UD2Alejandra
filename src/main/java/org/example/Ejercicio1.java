package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public void ejercicio1(){
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Acabo de pensar un número del [0-100]... ¿puedes adivinarlo? ¡Tienes 10 intentos!");

        int numero = random.nextInt(100)+1;
        int numeroUsuario = 0;


        for (int i= 1; i <= 10; i++){

                try {
                    System.out.println("Intento " + i + ": Introduce un número:");
                    numeroUsuario = entrada.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("Tienes que introducir un número." + e.getMessage());
                    entrada.nextLine();
                }

                if (numeroUsuario > numero) {
                    System.out.println("Tu número es mayor al que he pensado");

                } else if (numeroUsuario < numero) {
                    System.out.println("Tu número es menor al que he pensado");

                } else {
                    System.out.println("HAS ACERTADO! El número era " + numero);
                    break;
                }
            }

        System.out.println("Ohhhh!! has perdidoooo");

    }
}
