package fr.brizeos.gestehpad.dal;

import fr.brizeos.gestehpad.bo.hebergement.info.Hebergement;
import org.springframework.data.repository.CrudRepository;

public interface HebergementRepository extends CrudRepository<Hebergement, Long> {
}
