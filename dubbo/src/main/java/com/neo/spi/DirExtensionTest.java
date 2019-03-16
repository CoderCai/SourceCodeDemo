package com.neo.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

public class DirExtensionTest {

    public static void main(String[] args){
        ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(DirExtension.class);
        //DirExtension dirExtension = (DirExtension)extensionLoader.getExtension("dirFirst");
        DirExtension dirExtension = (DirExtension)extensionLoader.getAdaptiveExtension();

        Map<String, String> parameters = new HashMap<String, String>();
        //parameters.put("dirFirst", "dirFirst");
        //parameters.put("dirDefault", "dirDefault");

        URL url = new URL("dubbo", "127.0.0.1", 8089, parameters);

        //dirExtension此时为自动生成的适配器类，可debug看一下它生成的实际内容
        System.out.println(dirExtension.sayHello(url, "qbb"));
    }
}
