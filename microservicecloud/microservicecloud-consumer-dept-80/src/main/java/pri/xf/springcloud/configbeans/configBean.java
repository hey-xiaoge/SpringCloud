package pri.xf.springcloud.configbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class configBean {


    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
