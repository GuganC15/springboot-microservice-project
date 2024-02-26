package com.amazon.amazonpurchase.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "purchase")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Purchase {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Purchaseid;
	private String Customername;
	private String Email;
	private String Customerlocation;
	private int Productid;
	public int getPurchaseid() {
		return Purchaseid;
	}
	public void setPurchaseid(int purchaseid) {
		Purchaseid = purchaseid;
	}
	public String getCustomername() {
		return Customername;
	}
	public void setCustomername(String customername) {
		Customername = customername;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCustomerlocation() {
		return Customerlocation;
	}
	public void setCustomerlocation(String customerlocation) {
		Customerlocation = customerlocation;
	}
	public int getProductid() {
		return Productid;
	}
	public void setProductid(int productid) {
		Productid = productid;
	}
	

}
