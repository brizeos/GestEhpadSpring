package fr.brizeos.gestehpad.dal;

import fr.brizeos.gestehpad.bo.hebergement.info.Chambre;
import org.springframework.data.repository.CrudRepository;

public interface ChambreRepository extends CrudRepository<Chambre, Long> {
}
