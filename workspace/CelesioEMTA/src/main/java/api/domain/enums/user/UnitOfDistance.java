package api.domain.enums.user;

import org.codehaus.jackson.annotate.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings(value = "unused")
@XmlType
@XmlEnum
public enum UnitOfDistance {

    @XmlEnumValue("km")
    KM("km"),
    @XmlEnumValue("miles")
    MILES("miles");

    private String value;

    UnitOfDistance(String value) {
        this.value = value;
    }

    public static UnitOfDistance fromValue(String value) {
        for (UnitOfDistance type : UnitOfDistance.values()) {
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
