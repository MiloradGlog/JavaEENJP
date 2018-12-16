package org.njp.controlers;

import java.util.List;

import javax.ejb.Remote;

import org.njp.entities.Studenti;

@Remote
public interface TestControlerRemote {
	
	public List<Studenti> getAllStudenti();
	public boolean addStudent(Studenti student);
}
