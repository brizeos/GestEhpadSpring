package fr.brizeos.gestehpad.bll.patient;

import fr.brizeos.gestehpad.bo.hebergement.info.Chambre;
import fr.brizeos.gestehpad.bo.patient.Patient;
import fr.brizeos.gestehpad.dal.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientManagerImpl extends PatientManager {

    public PatientManagerImpl(@Autowired PatientRepository repo) {
        super(repo);
    }


}
