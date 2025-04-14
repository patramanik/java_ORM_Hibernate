package com.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class OdersItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemId;
	@Column(name = "item_count",length = 20)
	private int itemCount;
	
	@ManyToMany(mappedBy = "items")
	List<Oders> oders = new ArrayList<Oders>();

	public OdersItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OdersItem(int itemCount, List<Oders> oders) {
		super();
		this.itemCount = itemCount;
		this.oders = oders;
	}

	public OdersItem(int itemId, int itemCount, List<Oders> oders) {
		super();
		this.itemId = itemId;
		this.itemCount = itemCount;
		this.oders = oders;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public List<Oders> getOders() {
		return oders;
	}

	public void setOders(List<Oders> oders) {
		this.oders = oders;
	}

	@Override
	public String toString() {
		return "OdersItem [itemId=" + itemId + ", itemCount=" + itemCount + ", oders=" + oders + "]";
	}
	
	
}
