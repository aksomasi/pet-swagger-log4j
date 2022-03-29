package com.petstore.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.petstore.embededs.Category;

@Entity
@Table(name = "pets")
@SecondaryTable(name = "category", pkJoinColumns = @PrimaryKeyJoinColumn(name = "pet_id"))
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pet_id")
	private Long id;

	@Column(name = "pet_name")
	private String name;

	private String status;

	@ElementCollection(targetClass = String.class)
	private List<String> photoUrls;

	@Embedded
	private Category category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getPhotoUrls() {
		return photoUrls;
	}

	public void setPhotoUrls(List<String> photoUrls) {
		this.photoUrls = photoUrls;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
