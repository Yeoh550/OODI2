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
        
        while(chooseOptionGate){
            System.out.println("-------------------------E-ORDERING SYSTEM-------------------------");
            System.out.println("1) Sign Up");
            System.out.println("2) Login ");
            System.out.println("Please choose your options(1 or 2): ");
            chooseOption = sc.nextInt();
            if (chooseOption == 1){
                chooseOptionGate = false;
                while(signUpGate){
                    System.out.println("Please choose your categories: ");
                    System.out.println("1) Customer Sign Up: ");
                    System.out.println("2) Admin Sign Up: ");
                    System.out.println("Enter your choice(1 or 2): ");
                    signUpPerson = sc.nextInt();
                    sc.nextLine();
                    switch(signUpPerson){
                        case 1:
                            signUpGate = false;
                            customer.clickSignUp(signUpPerson);
//                            System.out.println("Let's create your own account!");
//                            System.out.println("Enter your name(Example: Seng Ren, or etc): ");
                            break;
                        case 2:
                            signUpGate = false;
                            admin.clickSignUp(signUpPerson);
//                            System.out.println("Let's create your own account!");
//                            System.out.println("Enter your name(Example: Seng Ren, or etc): ");
                            break;
                        default:
                            signUpGate = true;
                            System.err.println("Invalid! Please try again.");
                            break;
                    }
                }
                System.out.println("Let's create your own account!");
                System.out.println("Enter your full name(Example: Yeoh Seng Ren, or etc): ");
                name = sc.nextLine();
                customerName[finalSet] = name;
                //insert here
                for(j=0; j<maxEmail; j++){
                    while(emailGate){
                        System.out.println("Enter your email(Example: ca24082@gmail.com or etc): ");
                        email = sc.nextLine();
                        if(email != customerEmail[j]){
                            for(i=0;i<maxUsername;i++){
                                if(email.charAt(i) != '@'){
                                    n++;
                                    maxUsername++;
                                }
                            }
                            System.out.println("Your username will be provide and it similar with your name infront your email");
                            System.out.println("Your username: "+email.substring(0, n));
                            System.out.println("Login using this username.");
                            emailGate = false;
                        }
                        else if (email != adminEmail){
                            for(i=0;i<maxUsername;i++){
                                if(email.charAt(i) != '@'){
                                    n++;
                                    maxUsername++;
                                }
                            }
                            System.out.println("Your username will be provide and it similar with your name infront your email");
                            System.out.println("Your username: "+email.substring(0, n));
                            System.out.println("Login using this username.");
                            emailGate = false;
                        }
                        else{
                            System.err.println("Invalid! Please enter the email that is not sign up in this system before!");
                            emailGate = true;
                        }
                    }
                }
                
                while(passwordGate){
                    System.out.println("Enter your password: ");
                    password = sc.nextLine();
                    System.out.println("Enter your confirm password: ");
                    confirmPassword = sc.nextLine();
                    if(confirmPassword.equals(password)){
                        passwordGate = false;
                       System.out.println("You had successfull create your account. ");
                       maxEmail++;
                    }
                    else{
                         passwordGate = true;
                         System.err.println("Error! Please enter back your password and make sure that you enter correctly.");
                    }
                }
                switch(signUpPerson){
                    case 1:
                        customerName[finalSet] = name;
                        customerPassword[finalSet] = password;
                        customerUsername[finalSet] = username;
                        customerEmail[finalSet] = email;
                        customerConfirmPassword[finalSet] = confirmPassword;
                        setUser++;
                        break;
                    case 2:
                        adminName = name;
                        adminPassword = password;
                        adminUsername = username;
                        adminEmail = email;
                        adminConfirmPassword = confirmPassword;
                        break;
                        
                }
                
            }
            else if(chooseOption == 2){
                chooseOptionGate = false;
                customer.openLogin(chooseOption);
            }
            else{
                chooseOptionGate = true;
                System.err.println("Invalid! Please try again.");
            }
        }
        
    }
}
