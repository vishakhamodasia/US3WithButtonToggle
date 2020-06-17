package com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "vendorlist")
@IdClass(VendorListPK.class)
public class VendorList {

	 @Id
	 @Column(name="business_id")
	 private long businessId;
	 
	 @Id
	 @Column(name="batteryid")
	 private long batteryId;
	 
	 @MapsId("business_id")
	 @ManyToOne(optional = false,cascade=CascadeType.DETACH)
	 @JoinColumn(name = "business_id", referencedColumnName = "business_id")
	 private Vendor vendor;

	 @MapsId("batteryid")
	 @ManyToOne(optional = false,cascade=CascadeType.DETACH)
	 @JoinColumn(name = "batteryid", referencedColumnName = "batteryid")
	 private Battery battery; 
	 
	 public VendorList() {
		super();
		// TODO Auto-generated constructor stub
	 }

	public VendorList(long businessId, long batteryId) {
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
}
