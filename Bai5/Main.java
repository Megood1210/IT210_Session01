package Bai5;

import Bai5.config.AppConfig;
import Bai5.model.SystemConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SystemConfig config = context.getBean(SystemConfig.class);
        config.printInfo();
    }
}