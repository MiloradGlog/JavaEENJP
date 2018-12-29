package org.lemi.ejb_controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.lemi.entities.UserEntity;
import org.lemi.services.IServiceUser;


@LocalBean
@Stateless
public class CommunicationController implements CommunicationControllerRemote{

	public CommunicationController() {
		
	}
	
	@Override
	public String hello() {
		// TODO Auto-generated method stub
		String poruka = "Pozdrav! Ja sam bean koji radi!";
		System.out.println(poruka);
		return poruka;
	}
	

	@Override
	public List<UserEntity> getUsers() {
		return serviceUser.getAll();
	}
	
	@Override
	public boolean addUser(UserEntity user) {
		System.out.println(user.toString());
		return serviceUser.add(user);
	}
	

	@EJB
	private IServiceUser serviceUser;
}
