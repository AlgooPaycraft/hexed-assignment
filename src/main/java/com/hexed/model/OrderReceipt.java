package com.hexed.model;

import java.util.List;

public class OrderReceipt {
	private String code;
	private float totalAmount;
	private List<String> packs; 

	/*
	 * public OrderReceipt(String code, float totalAmount, List<String> packs) {
	 * super(); this.code = code; this.totalAmount = totalAmount; this.packs =
	 * packs; }
	 */
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<String> getPacks() {
		return packs;
	}

	public void setPacks(List<String> packs) {
		this.packs = packs;
	}

	@Override
	public String toString() {
		return "OrderReceipt [code=" + code + ", totalAmount=" + totalAmount + ", packs=" + packs + "]";
	}

}
