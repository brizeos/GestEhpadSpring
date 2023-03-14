package fr.brizeos.gestehpad.bll.patient;

import fr.brizeos.gestehpad.bll.manager.AbstractManager;
import fr.brizeos.gestehpad.bo.hebergement.info.Chambre;
import fr.brizeos.gestehpad.bo.patient.Patient;
import org.springframework.data.repository.CrudRepository;

public abstract class PatientManager extends AbstractManager<Patient, Long> {

    protected PatientManager(CrudRepository<Patient, Long> repo) {
        super(repo);
    }

}
