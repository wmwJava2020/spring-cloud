package com.shopping.ws.product;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Products {

	private String productId;
	private String productName;
	private LocalDateTime dateTime;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Products(String productId, String productName, LocalDateTime dateTime) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.dateTime = dateTime;
	}

	public Products() {
		super();
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", dateTime=" + dateTime + "]";
	}

}
