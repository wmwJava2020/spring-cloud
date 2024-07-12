package com.shopping.ws.entity.modle;

public class MobileRequestModle {

	private String owner;
	private int code;

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

	public MobileRequestModle(String owner, int code) {
		super();
		this.owner = owner;
		this.code = code;
	}

	@Override
	public String toString() {
		return "MobileRequestModle [owner=" + owner + ", code=" + code + "]";
	}

}
