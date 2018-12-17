//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.17 at 04:42:00 PM ART 
//


package com.banelco.bp.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.banelco.bp.webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TransferenciaVirtual_QNAME = new QName("http://webservices.bp.banelco.com/", "transferenciaVirtual");
    private final static QName _TransferenciaVirtualResponse_QNAME = new QName("http://webservices.bp.banelco.com/", "transferenciaVirtualResponse");
    private final static QName _VerificarTransferenciaVirtual_QNAME = new QName("http://webservices.bp.banelco.com/", "verificarTransferenciaVirtual");
    private final static QName _VerificarTransferenciaVirtualResponse_QNAME = new QName("http://webservices.bp.banelco.com/", "verificarTransferenciaVirtualResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.banelco.bp.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransferenciaVirtual }
     * 
     */
    public TransferenciaVirtual createTransferenciaVirtual() {
        return new TransferenciaVirtual();
    }

    /**
     * Create an instance of {@link TransferenciaVirtualResponse }
     * 
     */
    public TransferenciaVirtualResponse createTransferenciaVirtualResponse() {
        return new TransferenciaVirtualResponse();
    }

    /**
     * Create an instance of {@link VerificarTransferenciaVirtual }
     * 
     */
    public VerificarTransferenciaVirtual createVerificarTransferenciaVirtual() {
        return new VerificarTransferenciaVirtual();
    }

    /**
     * Create an instance of {@link VerificarTransferenciaVirtualResponse }
     * 
     */
    public VerificarTransferenciaVirtualResponse createVerificarTransferenciaVirtualResponse() {
        return new VerificarTransferenciaVirtualResponse();
    }

    /**
     * Create an instance of {@link TerminalDTO }
     * 
     */
    public TerminalDTO createTerminalDTO() {
        return new TerminalDTO();
    }

    /**
     * Create an instance of {@link TicketDTO }
     * 
     */
    public TicketDTO createTicketDTO() {
        return new TicketDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferenciaVirtual }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bp.banelco.com/", name = "transferenciaVirtual")
    public JAXBElement<TransferenciaVirtual> createTransferenciaVirtual(TransferenciaVirtual value) {
        return new JAXBElement<TransferenciaVirtual>(_TransferenciaVirtual_QNAME, TransferenciaVirtual.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferenciaVirtualResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bp.banelco.com/", name = "transferenciaVirtualResponse")
    public JAXBElement<TransferenciaVirtualResponse> createTransferenciaVirtualResponse(TransferenciaVirtualResponse value) {
        return new JAXBElement<TransferenciaVirtualResponse>(_TransferenciaVirtualResponse_QNAME, TransferenciaVirtualResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarTransferenciaVirtual }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bp.banelco.com/", name = "verificarTransferenciaVirtual")
    public JAXBElement<VerificarTransferenciaVirtual> createVerificarTransferenciaVirtual(VerificarTransferenciaVirtual value) {
        return new JAXBElement<VerificarTransferenciaVirtual>(_VerificarTransferenciaVirtual_QNAME, VerificarTransferenciaVirtual.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarTransferenciaVirtualResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bp.banelco.com/", name = "verificarTransferenciaVirtualResponse")
    public JAXBElement<VerificarTransferenciaVirtualResponse> createVerificarTransferenciaVirtualResponse(VerificarTransferenciaVirtualResponse value) {
        return new JAXBElement<VerificarTransferenciaVirtualResponse>(_VerificarTransferenciaVirtualResponse_QNAME, VerificarTransferenciaVirtualResponse.class, null, value);
    }

}