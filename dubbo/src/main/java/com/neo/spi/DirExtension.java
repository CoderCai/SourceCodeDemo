package com.neo.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI("dirDefault")
public interface DirExtension {

    @Adaptive({SpiConstants.DIR_DEFAULT, SpiConstants.DIR_FIRST})
    String sayHello(URL url, String name);
}