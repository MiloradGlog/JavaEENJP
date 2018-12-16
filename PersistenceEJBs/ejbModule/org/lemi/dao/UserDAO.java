package org.lemi.dao;

import javax.ejb.Stateless;
import org.lemi.entities.UserEntity;

@Stateless
public class UserDAO extends DAOAbstractDatabase<UserEntity> implements IDAOUser {

	public UserDAO() {
		super(UserEntity.class);
		// TODO Auto-generated constructor stub
	}

}
