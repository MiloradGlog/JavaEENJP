package org.njp.entities;

import javax.persistence.*;


/**
 * The persistent class for the predmeti database table.
 * 
 */
@Entity
@NamedQuery(name="Predmeti.findAll", query="SELECT p FROM Predmeti p")
public class Predmeti extends BasicEntity {
	private static final long serialVersionUID = 1L;


	@Column(name="ime_predmeta")
	private String imePredmeta;

	@Column(name="oznaka_predmeta")
	private int oznakaPredmeta;

	public Predmeti() {
	}

	public String getImePredmeta() {
		return this.imePredmeta;
	}

	public void setImePredmeta(String imePredmeta) {
		this.imePredmeta = imePredmeta;
	}

	public int getOznakaPredmeta() {
		return this.oznakaPredmeta;
	}

	public void setOznakaPredmeta(int oznakaPredmeta) {
		this.oznakaPredmeta = oznakaPredmeta;
	}

}