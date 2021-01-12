package com.serrodcal;

import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hospital")
public class HospitalResource {

    private static final Logger logger = Logger.getLogger(HospitalResource.class);

    @Inject
    HospitalService hospitalService;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Hospital findHospital(@PathParam("id") String id) {
        logger.info("HospitalResource.findHospital()");
        logger.debug("HospitalResource.findHospital() with id: " + id);
        return this.hospitalService.findHospital(id);
    }
}