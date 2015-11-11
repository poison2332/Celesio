package api.domain.enums.user;

import org.codehaus.jackson.annotate.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings(value = "unused")
@XmlType
@XmlEnum
public enum AccountStatus {

    @XmlEnumValue("version1")
    VERSION_1("version1"),
    @XmlEnumValue("unconfirmedNewAccount")
    UNCONFIRMED_NEW_ACCOUNT("unconfirmedNewAccount"),
    @XmlEnumValue("unconfirmedEmailUpdate")
    UNCONFIRMED_EMAIL_UPDATE("unconfirmedEmailUpdate"),
    @XmlEnumValue("confirmedAccount")
    CONFIRMED_ACCOUNT("confirmedAccount"),
    @XmlEnumValue("mobileGhostAccount")
    MOBILE_GHOST_ACCOUNT("mobileGhostAccount"),
    @XmlEnumValue("version3")
    VERSION_3("version3"),
    @XmlEnumValue("nonMicoachGlobalUser")
    NON_MICOACH_GLOBAL_USER("nonMicoachGlobalUser"),
    @XmlEnumValue("version4")
    VERSION_4("version4"),
    @XmlEnumValue("unconfirmedNonMicoachGlobalUser")
    UNCONFIRMED_NON_MICOACH_GLOBAL_USER("unconfirmedNonMicoachGlobalUser"),
    @XmlEnumValue("inactive")
    INACTIVE("inactive"),
    @XmlEnumValue("unconfirmedMobileUser")
    UNCONFIRMED_MOBILE_USER("unconfirmedMobileUser"),
    @XmlEnumValue("confirmedMobileUser")
    CONFIRMED_MOBILE_USER("confirmedMobileUser");

    private String value;

    AccountStatus(String value) {
        this.value = value;
    }

    public static AccountStatus fromValue(String value) {
        for (AccountStatus type : AccountStatus.values()) {
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
