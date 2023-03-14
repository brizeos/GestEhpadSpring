package fr.brizeos.gestehpad.api;

import fr.brizeos.gestehpad.bll.employe.EmployeManager;
import fr.brizeos.gestehpad.bo.hebergement.activite.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employe")
public class EmployeApi extends Api<Employe,Long, EmployeManager> {

    public EmployeApi(@Autowired EmployeManager manager) {
        super(manager);
    }
}
