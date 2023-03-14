package fr.brizeos.gestehpad.bll.employe;

import fr.brizeos.gestehpad.bll.manager.AbstractManager;
import fr.brizeos.gestehpad.bo.hebergement.activite.Contrat;
import fr.brizeos.gestehpad.bo.hebergement.activite.Employe;
import fr.brizeos.gestehpad.dal.EmployeRepository;
import org.springframework.data.repository.CrudRepository;

public abstract class EmployeManager extends AbstractManager<Employe, Long, EmployeRepository> {

    protected EmployeManager(EmployeRepository repo) {
        super(repo);
    }
}
