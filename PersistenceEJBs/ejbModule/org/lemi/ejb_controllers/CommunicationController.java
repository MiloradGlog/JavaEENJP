package org.lemi.ejb_controllers;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;


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
//	@Override
//	public boolean addUser(UserEntity user) {
//		return serviceUser.add(user);
//	}
	

//	@EJB
//	private IServiceUser serviceUser;
}
