package com.hello.hotel;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("hoteldetails")
public class HotelDetailsResource {
	HotelRepository repo=new HotelRepository();
	//To get all items
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<HotelDetails> getHotel() {
		System.out.println ("Hotel details called....");
		return repo.getHotels();	
		}
	//To get specified items
	@GET
	@Path("hoteldetail/{id}") //id is place holder
	@Produces(MediaType.APPLICATION_JSON)
	public HotelDetails getHotel(@PathParam("id")int id) {
		System.out.println ("Hotel called....");
		return repo.getHotel(id);	
		}
	@GET
	@Path("hoteldetail/price/{id}") //id is place holder
	@Produces(MediaType.APPLICATION_JSON)
	public int getHotelPrice(@PathParam("id")int id) {
		System.out.println ("Hotel called....");
		return getHotel(id).getPrice();	
		}
}
