/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1.partpc;

/**
 *
 * @author ThinkPad
 */
public class Processor extends Component implements Action {
    private double speed;
    
    public Processor(String name, String brand, double price, String desc, double speed) {
        super(name, brand, price, desc);
        this.speed = speed;
    }
    
    @Override
    public void powerOn() {
        System.out.println(getName() + " (" + getBrand() + ") turned on with the speed of" + speed + " Ghz.");
    }
    
    @Override
    public void powerOff() {
        System.out.println(getName() + " turned off.");
    }
    
    @Override
    public void Spec() {
        System.out.println("Processor: " + getName() + " - " + getBrand() + " - " + speed + " GHz - Rp " + getPrice());
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
