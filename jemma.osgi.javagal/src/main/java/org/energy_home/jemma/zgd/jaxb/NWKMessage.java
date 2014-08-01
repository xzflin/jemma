/**
 * This file is part of JEMMA - http://jemma.energy-home.org
 * (C) Copyright 2013 Telecom Italia (http://www.telecomitalia.it)
 *
 * JEMMA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License (LGPL) version 3
 * or later as published by the Free Software Foundation, which accompanies
 * this distribution and is available at http://www.gnu.org/licenses/lgpl.html
 *
 * JEMMA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License (LGPL) for more details.
 *
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.03 at 05:23:14 PM CEST 
//


package org.energy_home.jemma.zgd.jaxb;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for NWKMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NWKMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DstAddressMode" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="Destination" type="{http://www.zigbee.org/GWGSchema}Address"/>
 *         &lt;element name="Nsdu" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *         &lt;element name="NsduHandle" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="Radius" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="NonmemberRadius" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="DiscoverRoute" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="SecurityEnable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NsduLength" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NWKMessage", propOrder = {
    "dstAddressMode",
    "destination",
    "nsdu",
    "nsduHandle",
    "radius",
    "nonmemberRadius",
    "discoverRoute",
    "securityEnable",
    "nsduLength"
})
public class NWKMessage implements Serializable{

    @XmlElement(name = "DstAddressMode")
    @XmlSchemaType(name = "unsignedByte")
    protected short dstAddressMode;
    @XmlElement(name = "Destination", required = true)
    protected Address destination;
    @XmlElement(name = "Nsdu", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] nsdu;
    @XmlElement(name = "NsduHandle")
    @XmlSchemaType(name = "unsignedByte")
    protected short nsduHandle;
    @XmlElement(name = "Radius")
    @XmlSchemaType(name = "unsignedByte")
    protected short radius;
    @XmlElement(name = "NonmemberRadius")
    @XmlSchemaType(name = "unsignedByte")
    protected short nonmemberRadius;
    @XmlElement(name = "DiscoverRoute")
    @XmlSchemaType(name = "unsignedByte")
    protected short discoverRoute;
    @XmlElement(name = "SecurityEnable")
    protected boolean securityEnable;
    @XmlElement(name = "NsduLength")
    @XmlSchemaType(name = "unsignedInt")
    protected long nsduLength;

    /**
     * Gets the value of the dstAddressMode property.
     * 
     */
    public short getDstAddressMode() {
        return dstAddressMode;
    }

    /**
     * Sets the value of the dstAddressMode property.
     * 
     */
    public void setDstAddressMode(short value) {
        this.dstAddressMode = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDestination(Address value) {
        this.destination = value;
    }

    /**
     * Gets the value of the nsdu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getNsdu() {
        return nsdu;
    }

    /**
     * Sets the value of the nsdu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNsdu(byte[] value) {
        this.nsdu = ((byte[]) value);
    }

    /**
     * Gets the value of the nsduHandle property.
     * 
     */
    public short getNsduHandle() {
        return nsduHandle;
    }

    /**
     * Sets the value of the nsduHandle property.
     * 
     */
    public void setNsduHandle(short value) {
        this.nsduHandle = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     */
    public short getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     */
    public void setRadius(short value) {
        this.radius = value;
    }

    /**
     * Gets the value of the nonmemberRadius property.
     * 
     */
    public short getNonmemberRadius() {
        return nonmemberRadius;
    }

    /**
     * Sets the value of the nonmemberRadius property.
     * 
     */
    public void setNonmemberRadius(short value) {
        this.nonmemberRadius = value;
    }

    /**
     * Gets the value of the discoverRoute property.
     * 
     */
    public short getDiscoverRoute() {
        return discoverRoute;
    }

    /**
     * Sets the value of the discoverRoute property.
     * 
     */
    public void setDiscoverRoute(short value) {
        this.discoverRoute = value;
    }

    /**
     * Gets the value of the securityEnable property.
     * 
     */
    public boolean isSecurityEnable() {
        return securityEnable;
    }

    /**
     * Sets the value of the securityEnable property.
     * 
     */
    public void setSecurityEnable(boolean value) {
        this.securityEnable = value;
    }

    /**
     * Gets the value of the nsduLength property.
     * 
     */
    public long getNsduLength() {
        return nsduLength;
    }

    /**
     * Sets the value of the nsduLength property.
     * 
     */
    public void setNsduLength(long value) {
        this.nsduLength = value;
    }

}
