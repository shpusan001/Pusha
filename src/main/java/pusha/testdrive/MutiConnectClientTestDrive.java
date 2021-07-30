package pusha.testdrive;

import pusha.configuration.ClientConfiguration;
import pusha.client.manager.ClientManager;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class MutiConnectClientTestDrive {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");
        ClientConfiguration.instance.ip = "211.117.196.83";
        List<ClientManager> clist = new LinkedList<>();
        int count =0;
        for (int i = 0; i < 10000; i++) {
            clist.add(new ClientManager());
        }
        for (ClientManager c : clist) {
            c.connect(ClientConfiguration.instance.ip, ClientConfiguration.instance.port, UUID.randomUUID().toString());
            count++;
            System.out.println(count);
        }

        while (true){}
    }
}