package com.petstore.embededs;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Category {

	@Column(name = "category_name" , table="category")
	private String name;

	@Column(name = "category_type" , table="category")
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
