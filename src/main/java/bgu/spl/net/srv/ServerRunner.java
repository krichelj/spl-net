package bgu.spl.net.srv;

import bgu.spl.net.api.BGSMessageEncoderDecoder;
import bgu.spl.net.api.BGSMessagingProtocol;

public class ServerRunner {

    public static void main (String[] args){


        Server.threadPerClient(7777,
                () -> new BGSMessagingProtocol<>(), //protocol factory
                BGSMessageEncoderDecoder::new  //message encoder decoder factory
        ).serve();

        /*int port = 1025;

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true)
            {
                Socket clientSocket = serverSocket.accept();
                clientSocket.getOutputStream().write("Hi my name is Chicka \n".getBytes());
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/



    }
}
