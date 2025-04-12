package com.designpatterns.structural.adaptor;

public class SocketImpl implements Socket{
    @Override
    public int getVolt() {
        return 240;
    }
}
