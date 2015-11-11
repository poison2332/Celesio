
package api.domain.model.user.fitness;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;

@XmlRootElement
public class IntensityZone {

    private IntensityZone.Zone zone;
    private double lowerPaceBoundary;
    private double upperPaceBoundary;
    private int lowerBpmBoundary;
    private int upperBpmBoundary;


    /**
     *
     * @return
     *     The zone
     */
    public IntensityZone.Zone getZone() {
        return zone;
    }

    /**
     *
     * @param zone
     *     The zone
     */
    public void setZone(IntensityZone.Zone zone) {
        this.zone = zone;
    }

    /**
     *
     * @return
     *     The lowerPaceBoundary
     */
    public double getLowerPaceBoundary() {
        return lowerPaceBoundary;
    }

    /**
     *
     * @param lowerPaceBoundary
     *     The lowerPaceBoundary
     */
    public void setLowerPaceBoundary(double lowerPaceBoundary) {
        this.lowerPaceBoundary = lowerPaceBoundary;
    }

    /**
     *
     * @return
     *     The upperPaceBoundary
     */
    public double getUpperPaceBoundary() {
        return upperPaceBoundary;
    }

    /**
     *
     * @param upperPaceBoundary
     *     The upperPaceBoundary
     */
    public void setUpperPaceBoundary(double upperPaceBoundary) {
        this.upperPaceBoundary = upperPaceBoundary;
    }

    /**
     *
     * @return
     *     The lowerBpmBoundary
     */
    public int getLowerBpmBoundary() {
        return lowerBpmBoundary;
    }

    /**
     *
     * @param lowerBpmBoundary
     *     The lowerBpmBoundary
     */
    public void setLowerBpmBoundary(int lowerBpmBoundary) {
        this.lowerBpmBoundary = lowerBpmBoundary;
    }

    /**
     *
     * @return
     *     The upperBpmBoundary
     */
    public int getUpperBpmBoundary() {
        return upperBpmBoundary;
    }

    /**
     *
     * @param upperBpmBoundary
     *     The upperBpmBoundary
     */
    public void setUpperBpmBoundary(int upperBpmBoundary) {
        this.upperBpmBoundary = upperBpmBoundary;
    }


    @XmlType
    @XmlEnum
    public static enum Zone {
        @XmlEnumValue("none")
        NONE("none"),
        @XmlEnumValue("blue")
        BLUE("blue"),
        @XmlEnumValue("green")
        GREEN("green"),
        @XmlEnumValue("yellow")
        YELLOW("yellow"),
        @XmlEnumValue("red")
        RED("red"),
        @XmlEnumValue("pink")
        PINK("pink"),
        @XmlEnumValue("belowZones")
        BELOW_ZONES("belowZones"),
        @XmlEnumValue("aboveZones")
        ABOVE_ZONES("aboveZones");
        private final String value;
        private static Map<String, IntensityZone.Zone> constants = new HashMap<String, IntensityZone.Zone>();

        static {
            for (IntensityZone.Zone c: values()) {
                constants.put(c.value, c);
            }
        }

        private Zone(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public static IntensityZone.Zone fromValue(String value) {
            IntensityZone.Zone constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
