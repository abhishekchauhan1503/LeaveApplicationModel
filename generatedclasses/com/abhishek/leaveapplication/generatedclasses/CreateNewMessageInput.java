//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.19 at 06:30:23 PM PDT 
//


package com.abhishek.leaveapplication.generatedclasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="read" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "to",
    "from",
    "content",
    "read"
})
@XmlRootElement(name = "CreateNewMessageInput")
public class CreateNewMessageInput {

    protected long id;
    protected long to;
    protected long from;
    @XmlElement(required = true)
    protected String content;
    protected boolean read;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the to property.
     * 
     */
    public long getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     */
    public void setTo(long value) {
        this.to = value;
    }

    /**
     * Gets the value of the from property.
     * 
     */
    public long getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     */
    public void setFrom(long value) {
        this.from = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the read property.
     * 
     */
    public boolean isRead() {
        return read;
    }

    /**
     * Sets the value of the read property.
     * 
     */
    public void setRead(boolean value) {
        this.read = value;
    }

}
