package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    private final String name;
    List<FileSystem> fileSystems;
    public Directory(String name, List<FileSystem> fileSystems) {
        this.name = name;
        this.fileSystems = fileSystems;
    }

    @Override
    public void ls() {
        System.out.println("Directory name: "+name);
        for(FileSystem fileSystem : fileSystems) {
            fileSystem.ls();
        }
    }
}
