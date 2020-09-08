package priv.ms.dubbo.provider1.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import priv.api.service.FirstDubboService;

@DubboService
public class FirstDubboServiceImpl implements FirstDubboService {

    @Override
    public String hello() {
        return "hello world!";
    }

    @Override
    public String say(String msg) {
        return "provider1，say：" + msg;
    }

}
