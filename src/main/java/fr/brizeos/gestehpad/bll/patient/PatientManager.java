package fr.brizeos.gestehpad.bll.patient;

import fr.brizeos.gestehpad.bll.manager.AbstractManager;
import fr.brizeos.gestehpad.bo.patient.Patient;
import fr.brizeos.gestehpad.dal.CustomCrudRepository;
import fr.brizeos.gestehpad.dal.PatientRepository;
import org.springframework.data.repository.CrudRepository;

public abstract class PatientManager extends AbstractManager<Patient, Long, PatientRepository> {
    protected PatientManager(PatientRepository repo) {
        super(repo);
    }
}