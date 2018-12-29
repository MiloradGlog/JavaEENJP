package mojPaketic.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.lemi.ejb_controllers.CommunicationControllerRemote;
import org.lemi.entities.UserEntity;

@Stateless
@LocalBean
@Path("/test")
public class MyService {

	@GET
	@Path("/method")
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod() {
		String str = "blabla";
		str = mojBean.hello();
		System.out.println(str);
		UserEntity user = new UserEntity();
		user.setIme("Zile");
		
		List<UserEntity> lista = mojBean.getUsers();
		
		for (UserEntity u : lista) {
			System.out.println(u.getIme());
		}
		//mojBean.addUser(user);
		return str;
	}
	
	@EJB
	private CommunicationControllerRemote mojBean;
	
}
