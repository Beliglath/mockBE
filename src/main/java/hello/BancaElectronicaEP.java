package hello;


import com.banelco.bp.webservices.*;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;
import java.util.Random;


@Endpoint
public class BancaElectronicaEP {

	@PayloadRoot(localPart = "transferenciaVirtual")
	@ResponsePayload
    public JAXBElement<TransferenciaVirtualResponse> transfer(@RequestPayload JAXBElement<TransferenciaVirtual> request) {
		TransferenciaVirtualResponse response = new TransferenciaVirtualResponse();
		TicketDTO ticket = new TicketDTO();
		Random rand = new Random();
        int control = rand.nextInt((9999 - 1000) + 1) + 1000;
		ticket.setNroControl(String.valueOf(control));
		ticket.setFecha("1");
		ticket.setHora("1");
		ticket.setNroTransaccion("1");
		response.setTicket(ticket);
        ObjectFactory objectFactory = new ObjectFactory();
        return objectFactory.createTransferenciaVirtualResponse(response);
	}

    @PayloadRoot(localPart = "verificarTransferenciaVirtual")
    @ResponsePayload
    public JAXBElement<VerificarTransferenciaVirtualResponse> verify(@RequestPayload JAXBElement<VerificarTransferenciaVirtual> request) {
        VerificarTransferenciaVirtualResponse response = new VerificarTransferenciaVirtualResponse();
        TicketDTO ticket = new TicketDTO();
        Random rand = new Random();
        int control = rand.nextInt((9999 - 1000) + 1) + 1000;
        ticket.setNroControl(String.valueOf(control));
        ticket.setFecha("1");
        ticket.setHora("1");
        ticket.setNroTransaccion("1");
        response.setTicket(ticket);
        ObjectFactory objectFactory = new ObjectFactory();
        return objectFactory.createVerificarTransferenciaVirtualResponse(response);
    }
}
