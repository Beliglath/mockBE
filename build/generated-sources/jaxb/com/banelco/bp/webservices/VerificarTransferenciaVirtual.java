//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.17 at 04:42:00 PM ART 
//


package com.banelco.bp.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for verificarTransferenciaVirtual complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="verificarTransferenciaVirtual"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="terminal" type="{http://webservices.bp.banelco.com/}terminalDTO" minOccurs="0"/&gt;
 *         &lt;element name="codigoComercio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUITComercio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cbuDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="nroSecuencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificarTransferenciaVirtual", propOrder = {
    "terminal",
    "codigoComercio",
    "cuitComercio",
    "cbuDestino",
    "moneda",
    "importe",
    "nroSecuencia"
})
public class VerificarTransferenciaVirtual {

    protected TerminalDTO terminal;
    protected String codigoComercio;
    @XmlElement(name = "CUITComercio")
    protected String cuitComercio;
    protected String cbuDestino;
    protected String moneda;
    protected double importe;
    protected String nroSecuencia;

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalDTO }
     *     
     */
    public TerminalDTO getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalDTO }
     *     
     */
    public void setTerminal(TerminalDTO value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the codigoComercio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoComercio() {
        return codigoComercio;
    }

    /**
     * Sets the value of the codigoComercio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoComercio(String value) {
        this.codigoComercio = value;
    }

    /**
     * Gets the value of the cuitComercio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUITComercio() {
        return cuitComercio;
    }

    /**
     * Sets the value of the cuitComercio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUITComercio(String value) {
        this.cuitComercio = value;
    }

    /**
     * Gets the value of the cbuDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbuDestino() {
        return cbuDestino;
    }

    /**
     * Sets the value of the cbuDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbuDestino(String value) {
        this.cbuDestino = value;
    }

    /**
     * Gets the value of the moneda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Sets the value of the moneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Gets the value of the importe property.
     * 
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Sets the value of the importe property.
     * 
     */
    public void setImporte(double value) {
        this.importe = value;
    }

    /**
     * Gets the value of the nroSecuencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroSecuencia() {
        return nroSecuencia;
    }

    /**
     * Sets the value of the nroSecuencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroSecuencia(String value) {
        this.nroSecuencia = value;
    }

}