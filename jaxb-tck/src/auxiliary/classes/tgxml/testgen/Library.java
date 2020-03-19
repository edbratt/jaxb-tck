/*
 * Copyright (c) 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.02.28 at 04:17:44 PM MSK 
//


package javasoft.sqe.jaxb.tgxml.testgen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "libraryDocumentation",
    "libraryAttributes",
    "codeSet"
})
@XmlRootElement(name = "Library")
public class Library {

    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "VarID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String varID;
    @XmlAttribute(name = "Inline")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String inline;
    @XmlElement(name = "LibraryDocumentation")
    protected LibraryDocumentation libraryDocumentation;
    @XmlElement(name = "LibraryAttributes")
    protected LibraryAttributes libraryAttributes;
    @XmlElement(name = "CodeSet")
    protected CodeSet codeSet;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the varID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVarID() {
        return varID;
    }

    /**
     * Sets the value of the varID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarID(String value) {
        this.varID = value;
    }

    /**
     * Gets the value of the inline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInline() {
        return inline;
    }

    /**
     * Sets the value of the inline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInline(String value) {
        this.inline = value;
    }

    /**
     * Gets the value of the libraryDocumentation property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryDocumentation }
     *     
     */
    public LibraryDocumentation getLibraryDocumentation() {
        return libraryDocumentation;
    }

    /**
     * Sets the value of the libraryDocumentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryDocumentation }
     *     
     */
    public void setLibraryDocumentation(LibraryDocumentation value) {
        this.libraryDocumentation = value;
    }

    /**
     * Gets the value of the libraryAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryAttributes }
     *     
     */
    public LibraryAttributes getLibraryAttributes() {
        return libraryAttributes;
    }

    /**
     * Sets the value of the libraryAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryAttributes }
     *     
     */
    public void setLibraryAttributes(LibraryAttributes value) {
        this.libraryAttributes = value;
    }

    /**
     * Gets the value of the codeSet property.
     * 
     * @return
     *     possible object is
     *     {@link CodeSet }
     *     
     */
    public CodeSet getCodeSet() {
        return codeSet;
    }

    /**
     * Sets the value of the codeSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeSet }
     *     
     */
    public void setCodeSet(CodeSet value) {
        this.codeSet = value;
    }

}
