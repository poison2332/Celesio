package api.domain.enums.user;

import org.codehaus.jackson.annotate.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings(value = "unused")
@XmlType
@XmlEnum
public enum WeekStart {

    @XmlEnumValue("sunday")
    SUNDAY("sunday"),
    @XmlEnumValue("monday")
    MONDAY("monday");

    private String value;

    WeekStart(String value) {
        this.value = value;
    }

    public static WeekStart fromValue(String value) {
        for (WeekStart type : WeekStart.values()) {
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
