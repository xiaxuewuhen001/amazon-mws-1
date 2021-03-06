
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HardnessUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HardnessUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="brinnell"/>
 *     &lt;enumeration value="vickers"/>
 *     &lt;enumeration value="rockwell_a"/>
 *     &lt;enumeration value="rockwell_b"/>
 *     &lt;enumeration value="rockwell_c"/>
 *     &lt;enumeration value="rockwell_d"/>
 *     &lt;enumeration value="shore_a"/>
 *     &lt;enumeration value="shore_b"/>
 *     &lt;enumeration value="shore_c"/>
 *     &lt;enumeration value="shore_d"/>
 *     &lt;enumeration value="shore_do"/>
 *     &lt;enumeration value="shore_e"/>
 *     &lt;enumeration value="shore_m"/>
 *     &lt;enumeration value="shore_o"/>
 *     &lt;enumeration value="shore_oo"/>
 *     &lt;enumeration value="shore_ooo"/>
 *     &lt;enumeration value="shore_ooo_s"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HardnessUnitOfMeasure")
@XmlEnum
public enum HardnessUnitOfMeasure {

    @XmlEnumValue("brinnell")
    BRINNELL("brinnell"),
    @XmlEnumValue("vickers")
    VICKERS("vickers"),
    @XmlEnumValue("rockwell_a")
    ROCKWELL_A("rockwell_a"),
    @XmlEnumValue("rockwell_b")
    ROCKWELL_B("rockwell_b"),
    @XmlEnumValue("rockwell_c")
    ROCKWELL_C("rockwell_c"),
    @XmlEnumValue("rockwell_d")
    ROCKWELL_D("rockwell_d"),
    @XmlEnumValue("shore_a")
    SHORE_A("shore_a"),
    @XmlEnumValue("shore_b")
    SHORE_B("shore_b"),
    @XmlEnumValue("shore_c")
    SHORE_C("shore_c"),
    @XmlEnumValue("shore_d")
    SHORE_D("shore_d"),
    @XmlEnumValue("shore_do")
    SHORE_DO("shore_do"),
    @XmlEnumValue("shore_e")
    SHORE_E("shore_e"),
    @XmlEnumValue("shore_m")
    SHORE_M("shore_m"),
    @XmlEnumValue("shore_o")
    SHORE_O("shore_o"),
    @XmlEnumValue("shore_oo")
    SHORE_OO("shore_oo"),
    @XmlEnumValue("shore_ooo")
    SHORE_OOO("shore_ooo"),
    @XmlEnumValue("shore_ooo_s")
    SHORE_OOO_S("shore_ooo_s");
    private final String value;

    HardnessUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HardnessUnitOfMeasure fromValue(String v) {
        for (HardnessUnitOfMeasure c: HardnessUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
