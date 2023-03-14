package fr.brizeos.gestehpad.bll.contrat;

import fr.brizeos.gestehpad.bll.manager.AbstractManager;
import fr.brizeos.gestehpad.bo.hebergement.activite.Contrat;
import fr.brizeos.gestehpad.bo.hebergement.activite.Employe;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalTime;

public abstract class ContratManager extends AbstractManager<Contrat, Long> {


    protected ContratManager(CrudRepository<Contrat, Long> repo) {
        super(repo);
    }
    protected abstract void setContrat(Employe employe, Contrat contrat);
}
