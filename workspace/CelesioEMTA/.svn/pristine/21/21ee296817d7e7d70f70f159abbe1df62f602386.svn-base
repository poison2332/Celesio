package api.domain.enums.user;

import org.codehaus.jackson.annotate.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings(value = "unused")
@XmlType
@XmlEnum
public enum PrimarySportType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("run")
    RUN("run"),
    @XmlEnumValue("walk")
    WALK("walk"),
    @XmlEnumValue("cycle")
    CYCLE("cycle"),
    @XmlEnumValue("golf")
    GOLF("golf"),
    @XmlEnumValue("soccer")
    SOCCER("soccer"),
    @XmlEnumValue("americanFootball")
    AMERICAN_FOOTBALL("americanFootball"),
    @XmlEnumValue("tennis")
    TENNIS("tennis"),
    @XmlEnumValue("swimming")
    SWIMMING("swimming"),
    @XmlEnumValue("squash")
    SQUASH("squash"),
    @XmlEnumValue("basketball")
    BASKETBALL("basketball"),
    @XmlEnumValue("weightTraining")
    WEIGHT_TRAINING("weightTraining"),
    @XmlEnumValue("skiingBoarding")
    SKIING_BOARDING("skiingBoarding"),
    @XmlEnumValue("hiking")
    HIKING("hiking"),
    @XmlEnumValue("nordicSkiing")
    NORDIC_SKIING("nordicSkiing"),
    @XmlEnumValue("strengthAndFlexibility")
    STRENGTH_AND_FLEXIBILITY("strengthAndFlexibility"),
    @XmlEnumValue("handball")
    HANDBALL("handball"),
    @XmlEnumValue("rugby")
    RUGBY("rugby"),
    @XmlEnumValue("hockey")
    HOCKEY("hockey");

    private String value;

    PrimarySportType(String value) {
        this.value = value;
    }

    public static PrimarySportType fromValue(String value) {
        for (PrimarySportType type : PrimarySportType.values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException();
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }
}
