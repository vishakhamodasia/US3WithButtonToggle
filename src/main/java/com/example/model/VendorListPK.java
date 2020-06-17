package com.example.model;

import java.io.Serializable;

public class VendorListPK implements Serializable{

	private static final long serialVersionUID = -7842144899625014597L;

	private long businessId;

	private long batteryId;
	
	public VendorListPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VendorListPK(long businessId, long batteryId) {
		super();
		this.businessId = businessId;
		this.batteryId = batteryId;
	}

	public long getBusinessId() {
		return businessId;
	}

	public void setBusinessId(long businessId) {
		this.businessId = businessId;
	}

	public long getBatteryId() {
		return batteryId;
	}

	public void setBatteryId(long batteryId) {
		this.batteryId = batteryId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (batteryId ^ (batteryId >>> 32));
		result = prime * result + (int) (businessId ^ (businessId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VendorListPK other = (VendorListPK) obj;
		if (batteryId != other.batteryId)
			return false;
		if (businessId != other.businessId)
			return false;
		return true;
	}

	
}
