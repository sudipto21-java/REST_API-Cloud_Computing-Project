package com.hello.hotel;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class HotelDetails {
	private int id;
	private String name;
	private String location;
	private String city;
	private int price;
	private double points;
	public HotelDetails( int id , String name, String location , String city , int price , double points) {
		this.id=id;
		this.name = name;
		this.location=location;
		this.city=city;
		this.price=price;
		this.points = points;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public String getCity() {
		return city;
	}
	public int getPrice() {
		return price;
	}
	public double getPoints() {
		return points;
	}
}
