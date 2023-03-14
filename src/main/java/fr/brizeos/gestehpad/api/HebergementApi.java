package fr.brizeos.gestehpad.api;

import fr.brizeos.gestehpad.bll.hebergement.HebergementManager;
import fr.brizeos.gestehpad.bo.hebergement.info.Hebergement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/hebergement")
@RestController
public class HebergementApi extends Api<Hebergement, Long, HebergementManager> {
    public HebergementApi(@Autowired HebergementManager manager) {
        super(manager);
    }

}
