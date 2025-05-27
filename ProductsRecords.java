/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eorderingsystem;

/**
 *
 * @author Seng Ren
 */
public class ProductsRecords {
    private String clothesID;
    private int clothesQuantity;
    private char clothesStatus;
    private String clothesName;
    private double clothesPrice;
    private String beautyProductsID;
    private int beautyProductsQuantity;
    private char beautyProductsStatus;
    private String beautyProductsName;
    private double beautyProductsPrice;
    
    public ProductsRecords(){
        
    }
    public void setCLothesID(String clothesID){
        this.clothesID = clothesID;
    }
    public void setClothesQuantity(int clothesQuantity){
        this.clothesQuantity = clothesQuantity;
    }
    public void setClothesStatus(char clothesStatus){
        this.clothesStatus = clothesStatus;
    }
    public void setClothesName(String clothesName){
        this.clothesName = clothesName;
    }
    public void setClothesPrice(double clothesPrice){
        this.clothesPrice = clothesPrice;
    }
    public String getClothesID(){
        return clothesID;
    }
    public int getClothesQuantity(){
        return clothesQuantity;
    }
    public char getClothesStatus(){
        return clothesStatus;
    }
    public String getClothesName(){
        return clothesName;
    }
    public double getClothesPrice(){
        return clothesPrice;
    }
    public void setBeautyProductsID(String beautyProductsID){
        this.beautyProductsID = beautyProductsID;
    }
    public void setBeautyProductsQuantity(int beautyProductsQuantity){
        this.beautyProductsQuantity = beautyProductsQuantity;
    }
    public void setBeautyProductsStatus(char beautyProductsStatus){
        this.beautyProductsStatus = beautyProductsStatus;
    }
    public void setBeautyProductsName(String beautyProductsName){
        this.beautyProductsName = beautyProductsName;
    }
    public void setBeautyProductsPrice(double beautyProductsPrice){
        this.beautyProductsPrice = beautyProductsPrice;
    }
    public String getBeautyProductsID(){
        return beautyProductsID;
    }
    public int getBeautyProductsQuantity(){
        return beautyProductsQuantity;
    }
    public char getBeautyProductsStatus(){
        return beautyProductsStatus;
    }
    public String getBeautyProductsName(){
        return beautyProductsName;
    }
    public double getBeautyProductsPrice(){
        return beautyProductsPrice;
    }
    public boolean productsAddedSaved(){
        boolean i =true;
        return i;
    }
    public boolean savedDeletedProducts(){
        boolean i =true;
        return i;
    }
    public boolean savedEditProducts(){
        boolean i =true;
        return i;
    }
}
