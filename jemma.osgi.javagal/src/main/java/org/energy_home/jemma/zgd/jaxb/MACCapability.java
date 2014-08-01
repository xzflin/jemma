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
 * <p>Java class for MACCapability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MACCapability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlternatePanCoordinator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DeviceIsFFD" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MainsPowered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ReceiverOnWhenIdle" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SecuritySupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AllocateAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MACCapability", propOrder = {
    "alternatePanCoordinator",
    "deviceIsFFD",
    "mainsPowered",
    "receiverOnWhenIdle",
    "securitySupported",
    "allocateAddress"
})
public class MACCapability implements Serializable{

    @XmlElement(name = "AlternatePanCoordinator")
    protected boolean alternatePanCoordinator;
    @XmlElement(name = "DeviceIsFFD")
    protected boolean deviceIsFFD;
    @XmlElement(name = "MainsPowered")
    protected boolean mainsPowered;
    @XmlElement(name = "ReceiverOnWhenIdle")
    protected boolean receiverOnWhenIdle;
    @XmlElement(name = "SecuritySupported")
    protected boolean securitySupported;
    @XmlElement(name = "AllocateAddress")
    protected boolean allocateAddress;

    /**
     * Gets the value of the alternatePanCoordinator property.
     * 
     */
    public boolean isAlternatePanCoordinator() {
        return alternatePanCoordinator;
    }

    /**
     * Sets the value of the alternatePanCoordinator property.
     * 
     */
    public void setAlternatePanCoordinator(boolean value) {
        this.alternatePanCoordinator = value;
    }

    /**
     * Gets the value of the deviceIsFFD property.
     * 
     */
    public boolean isDeviceIsFFD() {
        return deviceIsFFD;
    }

    /**
     * Sets the value of the deviceIsFFD property.
     * 
     */
    public void setDeviceIsFFD(boolean value) {
        this.deviceIsFFD = value;
    }

    /**
     * Gets the value of the mainsPowered property.
     * 
     */
    public boolean isMainsPowered() {
        return mainsPowered;
    }

    /**
     * Sets the value of the mainsPowered property.
     * 
     */
    public void setMainsPowered(boolean value) {
        this.mainsPowered = value;
    }

    /**
     * Gets the value of the receiverOnWhenIdle property.
     * 
     */
    public boolean isReceiverOnWhenIdle() {
        return receiverOnWhenIdle;
    }

    /**
     * Sets the value of the receiverOnWhenIdle property.
     * 
     */
    public void setReceiverOnWhenIdle(boolean value) {
        this.receiverOnWhenIdle = value;
    }

    /**
     * Gets the value of the securitySupported property.
     * 
     */
    public boolean isSecuritySupported() {
        return securitySupported;
    }

    /**
     * Sets the value of the securitySupported property.
     * 
     */
    public void setSecuritySupported(boolean value) {
        this.securitySupported = value;
    }

    /**
     * Gets the value of the allocateAddress property.
     * 
     */
    public boolean isAllocateAddress() {
        return allocateAddress;
    }

    /**
     * Sets the value of the allocateAddress property.
     * 
     */
    public void setAllocateAddress(boolean value) {
        this.allocateAddress = value;
    }

}
