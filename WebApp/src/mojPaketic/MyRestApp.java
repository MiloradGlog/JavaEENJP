package mojPaketic;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import mojPaketic.services.MyService;

@ApplicationPath("/app")
public class MyRestApp extends Application {
	 @Override
	    public Set<Class<?>> getClasses() {
	        Set<Class<?>> classes = new HashSet<Class<?>>();
	        classes.add(MyService.class);
	        return classes;
	    }
}
