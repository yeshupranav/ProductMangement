package com.product.dao;

public class HomeTheater {
	private int size;

	public HomeTheater(int size) {
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "HomeTheater [size=" + size + "]";
	}

}
