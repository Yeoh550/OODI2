/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eorderingsystem;

import ClothesOrderingSystem_CA24082.ClothesOrderingSystem;
import java.util.Scanner;

/**
 *
 * @author Seng Ren
 */
public class EOrderingSystem {

    public static void main(String[] args) {
        int choiceSystem = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-------------------------E-ORDERING SYSTEM-------------------------");
        System.out.println("Please choose which System that you needed: ");
        System.out.println("1) Clothes Ordering System");
        System.out.println("2) Beauty Products Ordering System");
        System.out.println("3) Movie Ticketing System");
        System.out.println("Enter (1, 2 or 3): ");
        choiceSystem = sc.nextInt();
        sc.nextLine();
        switch(choiceSystem){
            case 1:
                ClothesOrderingSystem.main(new String[]{});
                break;
            case 2:
                break;
            case 3:
                break;
        }
        
    }
}
