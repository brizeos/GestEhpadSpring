package fr.brizeos.gestehpad.bll.contrat;

import fr.brizeos.gestehpad.bo.hebergement.activite.Contrat;
import fr.brizeos.gestehpad.bo.hebergement.activite.Employe;
import fr.brizeos.gestehpad.dal.ContratRepository;
import org.springframework.stereotype.Service;

@Service
public class ContratManagerImpl extends ContratManager{
    protected ContratManagerImpl(ContratRepository repo) {
        super(repo);
    }

    @Override
    protected void setContrat(Employe employe, Contrat contrat) {
        employe.setContrat(contrat);
    }

}
