/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eorderingsystem;

/**
 *
 * @author Seng Ren
 */
public class Customer extends User{
    private String customerUsername;
    private String customerPassword;
    private String customerEmail;
    public Customer(){
        super();
        
    }
    public void displaySignUpChoise(){
        System.out.println("1) Customer Sign Up: ");
    }
    public int clickSignUp(int SignUpChoice){
        return SignUpChoice;
    }
    public int openLogin(int loginChoice){
        return loginChoice;
    }
    public boolean openResetPassword(){
        boolean i = true;
        return i;//in to change
    }
}
