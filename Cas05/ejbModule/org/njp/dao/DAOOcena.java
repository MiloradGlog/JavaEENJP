package org.njp.dao;

import javax.ejb.Stateless;

import org.njp.entities.Ocena;

@Stateless
public class DAOOcena extends DAOAbstractDatabase<Ocena> implements IDAOOcena{

	public DAOOcena() {
		super(Ocena.class);
	}

}
