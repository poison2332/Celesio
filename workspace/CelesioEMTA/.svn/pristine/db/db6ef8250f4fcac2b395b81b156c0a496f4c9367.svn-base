package api.domain.model;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jettison.mapped.DefaultConverter;

public class AdvancedTypeConverter extends DefaultConverter {
    public AdvancedTypeConverter() {
    }

    public void setEnforce32BitInt(boolean enforce32BitInt) {
        super.setEnforce32BitInt(enforce32BitInt);
    }

    public Object convertToJSONPrimitive(String text) {
        return StringUtils.isBlank(text)?null:super.convertToJSONPrimitive(text);
    }
}
