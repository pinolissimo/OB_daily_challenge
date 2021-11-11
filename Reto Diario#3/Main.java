/*
Open Boot Camp 2021
Reto del Día #3
BootCamper: Giuseppe Allocca aka "Pino" ;)

- Lenguaje: Java
- IDE recomendado: IntelliJ
- Nivel: Inicial
- Enunciado: Dada una cadena de texto (String) con el nombre completo de una persona,
             debes crear un método que devuelva 3 campos: nombre, apellido1, apellido2.
             Debes tener en cuenta que hay nombres compuestos y que puedes recibir un
             nombre completo sin apellido2 o sin ningún apellido.

Ejemplos: José Martínez Pérez -> nombre: José, apellido1: Martínez, apellido2: Pérez.
                   José María Martínez -> nombre: José María, apellido1: Martínez
                   José -> nombre: José

- Consideraciones: Deberías tener los nombres de pila en un array o fichero,
                   para poder diferenciar entre un nombre de pila y un apellido.

 */
package com.OpenBootCampJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // variables and Arrays
        String name1 = "";
        String name2 = "";
        String surname1 = "";
        String surname2 = "";
        String fullName = ""; // user´s input
        String[] arraysNames = {
                "andrea",
                "anna",
                "giuseppe",
                "josé",
                "maria",
                "antonella",
                "chiara",
                "álex",
                "giada",
                "elisa",
                "corinne",
                "ciro",
                "lucia",
                "pino",
                "maría"
        };
        int nElements = 0;
        int namesQuantity = 0;
        int surnames = 0;
        // Input from User by Keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println("<<< Hello!>>> :)");
        System.out.println("· Please insert your first and last name. ");
        System.out.println("· The Max Value is #2 names and #2 surnames.");
        System.out.print("Write here! : ");
        fullName = keyboard.nextLine();
        fullName = fullName.toLowerCase();
        System.out.println();
        // split del fullname in array elements[]
        String[] elements = fullName.split(" ");
        nElements = elements.length;
        System.out.println();
        System.out.println("· Your name produced this result: [" + nElements + " Elements]");
        // Search for similar values
          System.out.println();
        //first loop in elements[]
        for (int i = 0; i < nElements; i++) {
            //Second loop in arrayNames[]
            for (int l = 0; l < arraysNames.length; l++) {
                //Search and compare
                if (elements[i].equals(arraysNames[l])) {

                    if (namesQuantity==0){name1=arraysNames[l];}else{name2=arraysNames[l];}

                    //update the counter
                    namesQuantity = namesQuantity + 1;

                }//end of if loop

            } // end of second loop

        } //end of first loop
        System.out.println("Names found: [" + namesQuantity+"]");
        surnames = nElements - namesQuantity;
        System.out.println("Surnames found : [" + surnames+"]");
        //assign the correct values to the fields
        if(surnames==2&&namesQuantity==1){surname1=elements[1];surname2=elements[2];}
        if(surnames==2&&namesQuantity==2){surname1=elements[2];surname2=elements[3];}
        if(surnames==1&&namesQuantity==1){surname1=elements[1];}
        if(surnames==1&&namesQuantity==2){surname1=elements[2];}
        // Show the Results on console
        System.out.println("__________________________________________________");
        System.out.println(" Final Results: Name 1="+name1+"     name2="+name2);
        System.out.println(" Final Results: Surname 1="+surname1+"     Surname 2="+surname2);
        System.out.println();
        System.out.println("Thank You "+fullName+"! ;)");
        System.out.println();
            }
}