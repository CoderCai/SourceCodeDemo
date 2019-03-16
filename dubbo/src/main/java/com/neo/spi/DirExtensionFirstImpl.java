package com.neo.spi;

import com.alibaba.dubbo.common.URL;

public class DirExtensionFirstImpl implements DirExtension {

    @Override
    public String sayHello(URL url, String name) {
        return name + "-first";
    }
}