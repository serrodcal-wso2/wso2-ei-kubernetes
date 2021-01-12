package com.serrodcal;

import io.quarkus.runtime.Startup;
import org.jboss.logging.Logger;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import java.util.HashMap;
import java.util.Map;

@Startup
@Singleton
public class HospitalService {

    private static final Logger logger = Logger.getLogger(HospitalService.class);

    private Map<String, Hospital> hospitalData;

    @PostConstruct
    void readData() {
        this.hospitalData = new HashMap<>();
        this.hospitalData.put("SVQ001", new Hospital(
                "SVQ001",
                "Hospital Universitario Virgen del Rocio",
                "Avenida Manuel Siurot",
                "41013",
                "Sevilla"
        ));
        this.hospitalData.put("SVQ002", new Hospital(
                "SVQ002",
                "Hospital Universitario Virgen Macarena",
                "Calle Droctor Fedriani 3",
                "41009",
                "Sevilla"
        ));
    }

    public Hospital findHospital(String id) {
        return this.hospitalData.getOrDefault(id, null);
    }
}
