package com.neo.spi2;

import com.alibaba.dubbo.common.extension.SPI;

@SPI("dir2Default")
public interface Dir2Extension {
    String sayHello(String name, String type);
}
