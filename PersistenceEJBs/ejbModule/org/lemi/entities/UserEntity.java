package org.lemi.entities;

import javax.persistence.*;

@Entity
@NamedQuery(name = "User.findAll", query = "SELECT u FROM UserEntity u")
public class UserEntity extends BasicEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "ime")
	private String ime;
	
	public UserEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}

}
