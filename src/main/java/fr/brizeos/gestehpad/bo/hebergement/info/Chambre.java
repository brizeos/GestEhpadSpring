package fr.brizeos.gestehpad.bo.hebergement.info;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import fr.brizeos.gestehpad.bo.patient.Patient;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "idChambre")
public class Chambre {

    @Id
    @GeneratedValue
    private Long idChambre;
    private int numeroChambre;
    private double surfaceChambre;
    private int maxResidentChambre;
    @OneToMany
    private List<Patient> patientsChambre = new ArrayList<>();


    @Override
    public String toString() {
        return "Chambre{" +
                "idChambre=" + idChambre +
                ", numeroChambre=" + numeroChambre +
                ", surfaceChambre=" + surfaceChambre +
                ", maxResidentChambre=" + maxResidentChambre +
                ", nombre patientsChambre=" + patientsChambre.size() +
                '}';
    }
}
