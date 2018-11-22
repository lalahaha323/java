/*************************************************************************
	> File Name: MultiChat.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 22时13分11秒
 ************************************************************************/
import java.util.ArrayList;
class Client {
    public final String ip;
    public final String name;
    public Client(String ip, String name) {
        this.ip = ip;
        this.name = name;
    }
}

class ClientEvent {
    private Client client;
    public ClientEvent(Client client) {
        this.client = client;
    }

    public String getName() {
        return client.name;
    }

    public String getIp() {
        return client.ip;
    }
}

interface ClientListener {
    void clientAdded(ClientEvent event);
    void clientRemoved(ClientEvent event);
}

class ClientQueue {
    private ArrayList clients = new ArrayList();
    private ArrayList listeners = new ArrayList();

    public void addClientListener(ClientListener listener) {
        listeners.add(listener);
    }

    public void add(Client client) {
        clients.add(client);
        ClientEvent event = new ClientEvent(client);
        for(int i = 0; i < listeners.size(); i++) {
            ClientListener listener = (ClientListener) listeners.get(i);
            listener.clientAdded(event);
        }
    }

    public void remove(Client client) {
        clients.remove(client);
        ClientEvent event = new ClientEvent(client);
        for(int i = 0; i < listeners.size(); i++) {
            ClientListener listener = (ClientListener) listeners.get(i);
            listener.clientRemoved(event);
        }
    }
}

public class MultiChat {
    public static void main(String[] args) {
        Client c1 = new Client("127.0.0.1", "Caterpillar");
        Client c2 = new Client("192.168.0.2", "Justin");

        ClientQueue queue = new ClientQueue();
        queue.addClientListener(new ClientListener() {
            @Override
            public void clientAdded(ClientEvent event) {
                System.out.printf("%s 从 %s 联机%n",event.getName(), event.getIp());
            }

            @Override
            public void clientRemoved(ClientEvent event) {
                System.out.printf("%s 从 %s 脱机%n",event.getName(), event.getIp());
            }
        });
        queue.add(c1);
        queue.add(c2);
        queue.remove(c1);
        queue.remove(c2);
    }
}

