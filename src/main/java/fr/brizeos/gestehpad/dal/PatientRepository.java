package fr.brizeos.gestehpad.dal;

import fr.brizeos.gestehpad.bo.patient.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Long> {
}
