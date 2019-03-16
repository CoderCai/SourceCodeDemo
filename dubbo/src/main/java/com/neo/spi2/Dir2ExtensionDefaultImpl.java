package com.neo.spi2;

public class Dir2ExtensionDefaultImpl implements Dir2Extension {

    @Override
    public String sayHello(String name, String type) {
        return "dir2Extension-" + name + "-default";
    }
}
