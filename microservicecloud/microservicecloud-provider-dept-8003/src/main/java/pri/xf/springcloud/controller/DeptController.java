package pri.xf.springcloud.controller;

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
    public Dept get(@PathVariable("id") long id) {
        return deptService.get(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> list() {
        return deptService.list();
    }

}
