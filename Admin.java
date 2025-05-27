/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eorderingsystem;

/**
 *
 * @author Seng Ren
 */
public class Admin {
    private String adminUsername;
    private String adminPassword;
    private String adminEmail;
    public Admin(){
        super();
    }
    public void displaySignUpChoise(){
        System.out.println("2) Admin Sign Up: ");
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
    public char clickEdit(){
        char i = 'a';
        return i;
    }
}
