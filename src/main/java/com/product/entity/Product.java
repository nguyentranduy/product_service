package com.product.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product implements Serializable {

	private static final long serialVersionUID = -8008633206475180483L;
	
	@Id
	@Column
	@JsonProperty(access = Access.WRITE_ONLY)
	Long id;
	
	@Column
	String name;
	
	@Column
	String code;
	
	@Column
	BigDecimal price;
	
	@Column(name = "isDeleted")
	Boolean isDeleted;
}
