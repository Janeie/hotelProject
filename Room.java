/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelproject;

/**
 *
 * @author PC
 */
public class Room {
	public int num;
	public String type;
	public int capacity;
	public double price;
	public String availibility;
	

	public Room(int num , String type , int capacity , double price , String availibility){
		if(availibility.equals("Available"))
		this.availibility = availibility;
		else System.out.println("Unavailable Room");
		this.num = num;
		this.capacity = capacity;
		this.type = type;
		this.price = price;
	}

 

}

