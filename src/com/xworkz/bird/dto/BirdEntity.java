package com.xworkz.bird.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bird_table")
public class BirdEntity implements Serializable {

	@Column(name = "b_id")
	@Id
	private int id;
	@Column(name = "b_name")
	private String name;

	@Column(name = " b_mammals")
	private boolean mammals;
	@Column(name = "b_skeleton")
	private boolean skeleton;
	@Column(name = "b_color")
	private String color;
	@Column(name = "b_warmblooded")
	private boolean warmblooded;
	@Column(name = "b_beak")
	private boolean beak;
	@Column(name = "b_feathers")
	private boolean feathers;
	@Column(name = "b_fly")
	private boolean fly;
	@Column(name = "b_metabolic rate")
	private boolean metabolicrate;

	public BirdEntity() {
	}

	public BirdEntity(int id, String name, boolean mammals, boolean skeleton, String color, boolean warmblooded,
			boolean beak, boolean feathers, boolean fly, boolean metabolicrate) {
		super();
		this.id = id;
		this.name = name;
		this.mammals = mammals;
		this.skeleton = skeleton;
		this.color = color;
		this.warmblooded = warmblooded;
		this.beak = beak;
		this.feathers = feathers;
		this.fly = fly;
		this.metabolicrate = metabolicrate;
	}

	@Override
	public String toString() {
		return "BirdEntity [id=" + id + ", name=" + name + ", mammals=" + mammals + ", skeleton=" + skeleton
				+ ", color=" + color + ", warmblooded=" + warmblooded + ", beak=" + beak + ", feathers=" + feathers
				+ ", fly=" + fly + ", metabolicrate=" + metabolicrate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (fly ? 1231 : 1237);
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
		BirdEntity other = (BirdEntity) obj;
		if (fly != other.fly)
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

	public boolean isMammals() {
		return mammals;
	}

	public void setMammals(boolean mammals) {
		this.mammals = mammals;
	}

	public boolean isSkeleton() {
		return skeleton;
	}

	public void setSkeleton(boolean skeleton) {
		this.skeleton = skeleton;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWarmblooded() {
		return warmblooded;
	}

	public void setWarmblooded(boolean warmblooded) {
		this.warmblooded = warmblooded;
	}

	public boolean isBeak() {
		return beak;
	}

	public void setBeak(boolean beak) {
		this.beak = beak;
	}

	public boolean isFeathers() {
		return feathers;
	}

	public void setFeathers(boolean feathers) {
		this.feathers = feathers;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	public boolean isMetabolicrate() {
		return metabolicrate;
	}

	public void setMetabolicrate(boolean metabolicrate) {
		this.metabolicrate = metabolicrate;
	}
}
