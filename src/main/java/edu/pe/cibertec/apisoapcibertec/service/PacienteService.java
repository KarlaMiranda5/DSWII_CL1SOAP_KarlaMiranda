package edu.pe.cibertec.apisoapcibertec.service;

import edu.pe.cibertec.apisoapcibertec.model.Paciente;
import edu.pe.cibertec.apisoapcibertec.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;


    public List<Paciente> obtenerPaciente(){

        return pacienteRepository.findAll();
    }

    public Paciente obtenerPacienteXId(Integer id){

        Optional<Paciente> paciente = pacienteRepository.findById(id);

        if (paciente.isEmpty()){
                return null;
        }

        return paciente.get();
    }


    public Paciente guardarPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }





}
