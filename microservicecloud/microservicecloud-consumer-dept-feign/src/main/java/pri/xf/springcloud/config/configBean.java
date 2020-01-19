package pri.xf.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class configBean {


    @Bean
    @LoadBalanced  //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端 负载均衡的工具
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

/*    @Bean
    public IRule myRule() {
//        return new RoundRobinRule(); //默认轮询算法
//        return new RandomRule(); //随机算法代替默认轮询算法
        return new RetryRule(); //重试算法
    }*/
}
