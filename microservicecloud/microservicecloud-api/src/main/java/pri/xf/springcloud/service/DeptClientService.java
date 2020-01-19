package pri.xf.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pri.xf.springcloud.model.Dept;

import java.util.List;

@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface DeptClientService {

    @PostMapping(value = "/dept/add")
    public boolean add(Dept dept) ;

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) ;

    @GetMapping("/dept/list")
    public List<Dept> list();

}
