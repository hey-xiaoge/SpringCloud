package pri.xf.springcloud.service;

import pri.xf.springcloud.model.Dept;

import java.util.List;


public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
