package com.amazon.amazonpurchase.service;

import com.amazon.amazonpurchase.dto.responseDto;
import com.amazon.amazonpurchase.entity.Purchase;

public interface PurchaseService {

	Purchase savePurchase(Purchase purchase);
	
	responseDto getPurchaseById(int purchase_id);
}
