package org.dows.project;

import io.github.cdimascio.dotenv.Dotenv;
import org.dows.rade.mock.ApiMockProperties;
import org.dows.rade.mock.ControllerMockAspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(scanBasePackages = {"org.dows.project", "org.dows.rade.mock"})
public class ProjectApplication {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure()
                .directory(System.getProperty("user.home"))
                .ignoreIfMissing()
                .load();
        dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));
        SpringApplication.run(ProjectApplication.class, args);
    }
}
