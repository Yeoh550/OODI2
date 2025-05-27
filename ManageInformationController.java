/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eorderingsystem;

/**
 *
 * @author Seng Ren
 */
public class ManageInformationController {
    private String newProductsID;
    private int newProductsQuantity;
    private String newProductsName;
    private double price;
    private String deletedProductsID;
    private String editedProductsID;
    public ManageInformationController(){
        
    }
    public String getNewProductsID(){
        return newProductsID;
    }
    public int getNewProductsQuantity(){
        return newProductsQuantity;
    }
    public String getNewProductsName(){
        return newProductsName;
    }
    public String getDeletedProducsID(){
        return deletedProductsID;
    }
    public String getEditedProductsID(){
        return editedProductsID;
    }
    public double getPrice(){
        return price;
    }
    public boolean saveAddedProducts(String newProductsID, String newProductsName, int newProductsQuantity){
        boolean i = true;
        return i;
    }
    public boolean checkValidation(){
        boolean i = true;
        return i;
    }
    public boolean deleteProductsDetails(String DeleteProductsID){
        boolean i = true;
        return i;
    }
    public void displaySuccessAddedMessage(String newProductsID){
        
    }
    public void displayErrorDeleteMessage(String EditedProductsID){
        System.out.println("");
    }
    
}
