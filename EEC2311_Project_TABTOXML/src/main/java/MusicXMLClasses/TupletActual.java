//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.02 at 04:43:05 PM EST 
//


package MusicXMLClasses;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}tuplet-number"/&gt;
 *         &lt;element ref="{}tuplet-type"/&gt;
 *         &lt;element ref="{}tuplet-dot"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tupletNumber",
    "tupletType",
    "tupletDot"
})
@XmlRootElement(name = "tuplet-actual")
public class TupletActual {

    @XmlElement(name = "tuplet-number", required = true)
    protected TupletNumber tupletNumber;
    @XmlElement(name = "tuplet-type", required = true)
    protected TupletType tupletType;
    @XmlElement(name = "tuplet-dot", required = true)
    protected TupletDot tupletDot;

    /**
     * Gets the value of the tupletNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TupletNumber }
     *     
     */
    public TupletNumber getTupletNumber() {
        return tupletNumber;
    }

    /**
     * Sets the value of the tupletNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TupletNumber }
     *     
     */
    public void setTupletNumber(TupletNumber value) {
        this.tupletNumber = value;
    }

    /**
     * Gets the value of the tupletType property.
     * 
     * @return
     *     possible object is
     *     {@link TupletType }
     *     
     */
    public TupletType getTupletType() {
        return tupletType;
    }

    /**
     * Sets the value of the tupletType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TupletType }
     *     
     */
    public void setTupletType(TupletType value) {
        this.tupletType = value;
    }

    /**
     * Gets the value of the tupletDot property.
     * 
     * @return
     *     possible object is
     *     {@link TupletDot }
     *     
     */
    public TupletDot getTupletDot() {
        return tupletDot;
    }

    /**
     * Sets the value of the tupletDot property.
     * 
     * @param value
     *     allowed object is
     *     {@link TupletDot }
     *     
     */
    public void setTupletDot(TupletDot value) {
        this.tupletDot = value;
    }

}
