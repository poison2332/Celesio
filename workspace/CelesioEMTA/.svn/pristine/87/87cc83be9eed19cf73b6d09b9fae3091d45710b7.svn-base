package api.domain.enums.user;

import org.codehaus.jackson.annotate.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings(value = "unused")
@XmlType
@XmlEnum
public enum SpeedDisplay {

    @XmlEnumValue("pace")
    PACE("pace"),
    @XmlEnumValue("speed")
    SPEED("speed");

    private String value;

    SpeedDisplay(String value) {
        this.value = value;
    }

    public static SpeedDisplay fromValue(String value) {
        for (SpeedDisplay type : SpeedDisplay.values()) {
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
