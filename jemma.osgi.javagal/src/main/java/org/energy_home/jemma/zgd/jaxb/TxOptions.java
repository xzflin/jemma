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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TxOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TxOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecurityEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UseNetworkKey" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Acknowledged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PermitFragmentation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxOptions", propOrder = {
    "securityEnabled",
    "useNetworkKey",
    "acknowledged",
    "permitFragmentation"
})
public class TxOptions implements Serializable{

    @XmlElement(name = "SecurityEnabled")
    protected boolean securityEnabled;
    @XmlElement(name = "UseNetworkKey")
    protected boolean useNetworkKey;
    @XmlElement(name = "Acknowledged")
    protected boolean acknowledged;
    @XmlElement(name = "PermitFragmentation")
    protected boolean permitFragmentation;

    /**
     * Gets the value of the securityEnabled property.
     * 
     */
    public boolean isSecurityEnabled() {
        return securityEnabled;
    }

    /**
     * Sets the value of the securityEnabled property.
     * 
     */
    public void setSecurityEnabled(boolean value) {
        this.securityEnabled = value;
    }

    /**
     * Gets the value of the useNetworkKey property.
     * 
     */
    public boolean isUseNetworkKey() {
        return useNetworkKey;
    }

    /**
     * Sets the value of the useNetworkKey property.
     * 
     */
    public void setUseNetworkKey(boolean value) {
        this.useNetworkKey = value;
    }

    /**
     * Gets the value of the acknowledged property.
     * 
     */
    public boolean isAcknowledged() {
        return acknowledged;
    }

    /**
     * Sets the value of the acknowledged property.
     * 
     */
    public void setAcknowledged(boolean value) {
        this.acknowledged = value;
    }

    /**
     * Gets the value of the permitFragmentation property.
     * 
     */
    public boolean isPermitFragmentation() {
        return permitFragmentation;
    }

    /**
     * Sets the value of the permitFragmentation property.
     * 
     */
    public void setPermitFragmentation(boolean value) {
        this.permitFragmentation = value;
    }

}
