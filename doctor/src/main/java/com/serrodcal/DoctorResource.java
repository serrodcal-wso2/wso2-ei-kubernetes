package com.serrodcal;

import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("/doctor")
public class DoctorResource {

    private static final Logger logger = Logger.getLogger(DoctorResource.class);

    @Inject
    DoctorService doctorService;

    @GET
    @Path("/hospital/{hospitalId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<Doctor> findDoctorByHospitalId(@PathParam("hospitalId") String hospitalId) {
        logger.info("DoctorResource.findDoctorByHospitalId()");
        logger.debug("DoctorResource.findDoctorByHospitalId() with hospitalId: " + hospitalId);
        return this.doctorService.findDoctorByHospitalId(hospitalId);
    }
}