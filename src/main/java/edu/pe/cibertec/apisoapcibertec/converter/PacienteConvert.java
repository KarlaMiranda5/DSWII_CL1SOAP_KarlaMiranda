package edu.pe.cibertec.apisoapcibertec.converter;

import edu.pe.cibertec.apisoapcibertec.model.Paciente;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.ws.objects.Pacientews;

import java.util.ArrayList;
import java.util.List;

@Component
public class PacienteConvert {

    public Paciente PacienteConvertPacienteWsToPaciente(Pacientews pacientews) {

        Paciente paciente = new Paciente();
        paciente.setIdPaciente(pacientews.getIdPaciente());
        paciente.setNomPaciente(pacientews.getNomPaciente());
        paciente.setApePaciente(pacientews.getApePaciente());
        paciente.setDocPaciente(pacientews.getDocPaciente());
        paciente.setFechaNacPaciente(pacientews.getFechaNacPaciente());
        paciente.setEmailPaciente(pacientews.getEmailPaciente());
        return paciente;

    }


    public Pacientews PacienteConvertPacienteWsToPacienteWs(Paciente paciente) {

        Pacientews pacientews = new Pacientews();
        pacientews.setIdPaciente(paciente.getIdPaciente());
        pacientews.setNomPaciente(paciente.getNomPaciente());
        pacientews.setApePaciente(paciente.getApePaciente());
        pacientews.setDocPaciente(paciente.getDocPaciente());
        pacientews.setFechaNacPaciente(paciente.getFechaNacPaciente());
        pacientews.setEmailPaciente(paciente.getEmailPaciente());
        return pacientews;

    }

    public List<Paciente> convertPacienteWsToPaciente(
            List<Pacientews> pacientewsList){
        List<Paciente> pacienteList = new ArrayList<>();
        for (Pacientews pacientews:
                pacientewsList) {
            pacienteList.add((Paciente) convertPacienteWsToPaciente((List<Pacientews>) pacientews));
        }
        return pacienteList;
    }


    public List<Pacientews> convertPacienteToPacienteWs(
            List<Paciente> pacienteList){
        List<Pacientews> pacientewsList = new ArrayList<>();
        for (Paciente paciente:
                pacienteList) {
            pacienteList.add((Paciente) convertPacienteToPacienteWs((List<Paciente>) paciente));
        }
        return pacientewsList;
    }

}
