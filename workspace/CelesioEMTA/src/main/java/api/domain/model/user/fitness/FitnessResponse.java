
package api.domain.model.user.fitness;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@XmlRootElement
public class FitnessResponse {

    private FitnessResponse.CoachingMethod coachingMethod;
    private int heightInCentimeters;
    private int weightInGrammes;
    private int maxHr;
    private int peekHr;
    private int vtHr;
    private double maxSpeed;
    private List<IntensityZone> intensityZones = new ArrayList<IntensityZone>();
    private List<Movement> movements = new ArrayList<Movement>();
    private List<Exercise> exercises = new ArrayList<Exercise>();

    /**
     *
     * @return
     *     The coachingMethod
     */
    public FitnessResponse.CoachingMethod getCoachingMethod() {
        return coachingMethod;
    }

    /**
     *
     * @param coachingMethod
     *     The coachingMethod
     */
    public void setCoachingMethod(FitnessResponse.CoachingMethod coachingMethod) {
        this.coachingMethod = coachingMethod;
    }

    /**
     *
     * @return
     *     The heightInCentimeters
     */
    public int getHeightInCentimeters() {
        return heightInCentimeters;
    }

    /**
     *
     * @param heightInCentimeters
     *     The heightInCentimeters
     */
    public void setHeightInCentimeters(int heightInCentimeters) {
        this.heightInCentimeters = heightInCentimeters;
    }

    /**
     *
     * @return
     *     The weightInGrammes
     */
    public int getWeightInGrammes() {
        return weightInGrammes;
    }

    /**
     *
     * @param weightInGrammes
     *     The weightInGrammes
     */
    public void setWeightInGrammes(int weightInGrammes) {
        this.weightInGrammes = weightInGrammes;
    }

    /**
     *
     * @return
     *     The maxHr
     */
    public int getMaxHr() {
        return maxHr;
    }

    /**
     *
     * @param maxHr
     *     The maxHr
     */
    public void setMaxHr(int maxHr) {
        this.maxHr = maxHr;
    }

    /**
     *
     * @return
     *     The peekHr
     */
    public int getPeekHr() {
        return peekHr;
    }

    /**
     *
     * @param peekHr
     *     The peekHr
     */
    public void setPeekHr(int peekHr) {
        this.peekHr = peekHr;
    }

    /**
     *
     * @return
     *     The vtHr
     */
    public int getVtHr() {
        return vtHr;
    }

    /**
     *
     * @param vtHr
     *     The vtHr
     */
    public void setVtHr(int vtHr) {
        this.vtHr = vtHr;
    }

    /**
     *
     * @return
     *     The maxSpeed
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     *
     * @param maxSpeed
     *     The maxSpeed
     */
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     *
     * @return
     *     The intensityZones
     */
    public List<IntensityZone> getIntensityZones() {
        return intensityZones;
    }

    /**
     *
     * @param intensityZones
     *     The intensityZones
     */
    public void setIntensityZones(List<IntensityZone> intensityZones) {
        this.intensityZones = intensityZones;
    }

    /**
     *
     * @return
     *     The movements
     */
    public List<Movement> getMovements() {
        return movements;
    }

    /**
     *
     * @param movements
     *     The movements
     */
    public void setMovements(List<Movement> movements) {
        this.movements = movements;
    }

    /**
     *
     * @return
     *     The exercises
     */
    public List<Exercise> getExercises() {
        return exercises;
    }

    /**
     *
     * @param exercises
     *     The exercises
     */
    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }


    @XmlType
    @XmlEnum
    public static enum CoachingMethod {

        @XmlEnumValue("heartRate")
        HEART_RATE("heartRate"),
        @XmlEnumValue("pace")
        PACE("pace");

        private final String value;
        private static Map<String, FitnessResponse.CoachingMethod> constants = new HashMap<String, FitnessResponse.CoachingMethod>();

        static {
            for (FitnessResponse.CoachingMethod c: values()) {
                constants.put(c.value, c);
            }
        }

        private CoachingMethod(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public static FitnessResponse.CoachingMethod fromValue(String value) {
            FitnessResponse.CoachingMethod constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
