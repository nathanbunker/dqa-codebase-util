//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.12 at 07:33:38 AM MDT 
//


package org.openimmunizationsoftware.dqa.codebase.util.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="code-status">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="deprecated">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="new-code-value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="effective-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="reference">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="link-to" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="codeset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="use-date">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="not-before" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="not-expected-before" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="not-expected-after" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="not-after" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="use-age">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="not-before-month" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="not-after-month" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="concept-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="test-age" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "label",
    "code"
})
@XmlRootElement(name = "codeset")
public class Codeset {

    @XmlElement(required = true)
    protected String label;
    protected List<Codeset.Code> code;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the code property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Codeset.Code }
     * 
     * 
     */
    public List<Codeset.Code> getCode() {
        if (code == null) {
            code = new ArrayList<Codeset.Code>();
        }
        return this.code;
    }


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
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="code-status">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="deprecated">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="new-code-value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="effective-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="reference">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="link-to" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="codeset" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="use-date">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="not-before" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="not-expected-before" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="not-expected-after" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="not-after" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="use-age">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="not-before-month" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="not-after-month" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="concept-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="test-age" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "value",
        "label",
        "description",
        "codeStatus",
        "reference",
        "useDate",
        "useAge",
        "conceptType",
        "testAge"
    })
    public static class Code {

        @XmlElement(required = true)
        protected String value;
        @XmlElement(required = true)
        protected String label;
        @XmlElement(required = true)
        protected String description;
        @XmlElement(name = "code-status", required = true)
        protected Codeset.Code.CodeStatus codeStatus;
        @XmlElement(required = true)
        protected Codeset.Code.Reference reference;
        @XmlElement(name = "use-date", required = true)
        protected Codeset.Code.UseDate useDate;
        @XmlElement(name = "use-age", required = true)
        protected Codeset.Code.UseAge useAge;
        @XmlElement(name = "concept-type", required = true)
        protected String conceptType;
        @XmlElement(name = "test-age", required = true)
        protected String testAge;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the label property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabel() {
            return label;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabel(String value) {
            this.label = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the codeStatus property.
         * 
         * @return
         *     possible object is
         *     {@link Codeset.Code.CodeStatus }
         *     
         */
        public Codeset.Code.CodeStatus getCodeStatus() {
            return codeStatus;
        }

        /**
         * Sets the value of the codeStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link Codeset.Code.CodeStatus }
         *     
         */
        public void setCodeStatus(Codeset.Code.CodeStatus value) {
            this.codeStatus = value;
        }

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link Codeset.Code.Reference }
         *     
         */
        public Codeset.Code.Reference getReference() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link Codeset.Code.Reference }
         *     
         */
        public void setReference(Codeset.Code.Reference value) {
            this.reference = value;
        }

        /**
         * Gets the value of the useDate property.
         * 
         * @return
         *     possible object is
         *     {@link Codeset.Code.UseDate }
         *     
         */
        public Codeset.Code.UseDate getUseDate() {
            return useDate;
        }

        /**
         * Sets the value of the useDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Codeset.Code.UseDate }
         *     
         */
        public void setUseDate(Codeset.Code.UseDate value) {
            this.useDate = value;
        }

        /**
         * Gets the value of the useAge property.
         * 
         * @return
         *     possible object is
         *     {@link Codeset.Code.UseAge }
         *     
         */
        public Codeset.Code.UseAge getUseAge() {
            return useAge;
        }

        /**
         * Sets the value of the useAge property.
         * 
         * @param value
         *     allowed object is
         *     {@link Codeset.Code.UseAge }
         *     
         */
        public void setUseAge(Codeset.Code.UseAge value) {
            this.useAge = value;
        }

        /**
         * Gets the value of the conceptType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConceptType() {
            return conceptType;
        }

        /**
         * Sets the value of the conceptType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConceptType(String value) {
            this.conceptType = value;
        }

        /**
         * Gets the value of the testAge property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTestAge() {
            return testAge;
        }

        /**
         * Sets the value of the testAge property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTestAge(String value) {
            this.testAge = value;
        }


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
         *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="deprecated">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="new-code-value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="effective-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "status",
            "deprecated"
        })
        public static class CodeStatus {

            @XmlElement(required = true)
            protected String status;
            @XmlElement(required = true)
            protected Codeset.Code.CodeStatus.Deprecated deprecated;

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Gets the value of the deprecated property.
             * 
             * @return
             *     possible object is
             *     {@link Codeset.Code.CodeStatus.Deprecated }
             *     
             */
            public Codeset.Code.CodeStatus.Deprecated getDeprecated() {
                return deprecated;
            }

            /**
             * Sets the value of the deprecated property.
             * 
             * @param value
             *     allowed object is
             *     {@link Codeset.Code.CodeStatus.Deprecated }
             *     
             */
            public void setDeprecated(Codeset.Code.CodeStatus.Deprecated value) {
                this.deprecated = value;
            }


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
             *         &lt;element name="new-code-value" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="effective-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "newCodeValue",
                "reason",
                "effectiveDate"
            })
            public static class Deprecated {

                @XmlElement(name = "new-code-value", required = true)
                protected String newCodeValue;
                @XmlElement(required = true)
                protected String reason;
                @XmlElement(name = "effective-date", required = true)
                protected String effectiveDate;

                /**
                 * Gets the value of the newCodeValue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNewCodeValue() {
                    return newCodeValue;
                }

                /**
                 * Sets the value of the newCodeValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNewCodeValue(String value) {
                    this.newCodeValue = value;
                }

                /**
                 * Gets the value of the reason property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReason() {
                    return reason;
                }

                /**
                 * Sets the value of the reason property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReason(String value) {
                    this.reason = value;
                }

                /**
                 * Gets the value of the effectiveDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEffectiveDate() {
                    return effectiveDate;
                }

                /**
                 * Sets the value of the effectiveDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEffectiveDate(String value) {
                    this.effectiveDate = value;
                }

            }

        }


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
         *         &lt;element name="link-to" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="codeset" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "linkTo"
        })
        public static class Reference {

            @XmlElement(name = "link-to")
            protected List<Codeset.Code.Reference.LinkTo> linkTo;

            /**
             * Gets the value of the linkTo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the linkTo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLinkTo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Codeset.Code.Reference.LinkTo }
             * 
             * 
             */
            public List<Codeset.Code.Reference.LinkTo> getLinkTo() {
                if (linkTo == null) {
                    linkTo = new ArrayList<Codeset.Code.Reference.LinkTo>();
                }
                return this.linkTo;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="codeset" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class LinkTo {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "codeset")
                protected String codeset;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the codeset property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeset() {
                    return codeset;
                }

                /**
                 * Sets the value of the codeset property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeset(String value) {
                    this.codeset = value;
                }

            }

        }


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
         *         &lt;element name="not-before-month" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="not-after-month" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "notBeforeMonth",
            "notAfterMonth"
        })
        public static class UseAge {

            @XmlElement(name = "not-before-month", required = true)
            protected String notBeforeMonth;
            @XmlElement(name = "not-after-month", required = true)
            protected String notAfterMonth;

            /**
             * Gets the value of the notBeforeMonth property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNotBeforeMonth() {
                return notBeforeMonth;
            }

            /**
             * Sets the value of the notBeforeMonth property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNotBeforeMonth(String value) {
                this.notBeforeMonth = value;
            }

            /**
             * Gets the value of the notAfterMonth property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNotAfterMonth() {
                return notAfterMonth;
            }

            /**
             * Sets the value of the notAfterMonth property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNotAfterMonth(String value) {
                this.notAfterMonth = value;
            }

        }


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
         *         &lt;element name="not-before" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="not-expected-before" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="not-expected-after" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="not-after" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "notBefore",
            "notExpectedBefore",
            "notExpectedAfter",
            "notAfter"
        })
        public static class UseDate {

            @XmlElement(name = "not-before", required = true)
            protected String notBefore;
            @XmlElement(name = "not-expected-before", required = true)
            protected String notExpectedBefore;
            @XmlElement(name = "not-expected-after", required = true)
            protected String notExpectedAfter;
            @XmlElement(name = "not-after", required = true)
            protected String notAfter;

            /**
             * Gets the value of the notBefore property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNotBefore() {
                return notBefore;
            }

            /**
             * Sets the value of the notBefore property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNotBefore(String value) {
                this.notBefore = value;
            }

            /**
             * Gets the value of the notExpectedBefore property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNotExpectedBefore() {
                return notExpectedBefore;
            }

            /**
             * Sets the value of the notExpectedBefore property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNotExpectedBefore(String value) {
                this.notExpectedBefore = value;
            }

            /**
             * Gets the value of the notExpectedAfter property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNotExpectedAfter() {
                return notExpectedAfter;
            }

            /**
             * Sets the value of the notExpectedAfter property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNotExpectedAfter(String value) {
                this.notExpectedAfter = value;
            }

            /**
             * Gets the value of the notAfter property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNotAfter() {
                return notAfter;
            }

            /**
             * Sets the value of the notAfter property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNotAfter(String value) {
                this.notAfter = value;
            }

        }

    }

}
