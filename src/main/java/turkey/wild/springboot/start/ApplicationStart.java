package turkey.wild.springboot.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

// Configuration of the application properties.
// SpringBin is created and the application is started.
@EnableAutoConfiguration
@ComponentScan(basePackages = "turkey.wild.springboot")
public class ApplicationStart {
    public static void main(String[] args) {
        // Indicates that it is an application running framewordk SpringBoot
        SpringApplication.run(ApplicationStart.class, args);
    }
}
