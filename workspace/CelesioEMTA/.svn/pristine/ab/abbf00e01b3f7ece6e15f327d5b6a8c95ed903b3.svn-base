package api.domain.enums.user;

import org.codehaus.jackson.annotate.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings(value = "unused")
@XmlType
@XmlEnum
public enum TimeFormat {

    @XmlEnumValue("hours12")
    HOURS_12("hours12"),
    @XmlEnumValue("hours24")
    HOURS_24("hours24");

    private String value;

    TimeFormat(String value) {
        this.value = value;
    }

    public static TimeFormat fromValue(String value) {
        for (TimeFormat type : TimeFormat.values()) {
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
