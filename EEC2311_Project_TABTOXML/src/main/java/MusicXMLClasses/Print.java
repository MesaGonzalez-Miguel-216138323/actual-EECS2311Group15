//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.02 at 04:43:05 PM EST 
//


package MusicXMLClasses;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}page-layout"/&gt;
 *         &lt;element ref="{}system-layout"/&gt;
 *         &lt;element ref="{}staff-layout"/&gt;
 *         &lt;element ref="{}measure-layout"/&gt;
 *         &lt;element ref="{}measure-numbering"/&gt;
 *         &lt;element ref="{}part-name-display"/&gt;
 *         &lt;element ref="{}part-abbreviation-display"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="blank-page" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="new-page" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="new-system" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="page-number" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="staff-spacing" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pageLayout",
    "systemLayout",
    "staffLayout",
    "measureLayout",
    "measureNumbering",
    "partNameDisplay",
    "partAbbreviationDisplay"
})
@XmlRootElement(name = "print")
public class Print {

    @XmlElement(name = "page-layout", required = true)
    protected PageLayout pageLayout;
    @XmlElement(name = "system-layout", required = true)
    protected SystemLayout systemLayout;
    @XmlElement(name = "staff-layout", required = true)
    protected StaffLayout staffLayout;
    @XmlElement(name = "measure-layout", required = true)
    protected MeasureLayout measureLayout;
    @XmlElement(name = "measure-numbering", required = true)
    protected MeasureNumbering measureNumbering;
    @XmlElement(name = "part-name-display", required = true)
    protected PartNameDisplay partNameDisplay;
    @XmlElement(name = "part-abbreviation-display", required = true)
    protected PartAbbreviationDisplay partAbbreviationDisplay;
    @XmlAttribute(name = "blank-page", required = true)
    protected BigInteger blankPage;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String id;
    @XmlAttribute(name = "new-page", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String newPage;
    @XmlAttribute(name = "new-system", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String newSystem;
    @XmlAttribute(name = "page-number", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String pageNumber;
    @XmlAttribute(name = "staff-spacing", required = true)
    protected BigDecimal staffSpacing;

    /**
     * Gets the value of the pageLayout property.
     * 
     * @return
     *     possible object is
     *     {@link PageLayout }
     *     
     */
    public PageLayout getPageLayout() {
        return pageLayout;
    }

    /**
     * Sets the value of the pageLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageLayout }
     *     
     */
    public void setPageLayout(PageLayout value) {
        this.pageLayout = value;
    }

    /**
     * Gets the value of the systemLayout property.
     * 
     * @return
     *     possible object is
     *     {@link SystemLayout }
     *     
     */
    public SystemLayout getSystemLayout() {
        return systemLayout;
    }

    /**
     * Sets the value of the systemLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemLayout }
     *     
     */
    public void setSystemLayout(SystemLayout value) {
        this.systemLayout = value;
    }

    /**
     * Gets the value of the staffLayout property.
     * 
     * @return
     *     possible object is
     *     {@link StaffLayout }
     *     
     */
    public StaffLayout getStaffLayout() {
        return staffLayout;
    }

    /**
     * Sets the value of the staffLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffLayout }
     *     
     */
    public void setStaffLayout(StaffLayout value) {
        this.staffLayout = value;
    }

    /**
     * Gets the value of the measureLayout property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureLayout }
     *     
     */
    public MeasureLayout getMeasureLayout() {
        return measureLayout;
    }

    /**
     * Sets the value of the measureLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureLayout }
     *     
     */
    public void setMeasureLayout(MeasureLayout value) {
        this.measureLayout = value;
    }

    /**
     * Gets the value of the measureNumbering property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureNumbering }
     *     
     */
    public MeasureNumbering getMeasureNumbering() {
        return measureNumbering;
    }

    /**
     * Sets the value of the measureNumbering property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureNumbering }
     *     
     */
    public void setMeasureNumbering(MeasureNumbering value) {
        this.measureNumbering = value;
    }

    /**
     * Gets the value of the partNameDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link PartNameDisplay }
     *     
     */
    public PartNameDisplay getPartNameDisplay() {
        return partNameDisplay;
    }

    /**
     * Sets the value of the partNameDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartNameDisplay }
     *     
     */
    public void setPartNameDisplay(PartNameDisplay value) {
        this.partNameDisplay = value;
    }

    /**
     * Gets the value of the partAbbreviationDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link PartAbbreviationDisplay }
     *     
     */
    public PartAbbreviationDisplay getPartAbbreviationDisplay() {
        return partAbbreviationDisplay;
    }

    /**
     * Sets the value of the partAbbreviationDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartAbbreviationDisplay }
     *     
     */
    public void setPartAbbreviationDisplay(PartAbbreviationDisplay value) {
        this.partAbbreviationDisplay = value;
    }

    /**
     * Gets the value of the blankPage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBlankPage() {
        return blankPage;
    }

    /**
     * Sets the value of the blankPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBlankPage(BigInteger value) {
        this.blankPage = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

    /**
     * Gets the value of the newPage property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNewPage() {
        return newPage;
    }

    /**
     * Sets the value of the newPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNewPage(java.lang.String value) {
        this.newPage = value;
    }

    /**
     * Gets the value of the newSystem property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNewSystem() {
        return newSystem;
    }

    /**
     * Sets the value of the newSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNewSystem(java.lang.String value) {
        this.newSystem = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPageNumber(java.lang.String value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the staffSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStaffSpacing() {
        return staffSpacing;
    }

    /**
     * Sets the value of the staffSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStaffSpacing(BigDecimal value) {
        this.staffSpacing = value;
    }

}
