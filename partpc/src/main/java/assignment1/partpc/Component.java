/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1.partpc;

/**
 *
 * @author ThinkPad
 */
public abstract class Component implements Action {
    private String name;
    private String brand;
    private double price;
    private String desc;
    
    public Component(String name, String brand, double price, String desc) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.desc = desc;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public String getDesc() {
        return this.desc;
    }
    
    public abstract void Install();
    public abstract void Remove();
}


 