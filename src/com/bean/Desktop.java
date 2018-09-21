package com.bean;

import java.util.Date;

public class Desktop extends Computer {

	private String name;

	public Desktop(int pid, String pname, Date mfd, int serviceId, String components, Dimension Dimension, int RAM,
			int harddisk, String name) {
		super(pid, pname, mfd, serviceId, components, Dimension, RAM, harddisk);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Desktop [name=" + name + "]";
	}

}
