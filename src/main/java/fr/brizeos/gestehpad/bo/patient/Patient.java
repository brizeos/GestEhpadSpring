package fr.brizeos.gestehpad.bo.patient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import fr.brizeos.gestehpad.bo.hebergement.info.Chambre;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "idPatient")
public class Patient {
    @Id
    @GeneratedValue
    private Long idPatient;
    private String nomPatient;
    private String prenomPatient;
    private String nirPatient;
    private String sexePatient;
    private LocalDate dateNaissancePatient;
    @ManyToOne
    private Chambre chambrePatient;

    public void setChambrePatient(Chambre chambrePatient) {
        chambrePatient.getPatientsChambre().add(this);
        this.chambrePatient = chambrePatient;

    }

    @Override
    public String toString() {
        return "Patient{" +
                "idPatient=" + idPatient +
                ", nomPatient='" + nomPatient + '\'' +
                ", prenomPatient='" + prenomPatient + '\'' +
                ", nirPatient='" + nirPatient + '\'' +
                ", sexePatient='" + sexePatient + '\'' +
                ", dateNaissancePatient=" + dateNaissancePatient +
                ", chambrePatient=" + chambrePatient +
                '}';
    }
}
