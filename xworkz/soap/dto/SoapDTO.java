package com.xworkz.soap.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.soap.constant.SoapType;

@Entity
@Table(name = "Soap_table")
public class SoapDTO implements Serializable {
	@Column(name = "S_ID")

	private int id;
	@Column(name="S_BA")
	private String brandAmbassador;
	@Column(name="S_ODOUR")
	private String odour;
	@Column(name="S_CERTIFIED")
	private boolean certified;
	@Column(name="S_AB")
	private boolean antiBacteria;
	private SoapType type;

	public SoapDTO() {
	}

	public SoapDTO(int id, String brandAmbassador, String odour, boolean certified, boolean antiBacteria,
			SoapType type) {
		super();

		this.id = id;
		this.brandAmbassador = brandAmbassador;
		this.odour = odour;
		this.certified = certified;
		this.antiBacteria = antiBacteria;
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		SoapDTO other = (SoapDTO) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SoapDTO [id=" + id + ", brandAmbassador=" + brandAmbassador + ", odour=" + odour + ", certified="
				+ certified + ", antiBacteria=" + antiBacteria + ", type=" + type + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandAmbassador() {
		return brandAmbassador;
	}

	public void setBrandAmbassador(String brandAmbassador) {
		this.brandAmbassador = brandAmbassador;
	}

	public String getOdour() {
		return odour;
	}

	public void setOdour(String odour) {
		this.odour = odour;
	}

	public boolean isCertified() {
		return certified;
	}

	public void setCertified(boolean certified) {
		this.certified = certified;
	}

	public boolean isAntiBacteria() {
		return antiBacteria;
	}

	public void setAntiBacteria(boolean antiBacteria) {
		this.antiBacteria = antiBacteria;
	}

	public SoapType getType() {
		return type;
	}

	public void setType(SoapType type) {
		this.type = type;
	}
}
