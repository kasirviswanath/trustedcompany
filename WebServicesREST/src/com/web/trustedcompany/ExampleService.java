package com.web.trustedcompany;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/TrustedCompany")
public class ExampleService {
	@GET
	@Path("/example")
	@Produces(MediaType.APPLICATION_JSON)
	public List<HelloBean> getTrackInJSON() {
		List<HelloBean> listPerson = new ArrayList<>();
		HelloBean p1 = new HelloBean();
		p1.setMsg("Welcome to Test Service");
		p1.setName("TrustedCompany");
		listPerson.add(p1);
		return listPerson;
	}
}
