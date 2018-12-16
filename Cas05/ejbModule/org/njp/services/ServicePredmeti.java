package org.njp.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.njp.dao.IDAOPredmeti;
import org.njp.entities.Predmeti;

@Stateless
public class ServicePredmeti extends ServiceAbstract<Predmeti, IDAOPredmeti> implements IServicePredmeti {

	public ServicePredmeti() {
		super();
	}

	@EJB
	@Override
	public void setDAO(IDAOPredmeti dao) {
		this.dao = dao;
	}

}
