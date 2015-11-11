
package api.domain.model.user.fitness;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlRootElement;

@Generated("org.jsonschema2pojo")
@XmlRootElement
public class Movement {

    private int packId;
    private int movementId;
    private String url;
    private int load;
    private int reps;


    /**
     * 
     * @return
     *     The packId
     */
    public int getPackId() {
        return packId;
    }

    /**
     * 
     * @param packId
     *     The packId
     */
    public void setPackId(int packId) {
        this.packId = packId;
    }

    /**
     * 
     * @return
     *     The movementId
     */
    public int getMovementId() {
        return movementId;
    }

    /**
     * 
     * @param movementId
     *     The movementId
     */
    public void setMovementId(int movementId) {
        this.movementId = movementId;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The load
     */
    public int getLoad() {
        return load;
    }

    /**
     * 
     * @param load
     *     The load
     */
    public void setLoad(int load) {
        this.load = load;
    }

    /**
     * 
     * @return
     *     The reps
     */
    public int getReps() {
        return reps;
    }

    /**
     * 
     * @param reps
     *     The reps
     */
    public void setReps(int reps) {
        this.reps = reps;
    }



}
