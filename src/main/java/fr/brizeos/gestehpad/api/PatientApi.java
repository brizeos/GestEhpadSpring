package fr.brizeos.gestehpad.api;

import fr.brizeos.gestehpad.bll.patient.PatientManager;
import fr.brizeos.gestehpad.bo.patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/patient")
@RestController
public class PatientApi extends Api<Patient, Long, PatientManager> {

    public PatientApi(@Autowired PatientManager manager) {
        super(manager);
    }


}
