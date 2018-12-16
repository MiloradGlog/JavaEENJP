package org.njp.entities;

import javax.persistence.*;


/**
 * The persistent class for the studenti database table.
 * 
 */
@Entity
@NamedQuery(name="Studenti.findAll", query="SELECT s FROM Studenti s")
public class Studenti extends BasicEntity {
	private static final long serialVersionUID = 1L;


	@Column(name="std_ime")
	private String stdIme;

	@Column(name="std_indeks")
	private String stdIndeks;

	@Column(name="std_prezime")
	private String stdPrezime;

	@Column(name="std_prosek")
	private double stdProsek;

	public Studenti() {
	}

	public String getStdIme() {
		return this.stdIme;
	}

	public void setStdIme(String stdIme) {
		this.stdIme = stdIme;
	}

	public String getStdIndeks() {
		return this.stdIndeks;
	}

	public void setStdIndeks(String stdIndeks) {
		this.stdIndeks = stdIndeks;
	}

	public String getStdPrezime() {
		return this.stdPrezime;
	}

	public void setStdPrezime(String stdPrezime) {
		this.stdPrezime = stdPrezime;
	}

	public double getStdProsek() {
		return this.stdProsek;
	}

	public void setStdProsek(double stdProsek) {
		this.stdProsek = stdProsek;
	}

	@Override
	public String toString() {
		return "Studenti [stdIme=" + stdIme + ", stdIndeks=" + stdIndeks + ", stdPrezime=" + stdPrezime + ", stdProsek="
				+ stdProsek + "]";
	}
	
	

}