package mypkg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.CascadeType;
@Entity
@Table(name="Customers")
public class Customers {
	@Id
	@Column(name="custid")
	private int customerId;
	@Column (name="custName",length=10)
	private String customerName;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="venid",referencedColumnName="vid")
	private Vendor parent;
	
	public Vendor getParent() {
		return parent;
	}
	public void setParent(Vendor parent) {
		this.parent = parent;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
