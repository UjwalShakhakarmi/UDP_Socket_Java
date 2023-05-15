import java.io.IOException;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramsocket = new DatagramSocket();
        String Message = "Hello Vai";
        //local host string ma vako ley hamiley change gareko
        InetAddress address = InetAddress.getByName("localhost");

        //sending message using packets
        DatagramPacket packet = new DatagramPacket(Message.getBytes(),Message.length(),address,12345);
        //send the message in port number

        datagramsocket.send(packet);
        datagramsocket.close();
    }
}