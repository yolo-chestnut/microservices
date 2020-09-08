package priv.ms.dubbo.consumer1;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboConsumer1Application {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumer1Application.class, args);
    }

}
