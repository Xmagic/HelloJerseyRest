package org.xmagic.rest;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;

public class RestApplication extends ResourceConfig{
	public RestApplication() {
		
		packages("org.xmagic.rest");
		
		register(LoggingFilter.class);
	}
}
