package com.designpatterns.structural.adaptor;

public class Client {

    public static void main(String[] args) {

        Socket socket = new SocketImpl();
        Adaptor adaptor = new Adaptor(socket);
        System.out.println("Volt: " + adaptor.getVolt());
    }
}
