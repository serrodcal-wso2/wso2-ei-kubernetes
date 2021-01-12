package com.serrodcal;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Doctor {

    String id;
    String name;
    String hospitalId;
    String specialty;

    public Doctor(String id, String name, String hospitalId, String specialty) {
        this.id = id;
        this.name = name;
        this.hospitalId = hospitalId;
        this.specialty = specialty;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public String getSpecialty() {
        return specialty;
    }

}
