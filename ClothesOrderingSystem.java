/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClothesOrderingSystem_CA24082;

import com.mycompany.eorderingsystem.Admin;
import com.mycompany.eorderingsystem.Customer;
import com.mycompany.eorderingsystem.User;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Seng Ren
 */
public class ClothesOrderingSystem {
    public static void main(String[] args){
        int chooseOption = 0;
        boolean chooseOptionGate = true;
        int signUpPerson = 0;
        int loginPerson = 0;
        boolean signUpGate = true;
        boolean loginGate = true;
        boolean loginSuccessGate = true;
        String name = null;
        String password = null;
        String username = null;
        String email = null;
        String confirmPassword = null;
        int signUpConfirm = 0;
        int setUser = 1; // maybe no need ady
        ArrayList<String> customerName = new ArrayList<>();
        ArrayList<String> customerEmail = new ArrayList<>();
        ArrayList<String> customerPassword = new ArrayList<>();
        ArrayList<String> customerConfirmPassword = new ArrayList<>();
        ArrayList<String> customerUsername = new ArrayList<>();
        ArrayList<String> adminName = new ArrayList<>();
        ArrayList<String> adminEmail = new ArrayList<>();
        ArrayList<String> adminPassword = new ArrayList<>();
        ArrayList<String> adminConfirmPassword = new ArrayList<>();
        ArrayList<String> adminUsername = new ArrayList<>();
//        String[] customerName = new String[100];
//        String[] customerEmail = new String[100];
//        String[] customerPassword = new String[100];
//        String[] customerConfirmPassword = new String[100];
//        String[] customerUsername = new String[100];
        int i = 0;
        int n = 0;
        int maxUsername = 1;
        boolean emailGate = true;
        boolean passwordGate = true;
        boolean successAccount = true;
        
        Scanner sc = new Scanner(System.in);
        
        User customer = new Customer();
        User admin = new Admin();
        
        
        while(chooseOptionGate){
            System.out.println("-------------------------CLOTHES ORDERING SYSTEM-------------------------");
            System.out.println("1) Sign Up");
            System.out.println("2) Login ");
            System.out.println("3) exit");
            System.out.println("Please choose your options(1, 2 or 3): ");
            chooseOption = sc.nextInt();
            if (chooseOption == 1){
                chooseOptionGate = false;
                while(signUpGate){
                    System.out.println("");
                    System.out.println("Please choose your categories: ");
                    System.out.println("1) Customer Sign Up ");
                    System.out.println("2) Admin Sign Up ");
                    System.out.println("Enter your choice(1 or 2): ");
                    signUpPerson = sc.nextInt();
                    sc.nextLine();
                    switch(signUpPerson){
                        case 1:
                            signUpGate = false;
                            customer.clickSignUp(signUpPerson);
                            break;
                        case 2:
                            signUpGate = false;
                            admin.clickSignUp(signUpPerson);
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
                while(emailGate){
                    System.out.println("Enter your email(Example: ca24082@gmail.com or etc): ");
                    email = sc.nextLine();
                    switch(signUpPerson){
                        case 1:
                            customerEmail.add(email);
                            System.out.println(customerEmail); // no need
                            break;
                        case 2:
                            adminEmail.add(email);
                            System.out.println(adminEmail); // no need
                            break;
                    }
                    if(!customerEmail.contains(email) || !adminEmail.contains(email)){
                        for(i=0;i<maxUsername;i++){
                            if(email.charAt(i) != '@'){
                                n++;
                                maxUsername++;
                            }
                        }
                        System.out.println("");
                        System.out.println(customerEmail); // no need
                        System.out.println("Your username will be provide and it similar with your name infront your email");
                        System.out.println("Your username: "+email.substring(0, n));
                        System.out.println("Login using this username.");
                        username = email.substring(0, n);
                        switch(signUpPerson){
                            case 1: 
                                customerUsername.add(username);
                                System.out.println(customerUsername);//no need
                                emailGate = false;
                                break;
                            case 2:
                                customerUsername.add(username);
                                System.out.println(customerUsername);//no need
                                emailGate = false;
                                break;
                        }
                    }
                    else if (customerEmail.contains(email) || adminEmail.contains(email)){
                        System.out.println(customerEmail); // no need
                        System.err.println("Invalid! Please enter the email that is not sign up in this system before!");
                        switch(signUpPerson){
                        case 1:
                            customerEmail.remove(email);
                            System.out.println(customerEmail); // no need
                            break;
                        case 2:
                            adminEmail.remove(email);
                            System.out.println(adminEmail); // no need
                            break;
                        }
                        emailGate = true;
                    }

                    
                }
                while(passwordGate){
                    System.out.println("Enter your password: ");
                    password = sc.nextLine();
                    System.out.println("Enter your confirm password: ");
                    confirmPassword = sc.nextLine();
                    if(confirmPassword.equals(password)){
                        System.out.println("You had successful create your account. ");
                        passwordGate = false;
                        successAccount = true;
                    }
                    else{
                        System.err.println("Error! Please enter back your password and make sure that you enter correctly.");
                        passwordGate = true;
                        successAccount = false;
                    }
                }
                if(signUpPerson == 1 && successAccount==true){
                    customerName.add(name);
                    customerPassword.add(password);
                    customerConfirmPassword.add(confirmPassword);
                    System.out.println(customerUsername);// no need
                    chooseOptionGate = true;
                    signUpGate = true;
                    emailGate = true;
                    maxUsername = 1;
                    passwordGate = true;
                    n = 0;
                }
                else if(signUpPerson == 2 && successAccount==true){
                    adminName.add(name);
                    adminPassword.add(password);
                    adminConfirmPassword.add(confirmPassword);
                    System.out.println(adminUsername);// no need
                    chooseOptionGate = true;
                    signUpGate = true;
                    emailGate = true;
                    maxUsername = 1;
                    passwordGate = true;
                    n = 0;
                }
            }
            else if(chooseOption == 2){
                chooseOptionGate = false;
                while(loginGate){
                    System.out.println(" ");
                    System.out.println("Please choose your categories: ");
                    System.out.println("1) Customer Login ");
                    System.out.println("2) Admin Login ");
                    System.out.println("Enter your choice(1 or 2): ");
                    loginPerson = sc.nextInt();
                    sc.nextLine();
                    switch(loginPerson){
                        case 1:
                            loginGate = false;
                            
                            while(loginSuccessGate){
                                System.out.println("Enter your username: ");
                                username = sc.nextLine();
                                System.out.println("Enter your password: ");
                                password = sc.nextLine();
                                System.out.println(customerUsername);
                                if(!customerUsername.contains(username) || !customerPassword.contains(password)){
                                    System.out.println("Error! Incorrect Username or Password");
                                    System.out.println("Please try again!! Make sure you had sign up an account before!");
                                    loginSuccessGate = true;
                                }
                                else{
                                    for(i=0; i<customerUsername.size();i++){
                                        if(username.equals(customerUsername.get(i))&&password.equals(customerPassword.get(i))){
                                            System.out.println("");
                                            System.out.println("You have login successful.");
                                            loginSuccessGate = false;
                                        }
                                    }
                                }
                            }
                            break;
                        case 2:
                            loginGate = false;
                            break;
                        default:
                            loginGate = true;
                            break;
                    }
                }
                
            }
            else if(chooseOption == 3){
                chooseOptionGate = false;
                System.out.println("Thank you for using our system.");
            }
            else{
                chooseOptionGate = true;
                System.err.println("Invalid! Please try again.");
            }
        }

    }
}
