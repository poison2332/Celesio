package api.domain.model.user.achievements;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Results {

    private String largeImg;
    private int value;
    private String name;
    private String valueType;
    private int workoutId;
    private String workoutName;
    private String workoutDate;
    private String workoutClassification;
    private String type;
    private String smallImg;
    private String mediumImg;

    public String getLargeImg() {
        return largeImg;
    }

    public void setLargeImg(String largeImg) {
        this.largeImg = largeImg;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public int getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(int workoutId) {
        this.workoutId = workoutId;
    }

    public String getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    public String getWorkoutDate() {
        return workoutDate;
    }

    public void setWorkoutDate(String workoutDate) {
        this.workoutDate = workoutDate;
    }

    public String getWorkoutClassification() {
        return workoutClassification;
    }

    public void setWorkoutClassification(String workoutClassification) {
        this.workoutClassification = workoutClassification;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSmallImg() {
        return smallImg;
    }

    public void setSmallImg(String smallImg) {
        this.smallImg = smallImg;
    }

    public String getMediumImg() {
        return mediumImg;
    }

    public void setMediumImg(String mediumImg) {
        this.mediumImg = mediumImg;
    }
}
