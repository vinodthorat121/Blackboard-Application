package com.schms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;


@Entity
public class Material {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="material_id", nullable = false, updatable = false)
	private Long id;
	
	private String title;
	private String description;
	
	@Transient
	private MultipartFile resource;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MultipartFile getResource() {
		return resource;
	}

	public void setResource(MultipartFile resource) {
		this.resource = resource;
	}
	
	
	
	

}
