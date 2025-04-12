package com.designpatterns.structural.adaptor;

public class Adaptor {

    Socket socket;
    Adaptor(Socket socket){
        this.socket = socket;
    }

    public int getVolt(){
        return socket.getVolt()/80;
    }
}
