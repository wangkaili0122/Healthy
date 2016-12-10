package com.example.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.example.bean.Patient;

public interface PatientMapper {
	
	Patient selectPatientById(int id);
	
	Patient selectPatientByUsername(String username);
	
	Patient selectByUsernameAndPass(Patient patient);
	
	void addPatient(Patient patient);

	void addDoctor(int doctor_id, int patient_id);
	
	List<Patient> getPatientListByDoctorId(int doctor_id);

	List<Patient> getPatientListByDoctorId2(@Param("doctor_id")int doctor_id, @Param("list")List<Integer> ids);

	List<Patient> getPatientDataList(int id);

}
