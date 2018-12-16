package org.njp.dao;

import javax.ejb.Stateless;

import org.njp.entities.Studenti;

@Stateless
public class DAOStudent extends DAOAbstractDatabase<Studenti> implements IDAOStudent {

	public DAOStudent() {
		super(Studenti.class);
	}

}
