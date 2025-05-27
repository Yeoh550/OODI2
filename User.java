/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eorderingsystem;

/**
 *
 * @author Seng Ren
 */
public class User {
    protected String name;
    protected String password;
    protected String username;
    protected String email;
    protected String newPassword;
    protected String confirmPassword;
    public User(){
        this.name = null;
        this.password = null;
        this.username = null;
        this.email = null;
        this.newPassword = null;
        this.confirmPassword = null;
    }
    public void displaySignUpChoice(){
        System.out.println("1) Customer Sign Up: ");
        System.out.println("2) Admin Sign Up: ");
    }
    public int clickSignUp(int SignUpChoice){
        return SignUpChoice;
    }
    
}
