package api.domain.model.user.devices;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserDevice {

    private int deviceID;
    private String type;

    public int getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
