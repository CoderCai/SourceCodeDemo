package com.neo.spi2;

import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.neo.spi.SpiConstants;

@Adaptive
public class Dir2ExtensionAdaptive implements Dir2Extension {


    @Override
    public String sayHello(String name, String type) {
        ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(Dir2Extension.class);
        Dir2Extension dir2Extension = (Dir2Extension)extensionLoader.getDefaultExtension();

        if (type != null && SpiConstants.DIR2_FIRST.equalsIgnoreCase(type.trim())) {
            dir2Extension = (Dir2ExtensionDefaultImpl)extensionLoader.getExtension(SpiConstants.DIR2_FIRST);
        }

        return dir2Extension.sayHello(name, type);
    }

}

