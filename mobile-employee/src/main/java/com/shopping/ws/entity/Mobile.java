package com.shopping.ws.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobile {
	@Id
	private Long id;
	private UUID serialNo;
	private String model;
	private String owner;
	private int code;
	private String madeBy;
	private LocalDateTime purchasedDate;

	public Mobile(Long id, UUID serialNo, String model, String owner, int code, String madeBy,
			LocalDateTime purchasedDate) {
		super();
		this.id = id;
		this.serialNo = serialNo;
		this.model = model;
		this.owner = owner;
		this.code = code;
		this.madeBy = madeBy;
		this.purchasedDate = purchasedDate;
	}

	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
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

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", serialNo=" + serialNo + ", model=" + model + ", owner=" + owner + ", code="
				+ code + ", madeBy=" + madeBy + ", purchasedDate=" + purchasedDate + "]";
	}

}
