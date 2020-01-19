package pri.xf.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pri.xf.springcloud.model.Dept;
import pri.xf.springcloud.service.DeptService;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;


    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") long id) {
        Dept dept = deptService.get(id);
        if (null == dept) {
            throw new RuntimeException("该ID：" + id + "，没用对应的信息！");
        }

        return deptService.get(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> list() {
        return deptService.list();
    }

    public Dept processHystrix_Get(@PathVariable("id") long id) {
        return new Dept().setId(id)
                .setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }

}
