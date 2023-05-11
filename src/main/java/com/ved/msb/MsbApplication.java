package com.ved.msb;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class MsbApplication {

    private static final Logger logger = LoggerFactory.getLogger(MsbApplication.class);

    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MsbApplication.class, args);
        Environment env = applicationContext.getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = env.getProperty("server.port");
        String property = env.getProperty("server.servlet.context-path");
        String path = property == null ? "" : property;

        logger.info(
            "\n----------------------------------------------------------\n\t"
                + "Application is running! Access URLs:\n\tLocal: \thttp://localhost:{}{}\n\t"
                + "External: \thttp://{}:{}{}\n" + "----------------------------------------------------------\n",
            port, path, ip, port, path);
    }

}
