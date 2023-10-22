/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelproject;

/**
 *
 * @author PC
 */
public class Reception{

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Room room = new Room(120 , "suite" , 6 , 1200, "Available");
        Displayment displayment = new Displayment();
        displayment.printRoomInfo(room);
	}


}
