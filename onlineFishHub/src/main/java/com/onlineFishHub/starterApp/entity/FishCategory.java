package com.onlineFishHub.starterApp.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="tbl_category")

public class FishCategory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="category")
	private Set<Fish> fish;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "FishCategory [id=" + id + ", categoryName=" + categoryName + ", fish=" + fish + ", getId()=" + getId()
				+ ", getCategoryName()=" + getCategoryName() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public FishCategory(Long id, String categoryName, Set<Fish> fish) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.fish = fish;
	}

	public FishCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Set<Fish> getFish() {
		return fish;
	}

	public void setFish(Set<Fish> fish) {
		this.fish = fish;
	}

	
	//add setters and getters
	//if you are not using lombok
	
	
}
