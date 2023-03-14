package fr.brizeos.gestehpad.bll.hebergement;

import fr.brizeos.gestehpad.bll.manager.AbstractManager;
import fr.brizeos.gestehpad.bo.hebergement.info.Chambre;
import fr.brizeos.gestehpad.bo.hebergement.info.Hebergement;
import fr.brizeos.gestehpad.bo.patient.Patient;
import fr.brizeos.gestehpad.dal.HebergementRepository;
import org.springframework.data.repository.CrudRepository;

public abstract class HebergementManager extends AbstractManager<Hebergement, Long, HebergementRepository> {
    protected HebergementManager(HebergementRepository repo) {
        super(repo);
    }
    protected abstract void setChambre(Chambre chambre, Patient patient) throws HebergementManagerException;
}