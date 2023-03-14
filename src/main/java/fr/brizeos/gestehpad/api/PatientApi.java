package fr.brizeos.gestehpad.api;

import fr.brizeos.gestehpad.bll.patient.PatientManager;
import fr.brizeos.gestehpad.bo.patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/patient", method = {RequestMethod.GET, RequestMethod.POST})
public class PatientApi extends Api<Patient, Long, PatientManager> {
    public PatientApi(@Autowired PatientManager manager) {
        super(manager);
    }

    @Override
    @GetMapping(path = "/{id}", produces = "application/json")
    public Patient getById(@PathVariable Long id) {
        return super.getById(id);
    }

    @Override
    @PostMapping(path = "/save", produces = "application/json")
    public Patient save(@RequestBody Patient item) throws ApiException {
        super.save(item);
        return item;
    }
}
