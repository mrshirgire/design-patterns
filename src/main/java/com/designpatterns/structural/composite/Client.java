package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<FileSystem> homeFileSystem = new ArrayList<>();
        homeFileSystem.add(new File("home.txt"));
        Directory home = new Directory("home", homeFileSystem);

        List<FileSystem> userFileSystem = new ArrayList<>();
        userFileSystem.add( new File("user.txt"));
        Directory user = new Directory("user", userFileSystem);

        List<FileSystem> rootFileSystem = new ArrayList<>();
        rootFileSystem.add(home);
        rootFileSystem.add(user);
        rootFileSystem.add(new File("root.txt"));

        Directory root = new Directory("root", rootFileSystem);
        root.ls();
    }
}
