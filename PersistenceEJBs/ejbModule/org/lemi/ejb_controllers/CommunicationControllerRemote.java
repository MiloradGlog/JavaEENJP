package org.lemi.ejb_controllers;

import java.util.List;

import javax.ejb.Remote;
//RESI OVAJ IMPORT 
import org.lemi.entities.UserEntity;

@Remote
public interface CommunicationControllerRemote {
	public String hello();
	public List<UserEntity> getUsers();
	public boolean addUser(UserEntity user);
}
