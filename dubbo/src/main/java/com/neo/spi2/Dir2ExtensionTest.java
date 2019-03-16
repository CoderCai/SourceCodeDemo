package com.neo.spi2;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class Dir2ExtensionTest {

    public static void main(String[] args){
        ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(Dir2Extension.class);
        Dir2Extension dirExtension = (Dir2Extension)extensionLoader.getAdaptiveExtension();

        String type = null;

        //type = SpiConstants.DIR2_DEFAULT;
        //type = SpiConstants.DIR2_FIRST;

        System.out.println(dirExtension.sayHello("qbb2", type));
    }
}
