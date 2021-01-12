package com.serrodcal;

import io.quarkus.runtime.Startup;
import org.jboss.logging.Logger;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Startup
@Singleton
public class DoctorService {

    private static final Logger logger = Logger.getLogger(DoctorService.class);

    private List<Doctor> doctorData;

    public DoctorService() { }

    @PostConstruct
    void readData() {
        this.doctorData = new ArrayList<>();
        this.doctorData.add(new Doctor("DOCTOR001", "Borja Perez Sierra", "SVQ001", "gynecologist"));
        this.doctorData.add(new Doctor("DOCTOR002", "Jesus Medinilla", "SVQ002", "pediatrician"));
        this.doctorData.add(new Doctor("DOCTOR003", "Joaquin de Vicente", "SVQ001", "traumatologist"));
        this.doctorData.add(new Doctor("DOCTOR004", "Sergio Rodriguez Calvo", "SVQ002", "cardiologist"));
    }

    public Set<Doctor> findDoctorByHospitalId(String hospitalId) {
        Set<Doctor> res = new HashSet<>();
        for (Doctor doctor: this.doctorData){
            if (doctor.getHospitalId().equalsIgnoreCase(hospitalId)) {
                res.add(doctor);
            }
        }
        return res;
    }
}
