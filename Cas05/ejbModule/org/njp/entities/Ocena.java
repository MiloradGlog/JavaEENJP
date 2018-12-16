package org.njp.entities;

import javax.persistence.*;


/**
 * The persistent class for the ocena database table.
 * 
 */
@Entity
@NamedQuery(name="Ocena.findAll", query="SELECT o FROM Ocena o")
public class Ocena extends BasicEntity {
	private static final long serialVersionUID = 1L;


	@Column(name="ocn_ocena")
	private int ocnOcena;

	@Column(name="ocn_predmet")
	private String ocnPredmet;

	@Column(name="std_id")
	private int stdId;

	public Ocena() {
	}

	public int getOcnOcena() {
		return this.ocnOcena;
	}

	public void setOcnOcena(int ocnOcena) {
		this.ocnOcena = ocnOcena;
	}

	public String getOcnPredmet() {
		return this.ocnPredmet;
	}

	public void setOcnPredmet(String ocnPredmet) {
		this.ocnPredmet = ocnPredmet;
	}

	public int getStdId() {
		return this.stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

}