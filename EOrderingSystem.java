/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eorderingsystem;

import java.util.Scanner;

/**
 *
 * @author Seng Ren
 */
public class EOrderingSystem {

    public static void main(String[] args) {
        int chooseOption = 0;
        boolean chooseOptionGate = true;
        int signUpPerson = 0;
        boolean signUpGate = true;
        String name = null;
        String password = null;
        String username = null;
        String email = null;
        String confirmPassword = null;
        int signUpConfirm = 0;
        int setUser = 1;
        int finalSet = 0;
        String[] customerName = new String[setUser];
        String[] customerEmail = new String[setUser];
        String[] customerPassword = new String[setUser];
        String[] customerConfirmPassword = new String[setUser];
        String[] customerUsername = new String[setUser];
//        String customerName = null;
//        String customerPassword = null;
//        String customerUsername = null;
//        String customerEmail = null;
//        String customerConfirmPassword = null;
        String adminName = null;
        String adminPassword = null;
        String adminUsername = null;
        String adminEmail = null;
        String adminConfirmPassword = null;
        int i = 0;
        int n = 0;
        int j = 0;
        int maxUsername = 1;
        int maxEmail = 1;
        boolean emailGate = true;
        boolean passwordGate = true;
        
        Scanner sc = new Scanner(System.in);
        
        Customer customer = new Customer();
        Admin admin = new Admin();
        

        
    }
}
