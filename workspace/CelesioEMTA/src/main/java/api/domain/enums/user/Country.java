package api.domain.enums.user;

import org.codehaus.jackson.annotate.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings(value = "unused")
@XmlType
@XmlEnum
public enum Country {

    @XmlEnumValue("GB")
    UNITED_KINGDOM("GB", "United Kingdom");

    private String value;
    private String fullValue;

    Country(String value, String fullValue) {
        this.value = value;
        this.fullValue = fullValue;
    }

    public static Country fromValue(String value) {
        for (Country type : Country.values()) {
            if (type.value.equals(value) || type.fullValue.equals(value)) {
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
