package pri.xf.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pri.xf.springcloud.model.Dept;
import pri.xf.springcloud.service.DeptClientService;

import java.util.List;

@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept) {
        return this.deptClientService.add(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") long id) {
        return this.deptClientService.get(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        return this.deptClientService.list();
    }

}

