package com.product;

public class DeskTop {
	private String Types;

	public DeskTop(String types) {
		super();
		Types = types;
	}

	public String getTypes() {
		return Types;
	}

	public void setTypes(String types) {
		Types = types;
	}

	@Override
	public String toString() {
		return "DeskTop [Types=" + Types + "]";
	}

}
