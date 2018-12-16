package org.njp.dao;

import javax.ejb.Stateless;

import org.njp.entities.Predmeti;

@Stateless
public class DAOPredmeti extends DAOAbstractDatabase<Predmeti> implements IDAOPredmeti {

	public DAOPredmeti() {
		super(Predmeti.class);
	}

}
