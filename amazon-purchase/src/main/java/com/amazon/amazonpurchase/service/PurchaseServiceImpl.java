package com.amazon.amazonpurchase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.amazon.amazonpurchase.dto.ProductDto;
import com.amazon.amazonpurchase.dto.PurchaseDto;
import com.amazon.amazonpurchase.dto.responseDto;
import com.amazon.amazonpurchase.entity.Purchase;
import com.amazon.amazonpurchase.repository.PurchaseRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class PurchaseServiceImpl implements PurchaseService{

	@Autowired
	private PurchaseRepository purchaseRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	public Purchase savePurchase(Purchase purchase) {
		return purchaseRepository.save(purchase);
	}
   
    public responseDto getPurchaseById(int purchase_id) {

    	responseDto resPonseDto = new responseDto();
        
        Purchase purchase = purchaseRepository.findById(purchase_id).get();
        
        PurchaseDto purchaseDto = MapToPurchase(purchase);

        ResponseEntity<ProductDto> responseEntity = restTemplate
                .getForEntity("http://localhost:8096/v1/api/products" + purchase.getProductid(),
                ProductDto.class);

        ProductDto productDto= responseEntity.getBody();

       // System.out.println(responseEntity.getStatusCode());

        resPonseDto.setPurchaseDto(purchaseDto);
        resPonseDto.setProductDto(productDto);
        
        return resPonseDto;
    }
    
    private PurchaseDto MapToPurchase(Purchase purchase){
    	
    	PurchaseDto purchaseDto= new PurchaseDto();
    	
    	purchaseDto.setPurchase_id(purchase.getPurchaseid());
    	purchaseDto.setCustomer_name(purchase.getCustomername());
    	purchaseDto.setE_mail(purchase.getEmail());
    	purchaseDto.setCustomer_location(purchase.getCustomerlocation());
    	purchaseDto.setProduct_id(purchase.getProductid());
    	
        return purchaseDto;
    }
	
}
