package pusha.packet;

import java.io.Serializable;

public class StringPacket implements Serializable, Packet  {
    String order;
    String tag;
    String message;

    public StringPacket(String tag, String order, String message) {
        tag = tag;
        order = order;
        message = message;
    }

    @Override
    public String getOrder() {
        return order;
    }

    @Override
    public String getTag() {
        return tag;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Object getObject() {
        return null;
    }
}