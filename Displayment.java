/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelproject;

/**
 *
 * @author PC
 */
public class Displayment {
    public void printRoomInfo(Room room) {
        System.out.println("Room num: " + room.getnum(0));
        System.out.println("Type: " + room.getType(null));
        System.out.println("Capacity: " + room.getCapacity(0));
        System.out.println("Price: " + room.getPrice(0));
        System.out.println("Availability: " + room.getAvailibility(null));
    }
}

