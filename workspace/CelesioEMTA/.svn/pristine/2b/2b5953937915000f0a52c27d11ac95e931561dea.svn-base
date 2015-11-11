package api.domain.enums.user;

import org.codehaus.jackson.annotate.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings(value = "unused")
@XmlType
@XmlEnum
public enum Gender {

    @XmlEnumValue("male")
    MALE("male"),
    @XmlEnumValue("female")
    FEMALE("female");

    private String value;

    Gender(String value) {
        this.value = value;
    }

    public static Gender fromValue(String value) {
        for (Gender type : Gender.values()) {
            if (type.value.equalsIgnoreCase(value)) {
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
