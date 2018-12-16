package org.njp.controlers;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.njp.entities.Studenti;
import org.njp.services.IServiceStudent;

/**
 * Session Bean implementation class TestControler
 */
@Stateless
@LocalBean
public class TestControler implements TestControlerRemote {

    /**
     * Default constructor. 
     */
    public TestControler() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Studenti> getAllStudenti() {
		System.out.println("TEST TEST");
		return serviceStudent.getAll();
	}
	
	@Override
	public boolean addStudent(Studenti student) {
		return serviceStudent.add(student);
	}
	
	@EJB
	private IServiceStudent serviceStudent;

	

}
