package edu.pe.cibertec.apisoapcibertec.endpoint;

import edu.pe.cibertec.apisoapcibertec.converter.PacienteConvert;
import edu.pe.cibertec.apisoapcibertec.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.GetPacientesRequest;
import pe.edu.cibertec.ws.objects.GetPacientesResponse;
import pe.edu.cibertec.ws.objects.Pacientews;

import java.util.List;

@Endpoint
public class PacienteEndPoint {

    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private PacienteConvert pacienteConvert;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPacientesRequest")
    @ResponsePayload
    public GetPacientesResponse getPacientes(@RequestPayload
                                            GetPacientesRequest request){
        GetPacientesResponse response = new GetPacientesResponse();
        List<Pacientews> domiciliowsList = pacienteConvert
                .convertPacienteToPacienteWs(pacienteRepository.findAll());
        response.getPacientes().addAll(domiciliowsList);
        return response;
    }







}


