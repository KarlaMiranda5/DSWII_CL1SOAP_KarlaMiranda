package edu.pe.cibertec.apisoapcibertec.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer IdPaciente;

    @Column(name = "NomPaciente")
    private String NomPaciente;

   @Column(name ="ApePaciente")
    private String ApePaciente;

   @Column(name = "DocPaciente")
   private String DocPaciente;

   @Column(name = "FechaNacPaciente")
   private String FechaNacPaciente;

   @Column(name = "EmailPaciente")
   private String EmailPaciente;

}
