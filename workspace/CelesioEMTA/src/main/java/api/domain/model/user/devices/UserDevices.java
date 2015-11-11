package api.domain.model.user.devices;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class UserDevices {

    private List<UserDevice> items;

    @XmlElement(name = "items")
    public List<UserDevice> getUserDevice() {
        return items;
    }

    public void setUserDevice(List<UserDevice> items) {
        this.items = items;
    }
}
