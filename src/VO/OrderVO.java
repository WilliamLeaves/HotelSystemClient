package VO;

import java.sql.Date;

public class OrderVO {
	
	public String getOrderID() {
		return orderID;
	}

	public String getUserID() {
		return userID;
	}

	public String getHotelID() {
		return hotelID;
	}

	public double getPrice() {
		return price;
	}

	public Date getEntryTime() {
		return entryTime;
	}

	public Date getLastime() {
		return lastime;
	}

	public String getOrderState() {
		return orderState;
	}

	private String orderID;
	private String userID;
	private String hotelID;
	private double  price;
	private Date entryTime;
	private Date lastime;
	private String orderState;
	
	public OrderVO(String orderID, String userID, String hotelID,double price, String orderState){
		this.orderID = orderID;
		this.userID = userID;
		this.hotelID = hotelID;
		this.price = price;
		this.orderState= orderState;
	}
	
	public OrderVO(String orderID, String userID, String hotelID,double price,Date entryTime,Date lastime, String orderState){
		this.orderID = orderID;
		this.userID = userID;
		this.hotelID = hotelID;
		this.price = price;
		this.entryTime = entryTime;
		this.lastime = lastime;
		this.orderState= orderState;
	}
	
	
	
}
