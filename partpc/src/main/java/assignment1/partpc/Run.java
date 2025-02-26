/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1.partpc;

/**
 *
 * @author ThinkPad
 */

public class Run {
    public static void main(String[] args) {
        Partpc pc = new Partpc();

        Processor processor = new Processor("Ryzen 7 5800X", "AMD", 4500000, "The brain of PC", 3.8);
        RAM ram = new RAM("Corsair Vengeance", "Corsair", 1200000, "The memory", 16);
        Storage storage = new Storage("Samsung 970 EVO", "Samsung", 1800000, "Data storage", 512, "SSD");

        pc.addComponent(processor);
        pc.addComponent(ram);
        pc.addComponent(storage);

        pc.showComponent();
    }
}

