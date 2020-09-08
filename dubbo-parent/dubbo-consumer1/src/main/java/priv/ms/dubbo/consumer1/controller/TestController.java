package priv.ms.dubbo.consumer1.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import priv.api.service.FirstDubboService;

@RestController
public class TestController {

    @DubboReference
    private FirstDubboService firstService;

    @GetMapping("/hello")
    public String hello() {
        return firstService.hello();
    }

    @GetMapping("/say1/{msg}")
    public String say1(@PathVariable("msg") String msg) {
        return firstService.say(msg);
    }

}
