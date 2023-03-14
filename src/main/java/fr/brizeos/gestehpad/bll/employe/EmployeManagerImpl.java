package fr.brizeos.gestehpad.bll.employe;

import fr.brizeos.gestehpad.bo.hebergement.activite.Employe;
import fr.brizeos.gestehpad.dal.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeManagerImpl extends EmployeManager{
    protected EmployeManagerImpl(@Autowired EmployeRepository repo) {
        super(repo);
    }
}
