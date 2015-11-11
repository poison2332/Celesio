package api.domain.model.user.devices;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DeviceSettings {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
