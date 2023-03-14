package fr.brizeos.gestehpad.bll.hebergement;

import fr.brizeos.gestehpad.bo.hebergement.info.Chambre;
import fr.brizeos.gestehpad.bo.hebergement.info.Hebergement;
import fr.brizeos.gestehpad.bo.patient.Patient;
import fr.brizeos.gestehpad.dal.HebergementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class HebergementManagerImpl extends HebergementManager{
    protected HebergementManagerImpl(@Autowired HebergementRepository repo) {
        super(repo);
    }

    @Override
    protected void setChambre(Chambre chambre, Patient patient) throws HebergementManagerException {
        if (chambre.getPatientsChambre().size() >= chambre.getMaxResidentChambre()){
            throw new HebergementManagerException("La chambre est pleine.");
        }
        patient.setChambrePatient(chambre);
    }
}
