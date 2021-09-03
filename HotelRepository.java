package com.hello.hotel;
import java.util.ArrayList;
import java.util.List;
public class HotelRepository {
	List<HotelDetails> hoteldetails;
	public HotelRepository() {
		hoteldetails=new ArrayList<>();
		HotelDetails a1=new HotelDetails(101,"Vivanta Goa, Panaj"," 990 m from Big Daddy Casino" ,"Goa",4050,4.6);
		HotelDetails a2=new HotelDetails(102,"Holiday Inn Resort GOA","Panjim","Goa",5399,4.6);
		HotelDetails a3=new HotelDetails(103,"Novotel Goa Dona Sylvia Resort","Panjim","Goa",7920,4.3);
		HotelDetails a4=new HotelDetails(104,"Taj Fort Aguada Resort & spa,Candolim,Goa","Candolim","Goa",7000,3.9);
		HotelDetails a5=new HotelDetails(105,"The Lalit Golf & Spa Resort","Panjim","Palolem",5999,4.2);
		HotelDetails a6=new HotelDetails(106,"HARD ROCK HOTEL GOA","Panjim","Goa",6839,4.6);
		HotelDetails a7=new HotelDetails(107,"Phoenix Park Inn by Radisson","Candolim","Goa",2153,3.9);
		HotelDetails a8=new HotelDetails(108,"Ginger Goa","Panjim","Panjim",2706,4.2);
		HotelDetails a9=new HotelDetails(109,"Cidade De Goa-IHCL SeleQtions","Panjim","Goa",5999,4.6);
		HotelDetails a10=new HotelDetails(110,"Goa Marriott Resort Spa","Candolim","panjim",8199,3.9);
		HotelDetails a11=new HotelDetails(111,"Patong Bay Exclusive Hotel","Panjim","Patong",850,4.2);
		HotelDetails a12=new HotelDetails(112,"Oakwood Hotel Journeyhub Phuket","Panjim","Patong",1406,4.6);
		HotelDetails a13=new HotelDetails(113,"La Flora Resort Patong","Candolim","Goa",16960,3.9);
		HotelDetails a14=new HotelDetails(114,"The Slate","Panjim","Naipong",5609,4.2);
		HotelDetails a15=new HotelDetails(115,"The View Phuket","Panjim","kata",7349,4.6);
		HotelDetails a16=new HotelDetails(116,"Novotel New DelhiAerocity","Candolim","New Delhi",2249,3.9);
		HotelDetails a17=new HotelDetails(117,"Hotel Asian Blue Delhi","Panjim","New Delhi",423,3.3);
		HotelDetails a18=new HotelDetails(118,"Hotel Aman Continental","Panjim","New Delhi",967,4.2);
		HotelDetails a19=new HotelDetails(119,"Woodapple Residency","Panjim","East Delhi",1304,4.1);
		HotelDetails a20=new HotelDetails(120,"Ramada  Jamshedpur Bistupur"," ","Jamshedpur",3384,4.4);
	hoteldetails.add(a1);hoteldetails.add(a2);hoteldetails.add(a3);hoteldetails.add(a4);hoteldetails.add(a5);
	hoteldetails.add(a6);hoteldetails.add(a7);hoteldetails.add(a8);hoteldetails.add(a9);hoteldetails.add(a10);
	hoteldetails.add(a11);hoteldetails.add(a12);hoteldetails.add(a13);hoteldetails.add(a14);hoteldetails.add(a15);
		hoteldetails.add(a16);hoteldetails.add(a17);hoteldetails.add(a18);hoteldetails.add(a19);hoteldetails.add(a20);
	}
	public List<HotelDetails> getHotels(){
		return hoteldetails;
	}
