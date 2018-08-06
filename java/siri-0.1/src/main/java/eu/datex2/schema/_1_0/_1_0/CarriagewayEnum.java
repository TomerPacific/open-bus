//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package eu.datex2.schema._1_0._1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarriagewayEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CarriagewayEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="connectingCarriageway"/>
 *     &lt;enumeration value="entrySlipRoad"/>
 *     &lt;enumeration value="exitSlipRoad"/>
 *     &lt;enumeration value="flyover"/>
 *     &lt;enumeration value="leftHandFeederRoad"/>
 *     &lt;enumeration value="leftHandParallelCarriageway"/>
 *     &lt;enumeration value="mainCarriageway"/>
 *     &lt;enumeration value="oppositeCarriageway"/>
 *     &lt;enumeration value="parallelCarriageway"/>
 *     &lt;enumeration value="rightHandFeederRoad"/>
 *     &lt;enumeration value="rightHandParallelCarriageway"/>
 *     &lt;enumeration value="serviceRoad"/>
 *     &lt;enumeration value="slipRoads"/>
 *     &lt;enumeration value="underpass"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CarriagewayEnum")
@XmlEnum
public enum CarriagewayEnum {


    /**
     * On the connecting carriageway.
     * 
     */
    @XmlEnumValue("connectingCarriageway")
    CONNECTING_CARRIAGEWAY("connectingCarriageway"),

    /**
     * On the entry slip road.
     * 
     */
    @XmlEnumValue("entrySlipRoad")
    ENTRY_SLIP_ROAD("entrySlipRoad"),

    /**
     * On the exit slip road.
     * 
     */
    @XmlEnumValue("exitSlipRoad")
    EXIT_SLIP_ROAD("exitSlipRoad"),

    /**
     * On the flyover.
     * 
     */
    @XmlEnumValue("flyover")
    FLYOVER("flyover"),

    /**
     * On the left hand feeder road.
     * 
     */
    @XmlEnumValue("leftHandFeederRoad")
    LEFT_HAND_FEEDER_ROAD("leftHandFeederRoad"),

    /**
     * On the left hand parrallel carriageway.
     * 
     */
    @XmlEnumValue("leftHandParallelCarriageway")
    LEFT_HAND_PARALLEL_CARRIAGEWAY("leftHandParallelCarriageway"),

    /**
     * On the main carriageway.
     * 
     */
    @XmlEnumValue("mainCarriageway")
    MAIN_CARRIAGEWAY("mainCarriageway"),

    /**
     * On the opposite carriageway.
     * 
     */
    @XmlEnumValue("oppositeCarriageway")
    OPPOSITE_CARRIAGEWAY("oppositeCarriageway"),

    /**
     * On the adjacent parallel carriageway.
     * 
     */
    @XmlEnumValue("parallelCarriageway")
    PARALLEL_CARRIAGEWAY("parallelCarriageway"),

    /**
     * On the right hand feeder road.
     * 
     */
    @XmlEnumValue("rightHandFeederRoad")
    RIGHT_HAND_FEEDER_ROAD("rightHandFeederRoad"),

    /**
     * On the right hand parallel carriageway.
     * 
     */
    @XmlEnumValue("rightHandParallelCarriageway")
    RIGHT_HAND_PARALLEL_CARRIAGEWAY("rightHandParallelCarriageway"),

    /**
     * On the adjacent service road.
     * 
     */
    @XmlEnumValue("serviceRoad")
    SERVICE_ROAD("serviceRoad"),

    /**
     * On the slip roads.
     * 
     */
    @XmlEnumValue("slipRoads")
    SLIP_ROADS("slipRoads"),

    /**
     * On the underpass.
     * 
     */
    @XmlEnumValue("underpass")
    UNDERPASS("underpass");
    private final String value;

    CarriagewayEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarriagewayEnum fromValue(String v) {
        for (CarriagewayEnum c: CarriagewayEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
