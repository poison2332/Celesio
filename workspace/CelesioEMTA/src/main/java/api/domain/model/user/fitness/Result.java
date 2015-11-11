
package api.domain.model.user.fitness;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Result {

    private int id;
    private String name;
    private String fitnessDateTime;
    private int fitScore;
    private boolean isActive;
    private List<IntensityZone> intensityZones = new ArrayList<IntensityZone>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The fitnessDateTime
     */
    public String getFitnessDateTime() {
        return fitnessDateTime;
    }

    /**
     * 
     * @param fitnessDateTime
     *     The fitnessDateTime
     */
    public void setFitnessDateTime(String fitnessDateTime) {
        this.fitnessDateTime = fitnessDateTime;
    }

    /**
     * 
     * @return
     *     The fitScore
     */
    public int getFitScore() {
        return fitScore;
    }

    /**
     * 
     * @param fitScore
     *     The fitScore
     */
    public void setFitScore(int fitScore) {
        this.fitScore = fitScore;
    }

    /**
     * 
     * @return
     *     The isActive
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * 
     * @param isActive
     *     The isActive
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
