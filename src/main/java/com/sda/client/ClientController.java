package com.sda.client;

import java.io.*;
import java.net.Socket;

/**
 * Created by RENT on 2017-07-24.
 */
public class ClientController implements MessageCommand {
    private static final String HOST_ADDRESS = "192.168.16.138";
    private static final Integer PORT = 8080;

    private BufferedReader in;
    private PrintWriter out;

    public ClientController() {
        try {
            initSocket();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void foo(){

    }
    private void initSocket() throws IOException {
        Socket socket = new Socket(HOST_ADDRESS, PORT);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
    }

    @Override
    public void sendMessage(String message) {
        out.println(message);
    }
}