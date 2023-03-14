package fr.brizeos.gestehpad;

import fr.brizeos.gestehpad.bll.hebergement.HebergementManager;
import fr.brizeos.gestehpad.bll.patient.PatientManager;
import fr.brizeos.gestehpad.bo.hebergement.info.Chambre;
import fr.brizeos.gestehpad.bo.hebergement.info.Hebergement;
import fr.brizeos.gestehpad.bo.hebergement.info.Ville;
import fr.brizeos.gestehpad.bo.patient.Patient;
import fr.brizeos.gestehpad.dal.ChambreRepository;
import fr.brizeos.gestehpad.dal.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class GestEhpadApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(GestEhpadApplication.class, args);
    }

    @Autowired
    PatientManager patientRepository;
    @Autowired
    VilleRepository villeRepository;
    @Autowired
    ChambreRepository chambreRepository;
    @Autowired
    HebergementManager hebergementRepository;

    @Override
    public void run(String... args) throws Exception {
        Ville ville = Ville.builder().nomVille("Quimper").codePostalVille("29000").build();
        villeRepository.save(ville);

        Chambre chambre = Chambre.builder().numeroChambre(103).surfaceChambre(63.2).maxResidentChambre(2).patientsChambre(new ArrayList<>()).build();
        chambreRepository.save(chambre);

        Hebergement h = Hebergement.builder()
                .nomHebergement("Résidence pasepais")
                .villeHebergement(ville)
                .chambresHebergement(List.of(chambre))
                .build();
        hebergementRepository.add(h);

        Patient p1 = Patient.builder()
                .nomPatient("DeLaQuenelle")
                .prenomPatient("Jean")
                .sexePatient("M")
                .nirPatient("1234566898")
                .dateNaissancePatient(LocalDate.of(1956, 3, 12))
                .build();
        p1.setChambrePatient(chambre);
        patientRepository.add(p1);

        System.out.println("p1 = " + p1);

    }
}
