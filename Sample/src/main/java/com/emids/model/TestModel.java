package com.emids.model;

import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.GeneratorType;

@Entity
@Table
public class TestModel {
   
	@Id
	@Column
	private int id;
	@Column
	private String name;
	
}
