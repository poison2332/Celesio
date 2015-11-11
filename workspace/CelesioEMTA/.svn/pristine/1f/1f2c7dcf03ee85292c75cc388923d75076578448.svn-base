package api.domain.enums.user;

import org.codehaus.jackson.annotate.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings(value = "unused")
@XmlType
@XmlEnum
public enum UnitOfHeight {

    @XmlEnumValue("cm")
    CM("cm"),
    @XmlEnumValue("inch")
    INCH("inch");

    private String value;

    UnitOfHeight(String value) {
        this.value = value;
    }

    public static UnitOfHeight fromValue(String value) {
        for (UnitOfHeight type : UnitOfHeight.values()) {
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
