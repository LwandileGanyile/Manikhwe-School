package com.manikhwe.Manikhwe.School;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Generic_Entity")
@Getter
@Setter
public class GenericEntity {

	@Id
	private Long id;
	
	@Column
	private String value;
	
	public GenericEntity(){
		value = "Entity";
		id = 0L;
	}
	
	public GenericEntity(Long id,String value){
		this.value = value;
		this.id = id;
	}

	public Long getId() {
		
		return id;
	}
	
	public String getValue() { return value;}
}
