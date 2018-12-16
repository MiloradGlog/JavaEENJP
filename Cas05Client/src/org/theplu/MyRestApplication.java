package org.theplu;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.theplu.controllers.ControllerPredmet;

@ApplicationPath("/rest")
public class MyRestApplication extends Application {
	@Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(ControllerPredmet.class);
        return classes;
    }
}
