package fr.brizeos.gestehpad.bll.contrat;

import fr.brizeos.gestehpad.bll.manager.AbstractManager;
import fr.brizeos.gestehpad.bo.hebergement.activite.Contrat;
import fr.brizeos.gestehpad.bo.hebergement.activite.Employe;
import fr.brizeos.gestehpad.dal.ContratRepository;
import fr.brizeos.gestehpad.dal.CustomCrudRepository;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalTime;

public abstract class ContratManager extends AbstractManager<Contrat, Long, ContratRepository> {


    protected ContratManager(ContratRepository repo) {
        super(repo);
    }
    protected abstract void setContrat(Employe employe, Contrat contrat);
}
