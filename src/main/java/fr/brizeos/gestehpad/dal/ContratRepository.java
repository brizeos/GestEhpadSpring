package fr.brizeos.gestehpad.dal;

import fr.brizeos.gestehpad.bo.hebergement.activite.Contrat;
import fr.brizeos.gestehpad.bo.hebergement.activite.Employe;
import org.springframework.data.repository.CrudRepository;

public interface ContratRepository extends CrudRepository<Contrat, Long> {
}
