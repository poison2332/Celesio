package api.domain.enums.user;

import org.codehaus.jackson.annotate.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings(value = "unused")
@XmlType
@XmlEnum
public enum UnitOfWeight {

    @XmlEnumValue("kg")
    KG("kg"),
    @XmlEnumValue("lbs")
    LBS("lbs"),
    @XmlEnumValue("stones")
    STONES("stones");

    private String value;

    UnitOfWeight(String value) {
        this.value = value;
    }

    public static UnitOfWeight fromValue(String value) {
        for (UnitOfWeight type : UnitOfWeight.values()) {
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
