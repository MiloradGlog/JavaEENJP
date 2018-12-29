package org.lemi.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.lemi.dao.IDAOUser;
import org.lemi.entities.UserEntity;

@Stateless
public class ServiceUser extends ServiceAbstract<UserEntity, IDAOUser> implements IServiceUser {

	public ServiceUser() {
		super();
	}
	
	@EJB
	@Override
	public void setDAO(IDAOUser dao) {
		// TODO Auto-generated method stub
		this.dao = dao;
	}

}
