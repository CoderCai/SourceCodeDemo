package com.neo.spi2;

public class Dir2ExtensionFirstImpl implements Dir2Extension {

    @Override
    public String sayHello(String name, String type) {
        return "dir2Extension-" + name + "-first";
    }
}

