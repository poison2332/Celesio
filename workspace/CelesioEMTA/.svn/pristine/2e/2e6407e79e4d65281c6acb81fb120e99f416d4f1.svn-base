package api.domain.enums.user;

import org.codehaus.jackson.annotate.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings(value = "unused")
@XmlType
@XmlEnum
public enum FollowersAction {

    @XmlEnumValue("approve")
    APPROVE("approve"),
    @XmlEnumValue("reject")
    REJECT("reject");

    private String value;

    FollowersAction(String value) {
        this.value = value;
    }

    public static FollowersAction fromValue(String value) {
        for (FollowersAction type : FollowersAction.values()) {
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
