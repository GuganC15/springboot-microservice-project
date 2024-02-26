package com.amazon.amazonpurchase.dto;

public class PurchaseDto {
	
	private int Purchase_id;
	private String Customer_name;
	private String E_mail;
	private String Customer_location;
	private int Product_id;
	
	public int getPurchase_id() {
		return Purchase_id;
	}
	public void setPurchase_id(int purchase_id) {
		Purchase_id = purchase_id;
	}
	public String getCustomer_name() {
		return Customer_name;
	}
	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}
	public String getE_mail() {
		return E_mail;
	}
	public void setE_mail(String e_mail) {
		E_mail = e_mail;
	}
	public String getCustomer_location() {
		return Customer_location;
	}
	public void setCustomer_location(String customer_location) {
		Customer_location = customer_location;
	}
	public int getProduct_id() {
		return Product_id;
	}
	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}
	
	

}
