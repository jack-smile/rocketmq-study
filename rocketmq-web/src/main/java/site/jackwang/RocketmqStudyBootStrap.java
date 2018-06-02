package site.jackwang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;

/**
 * @author wangjie<http://www.jackwang.site/>
 * @date 2018/6/2
 */
@SpringBootApplication
public class RocketmqStudyBootStrap implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {
    private static int port = 8888;

    public static void main(String[] args) {
        if (args != null && args.length > 0) {
            port = Integer.valueOf(args[0]);
        }

        SpringApplication.run(RocketmqStudyBootStrap.class, args);
    }

    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {
        factory.setPort(port);
    }
}
