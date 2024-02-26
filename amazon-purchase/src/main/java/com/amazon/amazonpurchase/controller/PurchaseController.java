package com.amazon.amazonpurchase.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.amazon.amazonpurchase.dto.responseDto;
import com.amazon.amazonpurchase.entity.Purchase;
import com.amazon.amazonpurchase.service.PurchaseService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("amazon/v1/product")
@AllArgsConstructor
public class PurchaseController {

	@Autowired
	private PurchaseService purchaseService; 
	
    @PostMapping
    public ResponseEntity<Purchase> savePurchase(@RequestBody Purchase purchase){
        Purchase savePurchased = purchaseService.savePurchase(purchase);
        return new ResponseEntity<>(savePurchased, HttpStatus.CREATED);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<responseDto> getPurchaseById(@PathVariable("id") int purchase_id){
    	responseDto resPonseDto = purchaseService.getPurchaseById(purchase_id);
        return ResponseEntity.ok(resPonseDto);
    }
}
