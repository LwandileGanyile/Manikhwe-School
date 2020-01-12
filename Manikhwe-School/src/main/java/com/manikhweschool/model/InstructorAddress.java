package com.manikhweschool.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

@Embeddable
@Component
public class InstructorAddress implements Serializable {
    
    private static final long serialVersionUID = -6647510015136633214L;

	public static final String COUNTRY = "South Africa";
    
    @Column(name = "Instructor_Province", nullable = false)
    private String province;
    
    @Column(name = "Instructor_City", nullable = false)
    private String city;

	@Column(name = "Instructor_Township_Or_Suburb", nullable = false)
    private String townshipOrSurbub;
    
    public InstructorAddress(){
        province = "Kwa Zulu Natal";
        city = "Durban";
        townshipOrSurbub = "Mayville";
    }
    
    public InstructorAddress(Province province, String city, String townshipOrSurburb){

    }
    
    public Province getProvince() {
		return Province.Kwa_Zulu_Natal;
	}

	public void setProvince(Province province) {
		
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTownshipOrSurbub() {
		return townshipOrSurbub;
	}

	public void setTownshipOrSurbub(String townshipOrSurbub) {
		this.townshipOrSurbub = townshipOrSurbub;
	}
}
