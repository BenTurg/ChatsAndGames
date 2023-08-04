package ben_turgeman.personal_projects;

import ben_turgeman.personal_projects.Packets.MessagePacket;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;

class ClientsMessages implements Iterable<BlockingQueue<MessagePacket>> {

    private List<BlockingQueue<MessagePacket>> messagesPerClient;
    public Iterator<BlockingQueue<MessagePacket>> iterator() {
        return messagesPerClient.iterator();
    }
}

class Message implements Runnable {
    public Message() {
    }
    @Override
    public void run() {
    }
}

public class Server implements Runnable{
    private ServerSocket _serverSocket;
    private Message _message;

    //constructor for the server class
    public Server(int port) throws IOException {
        try {
            this._serverSocket = new ServerSocket(port);
            this._message = new Message();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void run() {
        //new Thread(this._message).start();


    }
}
