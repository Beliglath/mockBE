//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.17 at 04:42:00 PM ART 
//


package com.banelco.bp.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminalDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="terminalDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservices.bp.banelco.com/}dto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="canal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datosTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccionIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="terminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terminalDTO", propOrder = {
    "canal",
    "datosTerminal",
    "direccionIP",
    "terminal"
})
public class TerminalDTO
    extends Dto
{

    protected String canal;
    protected String datosTerminal;
    protected String direccionIP;
    protected String terminal;

    /**
     * Gets the value of the canal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanal() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanal(String value) {
        this.canal = value;
    }

    /**
     * Gets the value of the datosTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosTerminal() {
        return datosTerminal;
    }

    /**
     * Sets the value of the datosTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosTerminal(String value) {
        this.datosTerminal = value;
    }

    /**
     * Gets the value of the direccionIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionIP() {
        return direccionIP;
    }

    /**
     * Sets the value of the direccionIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionIP(String value) {
        this.direccionIP = value;
    }

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
    }

}
