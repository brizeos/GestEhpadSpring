package fr.brizeos.gestehpad;

import fr.brizeos.gestehpad.bll.BaseManager;
import fr.brizeos.gestehpad.bll.hebergement.HebergementManager;
import fr.brizeos.gestehpad.bll.patient.PatientManager;
import fr.brizeos.gestehpad.bo.hebergement.activite.Contrat;
import fr.brizeos.gestehpad.bo.hebergement.activite.Employe;
import fr.brizeos.gestehpad.bo.hebergement.activite.Planning;
import fr.brizeos.gestehpad.bo.hebergement.info.Chambre;
import fr.brizeos.gestehpad.bo.hebergement.info.Hebergement;
import fr.brizeos.gestehpad.bo.hebergement.info.Ville;
import fr.brizeos.gestehpad.bo.patient.Patient;
import fr.brizeos.gestehpad.dal.BaseRepository;
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
    BaseRepository repository;

    @Autowired
    BaseManager manager;

    @Override
    public void run(String... args) throws Exception {
        Planning planing1 = Planning.builder().build();
        repository.save(planing1);


        Contrat contrat1 = Contrat.builder().labelContrat("35h/semaine").planing(planing1).build();
        Employe e1 = Employe.builder()
                .nomEmploye("Pinho")
                .prenomEmploye("Jonathan")
                .dateNaissanceEmploye(LocalDate.of(1992,12, 11))
                .contrat(null)
                .build();
        repository.save(e1);

        Ville ville = Ville.builder().nomVille("Quimper").codePostalVille("29000").build();
        repository.save(ville);

        Chambre chambre = Chambre.builder().numeroChambre(103).surfaceChambre(63.2).maxResidentChambre(2).patientsChambre(new ArrayList<>()).build();
        repository.save(chambre);

        Hebergement h = Hebergement.builder()
                .nomHebergement("Résidence pasepais")
                .villeHebergement(ville)
                .chambresHebergement(List.of(chambre))
                .build();
        manager.add(h);

        Patient p1 = Patient.builder()
                .nomPatient("DeLaQuenelle")
                .prenomPatient("Jean")
                .sexePatient("M")
                .nirPatient("1234566898")
                .dateNaissancePatient(LocalDate.of(1956, 3, 12))
                .build();
        p1.setChambrePatient(chambre);
        manager.add(p1);

        System.out.println("p1 = " + p1);

//        manager.findBy(Patient.class, "nom", "=", "PINHO");

    }
}
