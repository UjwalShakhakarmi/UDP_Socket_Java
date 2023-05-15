import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Client {
    public static void main(String[] args) throws IOException
    {
        DatagramSocket socket = new DatagramSocket(12345);
        byte[] data_received = new byte[1024];
        DatagramPacket packet = new DatagramPacket(data_received,data_received.length);
        //receive the message

        socket.receive(packet);
        String message = new String(packet.getData(),0, packet.getLength());
        System.out.println(message);
        socket.close();

    }
}
