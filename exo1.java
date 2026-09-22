/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exo1;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author noeba
 */
public class Exo1 {

    public static void main(String[] args) {
        //initialisation variables, attributions
        int operateur1, operateur2;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Enter a first number :");
        //saisie sécurisée
        operateur1 = sc.nextInt();
        System.out.println("Enter a second number :");
        operateur2 = sc.nextInt();
        System.out.println("Enter 0 for addition\n Enter 1 for soustraction \n Enter 2 for division \n Enter 3 for multiplication");
        int operation = sc.nextInt();
        //switch case + error division by 0
        switch(operation){
            case 0 -> System.out.println("Result: " + (operateur1 + operateur2));
            case 1 -> System.out.println("Result: " + (operateur1 - operateur2));
            case 2 -> {
                if (operateur2 != 0) {
                    System.out.println("Result: " + ((double) operateur1 / operateur2));
                } else {
                    System.out.println("Error: Division by zero");
                }
            }
            case 3 -> System.out.println("Result: " + (operateur1 * operateur2));
            default -> System.out.println("Invalid operation choice");
            
        }
        sc.close();
    }
}
