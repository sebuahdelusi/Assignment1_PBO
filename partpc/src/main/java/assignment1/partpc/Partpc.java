/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package assignment1.partpc;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThinkPad
 */
public class Partpc {

    private List<Component> componentList = new ArrayList<>();

    public void addComponent(Component component) {
        componentList.add(component);
        System.out.println(component.getName() + " succesfully added to PC.");
    }

    public void showComponent() {
        System.out.println("\nPC's Component :");
        for (Component k : componentList) {
            k.Spec();
        }
    }
}
