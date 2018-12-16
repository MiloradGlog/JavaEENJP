package org.njp.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.njp.dao.IDAOStudent;
import org.njp.entities.Studenti;

@Stateless
public class ServiceStudent extends ServiceAbstract<Studenti, IDAOStudent> implements IServiceStudent{
	
	public ServiceStudent() {
		super();
	}
	
	@EJB
	@Override
	public void setDAO(IDAOStudent dao) {
		this.dao = dao;
	}

	
}
