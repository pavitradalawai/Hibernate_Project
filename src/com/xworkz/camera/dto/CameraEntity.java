package com.xworkz.camera.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "camera_table")
public class CameraEntity implements Serializable {

	@Column(name = "c_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "c_name")
	String name;
	@Column(name = "c_brand")
	String brand;
	@Column(name = "c_focal length")
	int focallength;
	@Column(name = "c_field view")
	int fieldview;
	@Column(name = "c_light sensitive")
	boolean lightsenstive;
	@Column(name = "c_lens")
	int lens;
	@Column(name = "c_focusing ring")
	boolean focusingring;
	@Column(name = "c_light meter")
	String lightmeter;
	@Column(name = "c_view finder")
	String viewfinder;

	public CameraEntity() {
		super();
	}

	public CameraEntity(int id, String name, String brand, int focallength, int fieldview, boolean lightsenstive,
			int lens, boolean focusingring, String lightmeter, String viewfinder) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.focallength = focallength;
		this.fieldview = fieldview;
		this.lightsenstive = lightsenstive;
		this.lens = lens;
		this.focusingring = focusingring;
		this.lightmeter = lightmeter;
		this.viewfinder = viewfinder;
	}

	

	@Override
	public String toString() {
		return "CameraEntity [id=" + id + ", name=" + name + ", brand=" + brand + ", focallength=" + focallength
				+ ", fieldview=" + fieldview + ", lightsenstive=" + lightsenstive + ", lens=" + lens + ", focusingring="
				+ focusingring + ", lightmeter=" + lightmeter + ", viewfinder=" + viewfinder  + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + id;
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
		CameraEntity other = (CameraEntity) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getFocallength() {
		return focallength;
	}

	public void setFocallength(int focallength) {
		this.focallength = focallength;
	}

	public int getFieldview() {
		return fieldview;
	}

	public void setFieldview(int fieldview) {
		this.fieldview = fieldview;
	}

	public boolean isLightsenstive() {
		return lightsenstive;
	}

	public void setLightsenstive(boolean lightsenstive) {
		this.lightsenstive = lightsenstive;
	}

	public int getLens() {
		return lens;
	}

	public void setLens(int lens) {
		this.lens = lens;
	}

	public boolean isFocusingring() {
		return focusingring;
	}

	public void setFocusingring(boolean focusingring) {
		this.focusingring = focusingring;
	}

	public String getLightmeter() {
		return lightmeter;
	}

	public void setLightmeter(String lightmeter) {
		this.lightmeter = lightmeter;
	}

	public String getViewfinder() {
		return viewfinder;
	}

	public void setViewfinder(String viewfinder) {
		this.viewfinder = viewfinder;
	}
}
