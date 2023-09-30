package edu.pe.cibertec.apisoapcibertec.repository;

import edu.pe.cibertec.apisoapcibertec.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente,Integer> {

}
