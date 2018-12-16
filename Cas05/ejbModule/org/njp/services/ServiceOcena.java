package org.njp.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.njp.dao.IDAOOcena;
import org.njp.entities.Ocena;

@Stateless
public class ServiceOcena extends ServiceAbstract<Ocena, IDAOOcena> implements IServiceOcena{

	public ServiceOcena() {
		super();
	}

	@EJB
	@Override
	public void setDAO(IDAOOcena dao) {
		this.dao = dao;
	}



}
