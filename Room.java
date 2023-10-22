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
	private int num;
	private String type;
	private int capacity;
	private double price;
	private String availibility;
	

	public Room(int num , String type , int capacity , double price , String availibility){
		availableRoom(num , type , capacity , price , availibility);
	}

	public void availableRoom(int num , String type , int capacity , double price , String availibility){
		if(availibility.equals("Available"))
		this.availibility = availibility;
		else System.out.println("Unavailable Room");
		this.num = num;
		this.capacity = capacity;
		this.type = type;
		this.price = price; 
	}
	
	public int getnum(int num){
		return this.num;
	}
	public String getType(String type){
		return this.type;
	}
	public int getCapacity(int capacity){
		return this.capacity;
	}
	public double getPrice(double price){
		return this.price;
	}
	public String getAvailibility(String availibility){
		return this.availibility;
	}

}
