/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eorderingsystem;

/**
 *
 * @author Seng Ren
 */
public class UserRecords {
    private String customerName;
    private String customerPassword;
    private String customerUsername;
    private String customerEmail;
    private String adminName;
    private String adminPassword;
    private String adminUsername;
    private String adminEmail;
    
    public UserRecords(){
        
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setCustomerPassword(String customerPassword){
        this.customerPassword = customerPassword;
    }
    public void setCustomerUsername(String customerUsername){
        this.customerUsername = customerUsername;
    }
    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getCustomerPassword(){
        return customerPassword;
    }
    public String getCustomerUsername(){
        return customerUsername;
    }
    public String getCustomerEmail(){
        return customerEmail;
    }
    public void setAdminName(String adminName){
        this.adminName = adminName;
    }
    public void setAdminPassword(String adminPassword){
        this.adminPassword = adminPassword;
    }
    public void setAdminUsername(String adminUsername){
        this.adminUsername = adminUsername;
    }
    public void setAdminEmail(String adminEmail){
        this.adminEmail = adminEmail;
    }
    public String getAdminName(){
        return adminName;
    }
    public String getAdminPassword(){
        return adminPassword;
    }
    public String getAdminUsername(){
        return adminUsername;
    }
    public String getAdminEmail(){
        return adminEmail;
    }
    public boolean successCustomerSignUp(){
        boolean i = true;
        return i;//in to change
    }
    public boolean successAdminSignUp(){
        boolean i = true;
        return i;//in to change
    }
    public boolean sendErrorMessage(){
        boolean i = true;
        return i;//in to change
    }
    public boolean customerLoginSuccess(){
        boolean i = true;
        return i;//in to change
    }
    public boolean adminLoginSuccess(){
        boolean i = true;
        return i;//in to change
    }
    public boolean sendLoginFailure(){
        boolean i = true;
        return i;//in to change
    }
    public boolean confirmResetRequirement(){
        boolean i = true;
        return i;//in to change
    }
    public boolean failResetPassword(){
        boolean i = true;
        return i;//in to change
    }
}
