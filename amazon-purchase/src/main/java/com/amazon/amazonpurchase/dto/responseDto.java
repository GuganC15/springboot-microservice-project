package com.amazon.amazonpurchase.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class responseDto {
	
   private ProductDto productDto;
   private PurchaseDto purchaseDto;
   
   
public ProductDto getProductDto() {
	return productDto;
}
public void setProductDto(ProductDto productDto) {
	this.productDto = productDto;
}
public PurchaseDto getPurchaseDto() {
	return purchaseDto;
}
public void setPurchaseDto(PurchaseDto purchaseDto) {
	this.purchaseDto = purchaseDto;
}
   
   

}
