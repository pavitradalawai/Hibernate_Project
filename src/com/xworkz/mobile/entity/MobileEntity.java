package com.xworkz.mobile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name="mobile_table")
public class MobileEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="m_id")
	private int id;
	@Column(name="m_price")
	private double price;
	@Column(name="m_color")
	private String color;
	@Column(name="m_isAndorid")
	private boolean isAndroid;
	@Column(name="m_brand")
    private String brand;
	public MobileEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MobileEntity( double price, String color, boolean isAndroid, String brand) {
		super();
	
		
		this.price = price;
		this.color = color;
		this.isAndroid = isAndroid;
	}
		
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + id;
		result = prime * result + (isAndroid ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		MobileEntity other = (MobileEntity) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (id != other.id)
			return false;
		if (isAndroid != other.isAndroid)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MobileEntity [id=" + id + ", price=" + price + ", color=" + color + ", isAndroid=" + isAndroid
				+ ", brand=" + brand + "]";
	}
}