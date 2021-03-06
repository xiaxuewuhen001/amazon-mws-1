
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ToyAwardType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ToyAwardType">
 *   &lt;restriction base="{}MediumStringNotNull">
 *     &lt;enumeration value="australia_toy_fair_boys_toy_of_the_year"/>
 *     &lt;enumeration value="australia_toy_fair_toy_of_the_year"/>
 *     &lt;enumeration value="baby_and_you"/>
 *     &lt;enumeration value="babyworld"/>
 *     &lt;enumeration value="child_magazine"/>
 *     &lt;enumeration value="creative_child_magazine"/>
 *     &lt;enumeration value="dr_toys_100_best_child_products"/>
 *     &lt;enumeration value="energizer_battery_operated_toy_of_the_yr"/>
 *     &lt;enumeration value="family_fun_toy_of_the_year_seal"/>
 *     &lt;enumeration value="games_magazine"/>
 *     &lt;enumeration value="gomama_today"/>
 *     &lt;enumeration value="german_toy_association_toy_of_the_year"/>
 *     &lt;enumeration value="hamleys_toy_of_the_year"/>
 *     &lt;enumeration value="junior"/>
 *     &lt;enumeration value="lion_mark"/>
 *     &lt;enumeration value="mother_and_baby"/>
 *     &lt;enumeration value="mum_knows_best"/>
 *     &lt;enumeration value="national_parenting_approval_award"/>
 *     &lt;enumeration value="norwegian_toy_association_toy_of_the_yr"/>
 *     &lt;enumeration value="oppenheim_toys"/>
 *     &lt;enumeration value="parents_choice_portfolio"/>
 *     &lt;enumeration value="parents_magazine"/>
 *     &lt;enumeration value="practical_parenting"/>
 *     &lt;enumeration value="prima_baby"/>
 *     &lt;enumeration value="reddot"/>
 *     &lt;enumeration value="rdj_france_best_electronic_toy_of_the_yr"/>
 *     &lt;enumeration value="rdj_france_best_toy_of_the_year"/>
 *     &lt;enumeration value="the_times"/>
 *     &lt;enumeration value="toy_wishes"/>
 *     &lt;enumeration value="uk_npd_report_number_one_selling_toy"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ToyAwardType")
@XmlEnum
public enum ToyAwardType {

    @XmlEnumValue("australia_toy_fair_boys_toy_of_the_year")
    AUSTRALIA_TOY_FAIR_BOYS_TOY_OF_THE_YEAR("australia_toy_fair_boys_toy_of_the_year"),
    @XmlEnumValue("australia_toy_fair_toy_of_the_year")
    AUSTRALIA_TOY_FAIR_TOY_OF_THE_YEAR("australia_toy_fair_toy_of_the_year"),
    @XmlEnumValue("baby_and_you")
    BABY_AND_YOU("baby_and_you"),
    @XmlEnumValue("babyworld")
    BABYWORLD("babyworld"),
    @XmlEnumValue("child_magazine")
    CHILD_MAGAZINE("child_magazine"),
    @XmlEnumValue("creative_child_magazine")
    CREATIVE_CHILD_MAGAZINE("creative_child_magazine"),
    @XmlEnumValue("dr_toys_100_best_child_products")
    DR_TOYS_100_BEST_CHILD_PRODUCTS("dr_toys_100_best_child_products"),
    @XmlEnumValue("energizer_battery_operated_toy_of_the_yr")
    ENERGIZER_BATTERY_OPERATED_TOY_OF_THE_YR("energizer_battery_operated_toy_of_the_yr"),
    @XmlEnumValue("family_fun_toy_of_the_year_seal")
    FAMILY_FUN_TOY_OF_THE_YEAR_SEAL("family_fun_toy_of_the_year_seal"),
    @XmlEnumValue("games_magazine")
    GAMES_MAGAZINE("games_magazine"),
    @XmlEnumValue("gomama_today")
    GOMAMA_TODAY("gomama_today"),
    @XmlEnumValue("german_toy_association_toy_of_the_year")
    GERMAN_TOY_ASSOCIATION_TOY_OF_THE_YEAR("german_toy_association_toy_of_the_year"),
    @XmlEnumValue("hamleys_toy_of_the_year")
    HAMLEYS_TOY_OF_THE_YEAR("hamleys_toy_of_the_year"),
    @XmlEnumValue("junior")
    JUNIOR("junior"),
    @XmlEnumValue("lion_mark")
    LION_MARK("lion_mark"),
    @XmlEnumValue("mother_and_baby")
    MOTHER_AND_BABY("mother_and_baby"),
    @XmlEnumValue("mum_knows_best")
    MUM_KNOWS_BEST("mum_knows_best"),
    @XmlEnumValue("national_parenting_approval_award")
    NATIONAL_PARENTING_APPROVAL_AWARD("national_parenting_approval_award"),
    @XmlEnumValue("norwegian_toy_association_toy_of_the_yr")
    NORWEGIAN_TOY_ASSOCIATION_TOY_OF_THE_YR("norwegian_toy_association_toy_of_the_yr"),
    @XmlEnumValue("oppenheim_toys")
    OPPENHEIM_TOYS("oppenheim_toys"),
    @XmlEnumValue("parents_choice_portfolio")
    PARENTS_CHOICE_PORTFOLIO("parents_choice_portfolio"),
    @XmlEnumValue("parents_magazine")
    PARENTS_MAGAZINE("parents_magazine"),
    @XmlEnumValue("practical_parenting")
    PRACTICAL_PARENTING("practical_parenting"),
    @XmlEnumValue("prima_baby")
    PRIMA_BABY("prima_baby"),
    @XmlEnumValue("reddot")
    REDDOT("reddot"),
    @XmlEnumValue("rdj_france_best_electronic_toy_of_the_yr")
    RDJ_FRANCE_BEST_ELECTRONIC_TOY_OF_THE_YR("rdj_france_best_electronic_toy_of_the_yr"),
    @XmlEnumValue("rdj_france_best_toy_of_the_year")
    RDJ_FRANCE_BEST_TOY_OF_THE_YEAR("rdj_france_best_toy_of_the_year"),
    @XmlEnumValue("the_times")
    THE_TIMES("the_times"),
    @XmlEnumValue("toy_wishes")
    TOY_WISHES("toy_wishes"),
    @XmlEnumValue("uk_npd_report_number_one_selling_toy")
    UK_NPD_REPORT_NUMBER_ONE_SELLING_TOY("uk_npd_report_number_one_selling_toy"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ToyAwardType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ToyAwardType fromValue(String v) {
        for (ToyAwardType c: ToyAwardType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
