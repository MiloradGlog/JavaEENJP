package org.theplu.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import org.njp.controlers.TestControlerRemote;

@Stateless
@LocalBean
@Path("/predmet")
public class ControllerPredmet {

    @GET
    @Produces("text/json")
	public List<String> getAll(@Context HttpServletResponse res){
    	res.setHeader("Access-Control-Allow-Origin", "*");
//    	controlerRemote.getAllStudenti();
    	System.out.println("blablabla");
		return null;
	}
    
    
	// property
    @EJB
    private TestControlerRemote controlerRemote;
}
