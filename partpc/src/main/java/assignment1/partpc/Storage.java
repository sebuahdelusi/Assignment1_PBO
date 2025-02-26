/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1.partpc;

/**
 *
 * @author ThinkPad
 */
public class Storage extends Component implements Action{
    private double capacity;
    private String type;
    
    public Storage(String name, String brand, double price, String desc, double capacity, String type) {
        super(name, brand, price, desc);
        this.capacity = capacity;
        this.type = type;
    }
    
    @Override
    public void powerOn() {
        System.out.println(getName() + " " + capacity + "GB active.");
    }
    
    @Override
    public void powerOff() {
        System.out.println(getName() + " turned off.");
    }
    
    @Override
    public void Spec() {
        System.out.println("Processor: " + getName() + " - " + getBrand() + " - " + capacity + " GB " + type + " - Rp " + getPrice());
    }

    @Override
    public void Install() {
        System.out.println(getName() + " attached to motherboard.");
    }

    @Override
    public void Remove() {
        System.out.println(getName() + " unattached from motherboard.");
    }
}
