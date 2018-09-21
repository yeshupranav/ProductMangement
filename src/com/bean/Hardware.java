package com.bean;

import java.util.Date;

public class Hardware extends Product {

	private int serviceId;

	public Hardware(int pid, String pname, Date mfd, int serviceId, String components, com.bean.Dimension dimension) {
		super(pid, pname, mfd);
		this.serviceId = serviceId;
		this.components = components;
		Dimension = dimension;
	}

	private String components;
	private Dimension Dimension;

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getComponents() {
		return components;
	}

	public void setComponents(String components) {
		this.components = components;
	}

	public Dimension getDimension() {
		return Dimension;
	}

	public void setDimension(Dimension Dimension) {
		this.Dimension = Dimension;
	}

	@Override
	public String toString() {
		return "Hardware [serviceID=" + serviceId + ", components=" + components + ", Dimension=" + Dimension + "]";
	}

}
