package pusha.service.default_order.server;

import pusha.log.SoutLog;
import pusha.packet.Packet;
import pusha.server.manager.ServerManager;
import pusha.service.default_order.Order;
import pusha.socket.WrappedSocket;

public class StringPacketUuid implements Order {
    ServerManager serverManager = ServerManager.instance;

    @Override
    public void excute(WrappedSocket wrappedSocket, Object object) {
        Packet packet = (Packet) object;
        wrappedSocket.setSocketId((String) packet.getData());
        serverManager.repository.addOnMap((String) packet.getData(), wrappedSocket);
        new SoutLog(packet.getTag(), "{" + wrappedSocket.getSocketId() + "} is registered").log();
    }
}
