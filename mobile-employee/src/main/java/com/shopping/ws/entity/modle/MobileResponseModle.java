package com.shopping.ws.entity.modle;

import java.time.LocalDateTime;
import java.util.UUID;

public class MobileResponseModle {

	private UUID serialNo;
	private String model;
	private String madeBy;
	private LocalDateTime purchasedDate;
	
	
	public MobileResponseModle(UUID serialNo, String model, String madeBy, LocalDateTime purchasedDate) {
		super();
		this.serialNo = serialNo;
		this.model = model;
		this.madeBy = madeBy;
		this.purchasedDate = purchasedDate;
	}
	public UUID getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(UUID serialNo) {
		this.serialNo = serialNo;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMadeBy() {
		return madeBy;
	}
	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}
	public LocalDateTime getPurchasedDate() {
		return purchasedDate;
	}
	public void setPurchasedDate(LocalDateTime purchasedDate) {
		this.purchasedDate = purchasedDate;
	}
	public MobileResponseModle() {
		super();
	}
	@Override
	public String toString() {
		return "MobileResponseModle [serialNo=" + serialNo + ", model=" + model + ", madeBy=" + madeBy
				+ ", purchasedDate=" + purchasedDate + "]";
	}

	
}
